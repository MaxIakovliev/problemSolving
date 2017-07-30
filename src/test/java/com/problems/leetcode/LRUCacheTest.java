package com.problems.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Maks on 7/30/2017.
 */
public class LRUCacheTest {

    @Test
    public  void solution1TestCase0() {
        LRUCache lru = new LRUCache(1);
        for(int i=0; i<50; i++){
            lru.put(i,i);
            lru.printOrder();
        }
    }

    @Test
    public  void solution1TestCase0_1() {
        LRUCache lru = new LRUCache(10);
        for(int i=0; i<10; i++){
            lru.put(i,i);
            lru.printOrder();
        }
    }

    @Test
    public  void solution1TestCase0_2() {
        LRUCache lru = new LRUCache(10);
        for(int i=0; i<3; i++){
            lru.put(i,i);
            lru.printOrder();
        }

        for(int i=0; i<3; i++){
            lru.put(i,i);
            lru.printOrder();
        }
    }

    @Test
    public  void solution1TestCase0_3() {
        LRUCache lru = new LRUCache(10);
        for(int i=0; i<3; i++){
            lru.put(i,i);
            lru.printOrder();
        }

        for(int i=0; i<3; i++){
            lru.put(i,i);
            lru.printOrder();
        }

        for(int i=0; i<5; i++){
            lru.put(i,i);
            lru.printOrder();
        }

        for(int i=0; i<3; i++){
            lru.put(i,i);
            lru.printOrder();
        }

        for(int i=0; i<10; i++){
            lru.put(i,i);
            lru.printOrder();
        }

        for(int i=0; i<20; i++){
            lru.put(i,i);
            lru.printOrder();
        }

        for(int i=0; i<10; i++){
            lru.put(i,i);
            lru.printOrder();
        }
    }

    @Test
    public  void solution1TestCase1(){
        LRUCache lru=new LRUCache(2);
        lru.put(1,10);
        int res=lru.get(1);
        Assert.assertEquals(10,res);
        lru.printOrder();

        lru.put(2,20);
        res=lru.get(2);
        Assert.assertEquals(20,res);
        lru.printOrder();

        res=lru.get(1);
        Assert.assertEquals(10,res);
        lru.printOrder();

        res=lru.get(2);
        Assert.assertEquals(20,res);
        lru.printOrder();

        lru.put(3,10);
        lru.printOrder();

        res=lru.get(2);
        Assert.assertEquals(20,res);
        lru.printOrder();
    }

    @Test
    public  void solution1TestCase2(){
        LRUCache lru=new LRUCache(1);
        lru.put(1,10);
        int res=lru.get(1);
        Assert.assertEquals(10,res);
        lru.printOrder();

        res=lru.get(2);
        Assert.assertEquals(-1,res);
        lru.printOrder();

        lru.put(2,20);
        res=lru.get(2);
        Assert.assertEquals(20,res);
        lru.printOrder();

        res=lru.get(1);
        Assert.assertEquals(-1,res);
        lru.printOrder();

        lru.put(1,10);
        res=lru.get(1);
        Assert.assertEquals(10,res);
        lru.printOrder();

    }

    @Test
    public  void solution1TestCase3(){
        LRUCache lru=new LRUCache(3);
        for(int i=0; i<3; i++) {
            lru.put(i, i);
            System.out.print("add "+i+" ");
            lru.printOrder();
        }
        int res=lru.get(0);
        System.out.print("get 0 ");
        Assert.assertEquals(0,res);
        lru.printOrder();

        res=lru.get(1);
        System.out.print("get 1 ");

        Assert.assertEquals(1,res);
        lru.printOrder();

        res=lru.get(2);
        System.out.print("get 2 ");
        Assert.assertEquals(2,res);
        lru.printOrder();

        res=lru.get(40);
        System.out.print("get 40 ");
        Assert.assertEquals(-1,res);
        lru.printOrder();

        //add 5, remove 0
        System.out.println("add 5, remove 0");
        lru.put(5,5);
        lru.printOrder();

        res=lru.get(2);
        System.out.print("get 2 ");
        Assert.assertEquals(2,res);
        lru.printOrder();

        res=lru.get(1);
        System.out.print("get 1 ");
        Assert.assertEquals(1,res);
        lru.printOrder();

        res=lru.get(0);
        System.out.print("get 0 ");
        Assert.assertEquals(-1,res);
        lru.printOrder();

        //add 0, remove 5
        System.out.println("add 6, remove 5");
        lru.put(6,6);
        lru.printOrder();
//
        res=lru.get(0);
        System.out.print("get 0 ");
        Assert.assertEquals(-1,res);
        lru.printOrder();

        res=lru.get(5);
        System.out.print("get 5 ");
        Assert.assertEquals(-1,res);
        lru.printOrder();

        res=lru.get(2);
        System.out.print("get 2 ");
        Assert.assertEquals(2,res);
        lru.printOrder();

        res=lru.get(1);
        System.out.print("get 1 ");
        Assert.assertEquals(1,res);
        lru.printOrder();

        //add 0, remove 6
        System.out.println("add 0, remove 6");
        lru.put(0,0);
        lru.printOrder();

        res=lru.get(1);
        System.out.print("get 1 ");
        Assert.assertEquals(1,res);
        lru.printOrder();
        //duplicated call for 1
        res=lru.get(1);
        System.out.print("get 1 ");
        Assert.assertEquals(1,res);
        lru.printOrder();

        res=lru.get(0);
        System.out.print("get 0 ");
        Assert.assertEquals(0,res);
        lru.printOrder();
    }


