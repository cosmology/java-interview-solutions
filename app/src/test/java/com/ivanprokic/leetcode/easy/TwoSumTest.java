package com.ivanprokic.leetcode.easy;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;

class TwoSumTest {

  @Test
  void test_main_calls_twosum_with_valid_input() {
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outputStream));

    String[] args = new String[0];
    TwoSum.main(args);

    String output = outputStream.toString();
    assertTrue(output.contains("Given elements: [2, 7, 11, 15]"));
    assertTrue(output.contains("return indices that sum up to 26"));
    assertTrue(output.contains("Result: [2, 3]"));

    System.setOut(System.out);
  }

  @Test
  void test_returns_correct_indices_for_sum() {

    TwoSum solution = new TwoSum();
    int[] nums = {2, 7, 11, 15};
    int target = 17;

    int[] result = solution.twoSum(nums, target);

    assertArrayEquals(new int[] {0, 3}, result);
  }

  @Test
  void test_throws_exception_no_solution() {

    TwoSum solution = new TwoSum();
    int[] nums = new int[] {1, 2, 3};
    int target = 7;

    assertThrows(
        IllegalArgumentException.class,
        () -> {
          solution.twoSum(nums, target);
        });
  }
}
