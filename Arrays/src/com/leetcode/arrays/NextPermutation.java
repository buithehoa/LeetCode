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

            if (nums[i - 1] < nums[i]) {
                int anchorIndex = i - 1;
                int anchor = nums[anchorIndex];

                for (int j = nums.length - 1; j > anchorIndex; j--) {
                    if (nums[j] > anchor) {
                        nums[anchorIndex] = nums[j];
                        nums[j] = anchor;

                        Arrays.sort(nums, anchorIndex + 1, nums.length);
                        break outerLoop;
                    }
                }
            }
        }
    }

    public void nextPermutationX(int[] nums) {
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
