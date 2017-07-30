package com.problems.leetcode;

import java.util.HashMap;

/**
 * Created by Maks on 7/30/2017.
 */
public class LRUCache {
     private class LinkedListNode{
         private int key;
         private int val;
         private LinkedListNode prev;
         private LinkedListNode next;
         public LinkedListNode(int key, int val){
             this.key=key;
             this.val=val;
         }

     }

     private class DoubleLinkedList{
         LinkedListNode head;
         private int count;
         private int capacity;
         public DoubleLinkedList(int capacity){
             this.capacity=capacity;
             this.count=0;
         }
         public void insertToHead(int key, int val, HashMap<Integer,Integer> map){
             if (head==null) {
                 head = new LinkedListNode(key, val);
                 count++;
                 head.prev=head;
                 map.put(key,val);
             }
             else {
                 LinkedListNode oldHead=head;
                 head = new LinkedListNode(key, val);
                 head.next=oldHead;
                 head.prev=oldHead.prev;
                 oldHead.prev=head;
                 map.put(key,val);
                 count++;
             }

             if(count>capacity && capacity>1){
                 Integer keyToRemove=head.prev.key;
                 map.remove(keyToRemove);
                 head.prev=head.prev.prev;
                 count--;
             }
             else if(count>capacity && capacity==1){
                 Integer keyToRemove=head.prev.key;
                 map.remove(keyToRemove);
                 head.prev=null;
                 count--;
             }
         }
     }

     private DoubleLinkedList linkedList;
     private HashMap<Integer, Integer> map;

     public  LRUCache(int capacity){
         linkedList=new DoubleLinkedList(capacity);
         map=new HashMap<>();
     }
    public int get(int key) {
         return map.containsKey(key)? map.get(key):-1;
    }

    public void put(int key, int value) {
         linkedList.insertToHead(key,value,map);
    }

}
