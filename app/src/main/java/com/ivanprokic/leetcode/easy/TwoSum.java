package com.ivanprokic.leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
  public static void main(String[] args) {
    int[] nums = new int[] {2, 7, 11, 15};
    int target = 26;

    System.out.print(
        "Given elements: " + Arrays.toString(nums) + " return indices that sum up to " + target);

    int[] result = twoSum(nums, target);

    System.out.print("\n\nResult: " + Arrays.toString(result));
  }

  /**
   * TWO SUM
   *
   * @param nums
   * @param target
   * @return Return indices of two integers that sum up to the target value
   */
  public static int[] twoSum(int[] nums, int target) {

    // single loop, idea to in each iteration store the value preserve map
    // 1, declare Map of integers key value for storing loop number as value and index as key
    // 2. loop through each number of array
    // 3. get current from MAP
    // 4. check the MAP weather that number exists AS A KEY in our map
    // 5. if it exists, we know we found our match and RETURN
    //      - loop index,
    //      - current index
    // 6. PUT in the MAP
    //      - the difference of target to the value in the loop and
    //      - loop index

    // Big O N - linear (single loop run)
    Map<Integer, Integer> complements = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      Integer complementIndex = complements.get(nums[i]);
      if (complementIndex != null) {
        return new int[] {complementIndex, i};
      }
      complements.put(target - nums[i], i);
    }

    throw new IllegalArgumentException("No two sum solution");
  }
}
