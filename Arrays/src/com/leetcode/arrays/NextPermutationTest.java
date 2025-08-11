package com.leetcode.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextPermutationTest {

    @Test
    void nextPermutation_ascendingArray_returnNextPermutation() {
        NextPermutation solution = new NextPermutation();
        int[] nums = {1, 2, 3, 4};
        solution.nextPermutation(nums);

        assertArrayEquals(new int[] {1, 2, 4, 3}, nums);
    }
}