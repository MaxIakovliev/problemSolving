package com.problems.leetcode;

import java.util.ArrayList;

/**
 * Created by Maks on 1/24/2018.
 */
public class RotateList {

    public static void main(String[] args) {
        int i = 1;
        RotateList rl = new RotateList();

        ListNode ln = null;
        ListNode head = null;
        while (i < 3) {
            ListNode cur = new RotateList().new ListNode(i);
            if (ln == null) {
                ln = cur;
                head = cur;
            } else {
                ln.next = cur;
                ln = ln.next;
            }


            i++;
        }
        ListNode t = head;
        while (t != null) {
            System.out.print(" " + t.val);
            t = t.next;
        }
        System.out.println();
        t = rl.rotateRight(head, 9);

        int prev = -1;
        while (t != null) {
            if (prev == t.val) {
                System.out.print("loop detected for " + prev);
                break;
            }
            System.out.print(" " + t.val);
            prev = t.val;

            t = t.next;
        }
    }


    public ListNode rotateRight(ListNode head, int k) {
        if (head == null)
            return head;
        FixedSizeQueue<ListNode> p = new FixedSizeQueue<>(k);
        ListNode oldHead = head;
        if (k <= 0) return head;
        ListNode t = head;
        int count = 0;
        while (t != null) {
            p.push(t);
            t = t.next;
            count++;
        }
        if (count == k)
            return oldHead;

        if (k > count) {
            while (k > count) {
                k = k - count;
            }
            if (count == k)
                return oldHead;

            head = oldHead;
            t = head;
            p = new FixedSizeQueue<>(k);
            while (t != null) {
                p.push(t);
                t = t.next;
            }
        }
        while (p.size() > 0) {
            ListNode tmp = p.popLast();
            tmp.next = head;
            head = tmp;
        }
        ListNode lst = p.getLastRemoved();
        if (lst != null)
            lst.next = null;
        else
            oldHead.next = null;
        return head;
    }


    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    private class FixedSizeQueue<K> extends ArrayList<K> {
        private int _size;

        private K _lastRemoved;

        public FixedSizeQueue(int size) {
            _size = size;

        }

        public void push(K item) {
            super.add(item);
            if (super.size() > _size) {
                _lastRemoved = super.get(0);
                super.removeRange(0, super.size() - _size);
            }
        }

        public K peekLast() {
            return super.get(super.size() - 1);
        }

        public K popLast() {
            K k = super.get(super.size() - 1);
            super.remove(super.size() - 1);
            return k;
        }

        public K getLastRemoved() {
            return _lastRemoved;
        }
    }
}
