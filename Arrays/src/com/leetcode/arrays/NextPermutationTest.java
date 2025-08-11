package com.leetcode.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextPermutationTest {

    @Test
    void nextPermutation_wrongAnswer_returnNextPermutation() {
        NextPermutation solution = new NextPermutation();
        int[] nums = {4,2,0,2,3,2,0};
        solution.nextPermutation(nums);

        assertArrayEquals(new int[] {4,2,0,3,0,2,2}, nums);
    }

    @Test
    void nextPermutation_ascendingArray_returnNextPermutation() {
        NextPermutation solution = new NextPermutation();
        int[] nums = {1, 2, 3, 4};
        solution.nextPermutation(nums);

        assertArrayEquals(new int[] {1, 2, 4, 3}, nums);
    }

    @Test
    void nextPermutation_descendingArray_returnNextPermutation() {
        NextPermutation solution = new NextPermutation();
        int[] nums = {4, 3, 2, 1};
        solution.nextPermutation(nums);

        assertArrayEquals(new int[] {1, 2, 3, 4}, nums);
    }

    @Test
    void nextPermutation_randomArray_returnNextPermutation() {
        NextPermutation solution = new NextPermutation();
        int[] nums = {3, 2, 1, 4};
        solution.nextPermutation(nums);

        assertArrayEquals(new int[] {3, 2, 4, 1}, nums);
    }
}