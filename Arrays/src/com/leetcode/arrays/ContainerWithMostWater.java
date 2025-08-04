package com.leetcode.arrays;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        if (height.length == 0) return 0;

        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;
        int tmpMaxArea;
        boolean continued = true;

        while (continued) {
            tmpMaxArea = Math.min(height[left], height[right]) * (right - left);
            maxArea = Math.max(maxArea, tmpMaxArea);

            if (height[left] >= height[right]) {
                right--;
            } else {
                left++;
            }

            if (left >= right) continued = false;
        }

        return maxArea;
    }
}