    @Test
    public  void solution1LeetCodeTestCase1() {
        LRUCache lru = new LRUCache(2);
        lru.put(2,1);
        System.out.print("put 2,1 ");
        lru.printOrder();

        lru.put(1,1);
        System.out.print("put 1,1 ");
        lru.printOrder();

        lru.put(2,3);
        System.out.print("put 2,3 ");
        lru.printOrder();

        lru.put(4,1);
        System.out.print("put 4,1 ");
        lru.printOrder();

        int res=lru.get(1);
        Assert.assertEquals(-1, res);
        System.out.print("get 1 ");
        lru.printOrder();

        res=lru.get(2);
        Assert.assertEquals(3, res);
        System.out.print("get 2 ");
        lru.printOrder();

    }

    @Test
    public  void solution1LeetCodeTestCase2() {
        LRUCache lru = new LRUCache(2);
        int res = lru.get(2);
        System.out.print("get 2 ");
        Assert.assertEquals(-1, res);
        lru.printOrder();

        lru.put(2,6);
        System.out.print("put 2,6 ");
        lru.printOrder();

        res = lru.get(1);
        System.out.print("get 1 ");
        Assert.assertEquals(-1, res);
        lru.printOrder();

        lru.put(1,5);
        System.out.print("put 1,5 ");
        lru.printOrder();

        lru.put(1,2);
        System.out.print("put 1,2 ");
        lru.printOrder();

        res = lru.get(1);
        System.out.print("get 1 ");
        Assert.assertEquals(2, res);
        lru.printOrder();

        res = lru.get(2);
        System.out.print("get 2 ");
        Assert.assertEquals(6, res);
        lru.printOrder();
    }

    @Test
    public  void solution1LeetCodeTestCase3() {
        LRUCache lru = new LRUCache(10);
        lru.put(10,13);
        System.out.print("put 10,13 ");
        lru.printOrder();

        lru.put(3,17);
        System.out.print("put 3,17 ");
        lru.printOrder();

        lru.put(6,11);
        System.out.print("put 6,11 ");
        lru.printOrder();

        lru.put(10,5);
        System.out.print("put 10,5 ");
        lru.printOrder();

        lru.put(9,10);
        System.out.print("put 9,10 ");
        lru.printOrder();

        int res = lru.get(13);
        System.out.print("get 13 ");
        Assert.assertEquals(-1, res);
        lru.printOrder();

        lru.put(2,19);
        System.out.print("put 2,19 ");
        lru.printOrder();

        res = lru.get(2);
        System.out.print("get 2 ");
        Assert.assertEquals(19, res);
        lru.printOrder();

        res = lru.get(3);
        System.out.print("get 3 ");
        Assert.assertEquals(17, res);
        lru.printOrder();

        lru.put(5,25);
        System.out.print("put 5,25 ");
        lru.printOrder();

        res = lru.get(8);
        System.out.print("get 8 ");
        Assert.assertEquals(-1, res);
        lru.printOrder();

        lru.put(9,22);
        System.out.print("put 9,22 ");
        lru.printOrder();

        lru.put(5,5);
        System.out.print("put 5,5 ");
        lru.printOrder();

        lru.put(1,30);
        System.out.print("put 1,30 ");
        lru.printOrder();

        res = lru.get(11);
        System.out.print("get 11 ");
        Assert.assertEquals(-1, res);
        lru.printOrder();

        lru.put(9,12);
        System.out.print("put 9,12 ");
        lru.printOrder();

        res = lru.get(7);
        System.out.print("get 7 ");
        Assert.assertEquals(-1, res);
        lru.printOrder();

        res = lru.get(5);
        System.out.print("get 5 ");
        Assert.assertEquals(5, res);
        lru.printOrder();

        res = lru.get(8);
        System.out.print("get 8 ");
        Assert.assertEquals(-1, res);
        lru.printOrder();

        res = lru.get(9);
        System.out.print("get 9 ");
        Assert.assertEquals(12, res);
        lru.printOrder();

        lru.put(4,30);
        System.out.print("put 4,30 ");
        lru.printOrder();

        lru.put(9,3);
        System.out.print("put 9,3 ");
        lru.printOrder();

        res = lru.get(9);
        System.out.print("get 9 ");
        Assert.assertEquals(3, res);
        lru.printOrder();

        res = lru.get(10);
        System.out.print("get 10 ");
        Assert.assertEquals(5, res);
        lru.printOrder();


    }
}
