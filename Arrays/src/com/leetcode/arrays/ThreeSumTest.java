package com.leetcode.arrays;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class ThreeSumTest {
    @Test
    void testThreeSumTypical() {
        List<List<Integer>> expected = new ArrayList<List<Integer>>();
        expected.add(Arrays.asList(-1, -1, 2));
        expected.add(Arrays.asList(-1, 0, 1));

        ThreeSum solution = new ThreeSum();
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> actual = solution.threeSum(nums);

        assertTrue(expected.containsAll(actual) && actual.containsAll(expected));
    }
}
