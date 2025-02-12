package com.ivanprokic.leetcode.medium;

import static org.junit.jupiter.api.Assertions.*;

import com.ivanprokic.leetcode.easy.TwoSum;
import com.ivanprokic.util.ListNode;
import org.junit.jupiter.api.Test;

class AddTwoNumbersTest {

  @Test
  void test_add_multi_digit_numbers_with_carry() {
    AddTwoNumbers solution = new AddTwoNumbers();

    ListNode l1 = new ListNode(2);
    l1.next = new ListNode(4);
    l1.next.next = new ListNode(3);

    ListNode l2 = new ListNode(5);
    l2.next = new ListNode(6);
    l2.next.next = new ListNode(4);

    ListNode result = solution.addTwoNumbers(l1, l2);

    assertEquals(7, result.val);
    assertEquals(0, result.next.val);
    assertEquals(8, result.next.next.val);
    assertNull(result.next.next.next);
  }

  @Test
  void test_empty_array_throws_exception() {
    int[] nums = {};
    int target = 5;

    assertThrows(
        IllegalArgumentException.class,
        () -> {
          TwoSum.twoSum(nums, target);
        });
  }
}
