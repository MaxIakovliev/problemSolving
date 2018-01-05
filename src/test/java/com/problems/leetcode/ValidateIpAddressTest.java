package com.problems.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Maks on 1/5/2018.
 */
public class ValidateIpAddressTest {

    @Test
    public void ip4Test1(){
        ValidateIpAddress va=new ValidateIpAddress();
        Assert.assertEquals("IPv4",va.validIPAddress("172.16.254.1"));
    }
    @Test
    public void ip4Test2(){
        ValidateIpAddress va=new ValidateIpAddress();
        Assert.assertEquals("Neither",va.validIPAddress("172.016.254.1"));
    }

    @Test
    public void ip4Test3(){
        ValidateIpAddress va=new ValidateIpAddress();
        Assert.assertEquals("Neither",va.validIPAddress("172..254.1"));
    }

    @Test
    public void ip4Test4(){
        ValidateIpAddress va=new ValidateIpAddress();
        Assert.assertEquals("Neither",va.validIPAddress("0.0.0.0"));
    }

    @Test
    public void ip4Test5(){
        ValidateIpAddress va=new ValidateIpAddress();
        Assert.assertEquals("Neither",va.validIPAddress("1000.1.1.1"));
    }

    @Test
    public void ip4Test6(){
        ValidateIpAddress va=new ValidateIpAddress();
        Assert.assertEquals("IPv6",va.validIPAddress("2001:0db8:85a3:0:0:8A2E:0370:7334"));
    }

    @Test
    public void ip4Test7(){
        ValidateIpAddress va=new ValidateIpAddress();
        Assert.assertEquals("Neither",va.validIPAddress("2001:0db8:85a3:0:0:8A2E:0370:7334:"));
    }
    @Test
    public void ip4Test8(){
        ValidateIpAddress va=new ValidateIpAddress();
        Assert.assertEquals("Neither",va.validIPAddress("1.1.1.1."));
    }

    @Test
    public void ip4Test9(){
        ValidateIpAddress va=new ValidateIpAddress();
        Assert.assertEquals("IPv4",va.validIPAddress("192.0.0.1"));
    }

}
