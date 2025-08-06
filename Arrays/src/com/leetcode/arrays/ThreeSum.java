/*
 * https://leetcode.com/problems/3sum?envType=problem-list-v2&envId=n4p5um33
 */
package com.leetcode.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> triplets = new ArrayList<>();
        Arrays.sort(nums);

        int left, right, sum;
        List<Integer> triplet;
        for (int i = 0; i < nums.length - 2; i++) {
            boolean continued = true;
            left = i + 1;
            right = nums.length - 1;

            while (continued) {
                sum = nums[i] + nums[left] + nums[right];

                if (sum > 0) {
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    triplet = Arrays.asList(nums[i], nums[left], nums[right]);
                    if (! triplets.contains(triplet)) triplets.add(triplet);

                    left++;
                }

                if (left == right) continued = false;
            }
        }

        return triplets;
    }
}
