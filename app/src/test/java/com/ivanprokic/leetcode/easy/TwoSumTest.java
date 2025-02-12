package com.ivanprokic.leetcode.easy;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class TwoSumTest {

  @Test
  void test_returns_correct_indices_for_sum() {
    int[] nums = {2, 7, 11, 15};
    int target = 17;

    int[] result = TwoSum.twoSum(nums, target);

    assertArrayEquals(new int[] {0, 3}, result);
  }
}
