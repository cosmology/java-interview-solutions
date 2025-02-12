package com.ivanprokic.leetcode.medium;

import com.ivanprokic.util.ListNode;

public class AddTwoNumbers {

  public static void main(String[] args) {

    AddTwoNumbers solution1 = new AddTwoNumbers();

    ListNode l1 = new ListNode(2);
    l1.next = new ListNode(4);
    l1.next.next = new ListNode(3);

    ListNode l2 = new ListNode(5);
    l2.next = new ListNode(6);
    l2.next.next = new ListNode(4);

    ListNode listNode = solution1.addTwoNumbers(l1, l2);

    System.out.print("[ ");
    while (listNode != null) {
      System.out.print(" " + listNode.val);

      if (listNode.next != null) {
        System.out.print(",");
      }

      listNode = listNode.next;
    }
    System.out.print(" ]");
  }

  /**
   * TWO SUM
   *
   * <p>You are given two non-empty linked lists representing two non-negative integers. The digits
   * are stored in reverse order, and each of their nodes contains a single digit. Add the two
   * numbers and return the sum as a linked list.
   *
   * @param ListNode l1
   * @param ListNode l2
   * @return Return the sum as a linked list
   */
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

    // create a placeholder
    ListNode dummyHead = new ListNode(0);
    ListNode tail = dummyHead;
    int carry = 0;

    while (l1 != null || l2 != null || carry != 0) {
      int digit1 = (l1 != null) ? l1.val : 0;
      int digit2 = (l2 != null) ? l2.val : 0;

      int sum = digit1 + digit2 + carry;
      int digit = sum % 10;
      carry = sum / 10;

      ListNode newNode = new ListNode(digit);
      tail.next = newNode;
      tail = tail.next;

      l1 = (l1 != null) ? l1.next : null;
      l2 = (l2 != null) ? l2.next : null;
    }

    ListNode result = dummyHead.next;
    dummyHead.next = null;
    return result;
  }
}
