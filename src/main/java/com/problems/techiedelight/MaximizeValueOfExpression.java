package com.problems.techiedelight;

/**
 * Created by Maks on 5/23/2017.
 * http://www.techiedelight.com/maximize-value-of-the-expression/
 */
public class MaximizeValueOfExpression {

    public int solution1(Integer[] arr){
        final int n=arr.length;
        Integer[] m1=new Integer[n+1];
        Integer[] m2=new Integer[n];
        Integer[] m3=new Integer[n-1];
        Integer[] m4=new Integer[n-2];

        for(int i=0; i< arr.length-3; i++){
            m1[i]=m2[i]=m3[i]=m4[i]=Integer.MIN_VALUE;
        }
        m1[n-2]=m2[n-2]=m3[n-3]=Integer.MIN_VALUE;
        m1[n-2]=m2[n-1]=m1[n]=Integer.MIN_VALUE;

        for(int i=n-1; i>=0; i--){
            m1[i]=Math.max(m1[i+1],arr[i]);
        }

        for(int i=n-2; i>=0; i--){
            m2[i]=Math.max(m2[i+1], m1[i+1]-arr[i]);
        }

        for(int i= n-3; i>=0; i--){
            m3[i]=Math.max(m3[i+1], m2[i+1]+arr[i]);
        }

        for(int i=n-4; i>=0; i--){
            m4[i]=Math.max(m4[i+1], m3[i+1]-arr[i]);
        }
        return  m4[0];
    }
}
