package com.leetcode.arrays;

import java.util.Arrays;

public class NextPermutation {
    public void nextPermutation(int[] nums) {
        outerLoop:
        for (int i = nums.length - 1; i >= 0; i--) {
            if (i == 0) {
                Arrays.sort(nums);
                break;
            }

            for (int j = i - 1; j >= 0; j--) {
                if (nums[i] > nums[j]) {
                    int tmp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = tmp;

                    Arrays.sort(nums, j + 1, nums.length);
                    break outerLoop;
                }
            }
        }
    }
}
