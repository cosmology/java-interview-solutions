package com.ivanprokic.leetcode.medium;

import static org.junit.jupiter.api.Assertions.*;

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
  void test_add_two_numbers_with_null_first_list() {
    AddTwoNumbers solution = new AddTwoNumbers();
    ListNode l1 = null;
    ListNode l2 = new ListNode(1);
    l2.next = new ListNode(2);
    l2.next.next = new ListNode(3);

    ListNode result = solution.addTwoNumbers(l1, l2);

    assertNotNull(result);
    assertEquals(1, result.val);
    assertEquals(2, result.next.val);
    assertEquals(3, result.next.next.val);
    assertNull(result.next.next.next);
  }

  // Check if second linked list is null
  @Test
  void test_add_two_numbers_with_null_second_list() {
    ListNode l1 = new ListNode(2);
    l1.next = new ListNode(4);
    l1.next.next = new ListNode(3);

    ListNode l2 = null;

    AddTwoNumbers solution = new AddTwoNumbers();
    ListNode result = solution.addTwoNumbers(l1, l2);

    assertNotNull(result);
    assertEquals(2, result.val);
    assertEquals(4, result.next.val);
    assertEquals(3, result.next.next.val);
    assertNull(result.next.next.next);
  }

  @Test
  void test_add_two_numbers_with_carry() {
    ListNode l1 = new ListNode(9);
    l1.next = new ListNode(9);
    ListNode l2 = new ListNode(1);

    AddTwoNumbers solution = new AddTwoNumbers();
    ListNode result = solution.addTwoNumbers(l1, l2);

    assertEquals(0, result.val);
    assertEquals(0, result.next.val);
    assertEquals(1, result.next.next.val);
    assertNull(result.next.next.next);
  }
}
