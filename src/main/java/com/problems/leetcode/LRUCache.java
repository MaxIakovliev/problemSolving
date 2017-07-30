package com.problems.leetcode;

import java.util.HashMap;

/**
 * Created by Maks on 7/30/2017.
 */
public class LRUCache {
    private class LinkedListNode {
        private int key;
        private int val;
        private LinkedListNode prev;
        private LinkedListNode next;

        public LinkedListNode(int key, int val) {
            this.key = key;
            this.val = val;
        }

    }

    private class DoubleLinkedList {
        LinkedListNode head;
        LinkedListNode tail;
        private int count;
        private int capacity;

        public DoubleLinkedList(int capacity) {
            this.capacity = capacity;
            this.count = 0;
        }

        public int get(int key, HashMap<Integer, LinkedListNode> map) {
            if (!map.containsKey(key))
                return -1;

            if(head.key==key){
                return head.val;
            }

            LinkedListNode oldHead=head;

            if(tail!=null && tail.key==key){
                tail=tail.prev;
                if (tail!=null)
                    tail.next=null;
            }
            LinkedListNode tmp=map.get(key);
            if(tmp.prev!=null)
                tmp.prev.next=tmp.next;

            if(tmp.next!=null)
                tmp.next.prev=tmp.prev;
            head=tmp;
            head.next=oldHead;
            head.prev=null;
            oldHead.prev=head;
            map.put(key,head);
            return head.val;

        }

        public void insertToHead(int key, int val, HashMap<Integer, LinkedListNode> map) {
           if(head==null){
               head=new LinkedListNode(key, val);
               count++;
               map.put(key, head);
               return;
           }

            LinkedListNode oldHead= head;
            if(map.containsKey(key)){

                if(head.key==key) {
                    head.val = val;
                    map.put(key, head);
                    return;
                }

                LinkedListNode tmp=map.get(key);
                if(tmp.key==tail.key){// хабираем с хваста
                    tail=tail.prev;
                    tail.next=null;
                }
                else if(tmp.prev!=null)//предыдущий указывать на последующий через текущий
                    tmp.prev.next=tmp.next;

                if(tmp.next!=null)//следующий указывать на предудыщего через текущего
                    tmp.next.prev=tmp.prev;

                tmp.next=oldHead;
                oldHead.prev=tmp;
                tmp.prev=null;
                head=tmp;
                head.val=val;
                map.put(key,head);

            }
            else {
                head=new LinkedListNode(key,val);
                head.next=oldHead;
                oldHead.prev=head;
                count++;
                map.put(key,head);

            }
            if(tail==null)
                tail=oldHead;

            if(count>capacity && capacity>1){
                LinkedListNode preTail=tail.prev;
                int keyToRemove=tail.key;
                map.remove(keyToRemove);

                preTail.next=null;
                tail.prev=null;
                tail=null;
                tail=preTail;
                count--;
            }
            else if(count>capacity && capacity==1){
                int keyToRemove= head.next.key;
                map.remove(keyToRemove);
                head.next=null;
                count--;

            }




        }

        public void printOrder() {
            LinkedListNode tmp = head;
            while (tmp != null) {
                System.out.print(tmp.key);
                tmp = tmp.next;
                if (tmp != null)
                    System.out.print("->");
            }
            System.out.println();
        }
    }

    private DoubleLinkedList linkedList;
    private HashMap<Integer, LinkedListNode> map;

    public LRUCache(int capacity) {
        linkedList = new DoubleLinkedList(capacity);
        map = new HashMap<>();
    }

    public void printOrder() {
        linkedList.printOrder();
    }

    public int get(int key) {
        return linkedList.get(key, map);
    }

    public void put(int key, int value) {
        linkedList.insertToHead(key, value, map);
    }

}
