package com.repetition;

import java.util.Iterator;

/**
 * Created by Maks on 10/16/2017.
 */
public class Bag<Item> implements Iterable<Item> {

    private class Node<Item> {
        private Item item;
        private Node<Item> next;

        public Node(Item item) {
            this.item = item;
        }

        public void add(Item item) {
            Node<Item> old = next;
            next = new Node<>(item);
            next.next = old;
        }
        public Item get(){
            return this.item;
        }
    }

    private Node<Item> root;
    private int count;


    public void add(Item item) {
        if (root == null)
            root = new Node<Item>(item);
        else
            root.add(item);

        count++;
    }

    public int size() {
        return count;
    }

    public boolean isEmpty() {
        return count == 0;
    }


    @Override
    public Iterator<Item> iterator() {
        return  new BagIterator<Item>(root);
    }

    private class BagIterator<Item> implements Iterator<Item> {

        private Node<Item> current;

        public BagIterator(Node<Item> current) {
            this.current = current;
        }

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public Item next() {
            if(!hasNext()) throw new UnsupportedOperationException();
            Item item=current.item;
            current=current.next;
            return  item;
        }
    }

    public static void main(String[] args) {
        Bag<Integer> bag=new Bag<Integer>();
        for(int i=0; i<11; i++){
            bag.add(i);
        }

        for(Integer b : bag){
            System.out.println(b);
        }
    }
}
