package com.problems.geeksforgeeks;

/**
 * Created by Maks on 6/4/2017.
 * http://www.geeksforgeeks.org/ugly-numbers/
 */
public class UglyNumbers {

    public  int getUglyNumber(int num){
        return getKUglyNumber(num);
    }

    private int getKUglyNumber(int num) {
        int i=0;
        int count=0;
        while(count<num){
            i++;
            if(isUgly(i)){
                count++;
            }
        }
        return i;
    }

    private boolean isUgly(int i) {
        i=maxDivide(i,2);
        i=maxDivide(i,3);
        i=maxDivide(i,5);
        return i==1? true:false;
    }

    private int maxDivide(int num, int div) {
        while(num%div==0){
            num=num/div;
        }
        return num;
    }
}
