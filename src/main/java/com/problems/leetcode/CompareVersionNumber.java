package com.problems.leetcode;

import java.util.regex.Pattern;

/**
 * Created by Maks on 1/4/2018.
 */
public class CompareVersionNumber {

    public int compareVersion(String version1, String version2) {
        String[] v1=version1.split(Pattern.quote("."));
        String[] v2=version2.split(Pattern.quote("."));
        int min=Math.min(v1.length, v2.length);

        int res=0;
        for(int i=0; i<min; i++){
            if(res!=0)
                break;
            int t1=getNumber(v1[i]);
            int t2=getNumber(v2[i]);

            if (t1==t2){
                continue;
            }
            if(t1>t2){
                res++;
                continue;
            }
            if (t1<t2){
                res--;
                continue;
            }
        }

        if(v1.length>min && res==0){
            for(int i=min; i<v1.length; i++){
                int tmp=getNumber(v1[i]);
                if(tmp>0)
                    return 1;
            }
        } else if(v2.length>min && res==0){
            res=0;
            for(int i=min; i<v2.length; i++){
                int tmp=getNumber(v2[i]);
                if(tmp>0)
                    return -1;
            }
        }

        if(res>0)
            return 1;
        if(res<0)
            return  -1;

        return 0;
    }
    private int getNumber(String s){
        int res=0;
        int numPos=-1;
        for(int i=0; i< s.length(); i++){
            int tmp=((int)s.charAt(i)-'0');
            if(tmp==0 && numPos<0)//ignore 0 at the start of string
                continue;
            res=res*10+tmp;
            numPos=i;
        }
        return  res;
    }

    public static void main(String[] args) {
        CompareVersionNumber c = new CompareVersionNumber();
        System.out.println("exp -1, actual: " + c.compareVersion("0.0.01", "0.0.1001"));
        System.out.println("exp 0, actual: " + c.compareVersion("0.0.01", "0.0.01"));
        System.out.println("exp -1, actual: " + c.compareVersion("0.0.01", "0.0.01009"));
        System.out.println("exp 1, actual: " + c.compareVersion("0.0.0100009.0001", "0.0.01"));
        System.out.println("exp 0, actual: " + c.compareVersion("01", "1"));
        System.out.println("exp 0, actual: " + c.compareVersion("1", "01"));
        System.out.println("exp 0, actual: " + c.compareVersion("01", "01"));
        System.out.println("exp 1, actual: " + c.compareVersion("1", "0"));
        System.out.println("exp -1, actual: " + c.compareVersion("1.1", "1.10"));
        System.out.println("exp 1, actual: " + c.compareVersion("1.10", "1.1"));
        System.out.println("exp -1, actual: " + c.compareVersion("1.2", "1.10"));
        System.out.println("exp 1, actual: " + c.compareVersion("1.10", "1.2"));
        System.out.println("exp -1, actual: " + c.compareVersion("0.1", "1.0"));
        System.out.println("exp 1, actual: " + c.compareVersion("1.0", "0.1.0.0.01"));
        System.out.println("exp 1, actual: " + c.compareVersion("0.1", "0.0.1"));
        System.out.println("exp 0, actual: " + c.compareVersion("1.0", "1"));
    }

}
