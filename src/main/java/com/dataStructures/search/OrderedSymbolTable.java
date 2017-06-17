package com.dataStructures.search;

import com.dataStructures.search.ISortedSymbolTable;

/**
 * Created by Maks on 2/27/2017.
 */
public class OrderedSymbolTable<Key extends Comparable<Key>, Value>
        implements ISortedSymbolTable<Key,Value> {

    private Node first=null;
    private int _size=0;
    private int _min;
    private int _max;

    public  class Node{
        private Key key;
        private Value val;
        private  Node next;
        public  Node(Key key, Value val, Node next){
            this.key=key;
            this.val=val;
            this.next=next;
        }
    }

    @Override
    public void put(Key key, Value val) {
        for(Node x=first; x!=null; x=x.next){
            if(x.equals(key)){
                x.val=val;
                return;
            }
        }
        first=new Node(key,val, first);
        _size++;
    }

    @Override
    public Value get(Key key) {
        for(Node x=first; x!=null; x=x.next){
            if(x.equals(key))
                return  x.val;
        }
        return  null;
    }

    @Override
    public void delete(Key key) {
        Node prev=first;

        for(Node x=first; x!=null; x=x.next){
            if(x.equals(key)){
                if(key.equals(first.key)){
                    Node tmp=first.next;
                    first.next=null;
                    first=tmp;
                    _size--;
                    return;
                }
                prev=x.next;
                _size--;
                return;
            }
        }
    }

    @Override
    public boolean contains(Key key) {
       for(Node x=first; x!=null; x=x.next){
           if(x.equals(key))
               return  true;
       }
        return false;
    }

    @Override
    public boolean isEmpty() {
        return _size==0;
    }

    @Override
    public int size() {
        return _size;
    }

    @Override
    public Key min() {
        Key min=first.key;
        for(Node x=first; x!=null; x=x.next){
            if(x.key.compareTo(min)<0)
                min=x.key;
        }
        return  min;
    }

    @Override
    public Key max() {
        Key max=first.key;
        for(Node x=first; x!=null; x=x.next){
            if(x.key.compareTo(max)<0)
                max=x.key;
        }
        return  max;
    }

    @Override
    public Key floor(Key key) {
        return null;
    }

    @Override
    public Key ceiling(Key key) {
        return null;
    }

    @Override
    public int rank(Key key) {
        return 0;
    }

    @Override
    public Key select(int k) {
        return null;
    }

    @Override
    public void deleteMin() {

    }

    @Override
    public void deleteMax() {

    }

    @Override
    public int size(Key lo, Key high) {
        return 0;
    }

    @Override
    public Iterable<Key> keys(Key lo, Key high) {
        return null;
    }

    @Override
    public Iterable<Key> keys() {
        return null;
    }
}
