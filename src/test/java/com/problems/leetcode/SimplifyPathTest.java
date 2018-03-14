package com.problems.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Maks on 3/14/2018.
 */
public class SimplifyPathTest {

    @Test
    public  void test1(){
        SimplifyPath sp=new SimplifyPath();
        Assert.assertEquals("/",sp.simplifyPath2("/"));
    }
    @Test
    public  void test2(){
        SimplifyPath sp=new SimplifyPath();
        Assert.assertEquals("/abc",sp.simplifyPath2("/abc"));
    }
    @Test
    public  void test3(){
        SimplifyPath sp=new SimplifyPath();
        Assert.assertEquals("/abc",sp.simplifyPath2("/abc/"));
    }

    @Test
    public  void test4(){
        SimplifyPath sp=new SimplifyPath();
        Assert.assertEquals("/abc",sp.simplifyPath2("/abc/./"));
    }
    @Test
    public  void test5(){
        SimplifyPath sp=new SimplifyPath();
        Assert.assertEquals("/abc/...",sp.simplifyPath2("/abc/..."));
    }

    @Test
    public  void test6(){
        SimplifyPath sp=new SimplifyPath();
        Assert.assertEquals("/",sp.simplifyPath2("/.."));
    }

    @Test
    public  void test7(){
        SimplifyPath sp=new SimplifyPath();
        Assert.assertEquals("/home/foo",sp.simplifyPath2("/home//foo/"));
    }

    @Test
    public  void test8(){
        SimplifyPath sp=new SimplifyPath();
        Assert.assertEquals("/home/foo",sp.simplifyPath2("/home//./foo/"));
    }

    @Test
    public  void test9(){
        SimplifyPath sp=new SimplifyPath();
        Assert.assertEquals("/...",sp.simplifyPath2("/.../"));
    }

    @Test
    public  void test10(){
        SimplifyPath sp=new SimplifyPath();
        Assert.assertEquals("/c",sp.simplifyPath2("/a/./b/../../c/"));
    }

    @Test
    public  void test11(){
        SimplifyPath sp=new SimplifyPath();
        Assert.assertEquals("/",sp.simplifyPath2("/."));
    }

    @Test
    public  void test12(){
        SimplifyPath sp=new SimplifyPath();
        Assert.assertEquals("/..hidden",sp.simplifyPath2("/..hidden"));
    }

    @Test
    public  void test13(){
        SimplifyPath sp=new SimplifyPath();
        Assert.assertEquals("/..hidden",sp.simplifyPath2("/..hidden/"));
    }

    @Test
    public  void test14(){
        SimplifyPath sp=new SimplifyPath();
        Assert.assertEquals("/is/here",sp.simplifyPath2("/home/of/foo/../../bar/../../is/./here/."));
    }

}
