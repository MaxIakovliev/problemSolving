package com.problems.leetcode.TopInterviewQuestions;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MergekSortedLists {
      public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq=new PriorityQueue<>(lists.length, new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return o1.val-o2.val;
            }
        });
        if (lists ==null || lists.length==0){
            return  null;
        }
        ListNode dummy=new ListNode(0);
        ListNode tail=dummy;
        for (ListNode node :lists){
            if (node!=null)
                pq.add(node);
        }

        while (!pq.isEmpty()){
            tail.next=pq.poll();
            tail=tail.next;

            if (tail.next!=null){
                pq.add(tail.next);
            }
        }
        return  dummy.next;


    }
}
