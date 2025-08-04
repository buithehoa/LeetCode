package com.leetcode.arrays;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ContainerWithMostWaterTest {

    @Test
    void testMaxAreaTypical() {
        ContainerWithMostWater solver = new ContainerWithMostWater();
        int[] height = {1,8,6,2,5,4,8,3,7};
        assertEquals(49, solver.maxArea(height));
    }

    @Test
    void testMaxAreaAllSameHeight() {
        ContainerWithMostWater solver = new ContainerWithMostWater();
        int[] height = {5,5,5,5,5};
        assertEquals(20, solver.maxArea(height));
    }

    @Test
    void testMaxAreaDecreasing() {
        ContainerWithMostWater solver = new ContainerWithMostWater();
        int[] height = {5,4,3,2,1};
        assertEquals(6, solver.maxArea(height));
    }

    @Test
    void testMaxAreaTwoElements() {
        ContainerWithMostWater solver = new ContainerWithMostWater();
        int[] height = {1,2};
        assertEquals(1, solver.maxArea(height));
    }

    @Test
    void testMaxAreaSingleElement() {
        ContainerWithMostWater solver = new ContainerWithMostWater();
        int[] height = {7};
        assertEquals(0, solver.maxArea(height));
    }

    @Test
    void testMaxAreaEmpty() {
        ContainerWithMostWater solver = new ContainerWithMostWater();
        int[] height = {};
        assertEquals(0, solver.maxArea(height));
    }
}