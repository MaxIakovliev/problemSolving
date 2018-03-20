package com.problems.leetcode;

/**
 * Created by Maks on 3/20/2018.
 * https://leetcode.com/problems/add-two-numbers/description/
 */
public class AddTwoNumbers {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    /*
    *   Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
        Output: 7 -> 0 -> 8
        Explanation: 342 + 465 = 807.
    * */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int extra = 0;
        ListNode res = null;
        ListNode head = null;
        while (l1 != null || l2 != null || extra > 0) {
            int l1val = l1 != null ? l1.val : 0;
            int l2val = l2 != null ? l2.val : 0;
            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;

            int cur = l1val + l2val + extra;
            if (cur >= 10) {
                extra = 1;
                cur = cur-10;
            } else {
                extra = 0;
            }
            ListNode ln = new ListNode(cur);
            if (res == null) {
                res = ln;
                head = res;
            } else {
                res.next=ln;
                res = res.next;

            }
        }

        if(head==null){
            head=new ListNode(0);
        }


        return head;

    }
}
