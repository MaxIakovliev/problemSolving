package com.problems.leetcode;

/**
 * Created by Maks on 12/22/2017.
 */
public class Atoi {
    public int atoi(String s) {
         int sign=-1;
         int numpos=-1;
         int res=0;
         int nonDig=-1;
         for(int i=0; i<s.length();i++){

             if(sign>=0 && s.charAt(sign)=='-' && res>0){
                 res*=-1;
             }

             if ((s.charAt(i)=='-' && sign<0)|| s.charAt(i)=='+'&&sign<0){
                 sign=i;
                 continue;
             }

             if(sign>=0 && s.charAt(i)==' '){
                 return 0;
             }

             if(s.charAt(i)==' ' && numpos<0){
                 nonDig=i;
                 continue;
             }
             if(s.charAt(i)==' ' && numpos>=0 && nonDig<0){
                 return res;
             }

             if(s.charAt(i)==' ' && numpos>0 && nonDig>=0){
                 return 0;
             }

             if(s.charAt(i)-'0'<0 || s.charAt(i)-'0'>9){
                 return res;
             }

             if (s.charAt(i)-'0'>=0 && s.charAt(i)-'0'<=9){
                 int val=s.charAt(i)-'0';
                 numpos=i;
                 if(res>=0){
                     if(res==Integer.MAX_VALUE)
                         continue;
                     int tmp=res;
                     res=res*10+val;
                     if(tmp!=res/10)
                         res=Integer.MAX_VALUE;
                     continue;
                 }
                 if (res<0){
                     if(res==Integer.MIN_VALUE)
                         continue;
                     int min=Integer.MIN_VALUE;
//                     if((min^(res*10-val))<0){
//                         res=Integer.MIN_VALUE;
//                         continue;
//                     }
                     int tmp=res;
                     res=res*10-val;
                     if(tmp!=res/10)
                         res=Integer.MIN_VALUE;
                     continue;
                 }
             }

         }
         if(sign>=0   && s.charAt(sign)=='-' &&  res>0 )
             res*=-1;
         return  res;
    }
}
