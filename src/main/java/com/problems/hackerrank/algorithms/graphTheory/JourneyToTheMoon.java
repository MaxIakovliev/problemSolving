package com.problems.hackerrank.algorithms.graphTheory;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Maks on 1/30/2017.
 */
public class JourneyToTheMoon {

    public static void main(String[] args) throws Exception{
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = bfr.readLine().split(" ");
        int N = Integer.parseInt(temp[0]);
        int I = Integer.parseInt(temp[1]);

        long combinations = 0;
        for(int i = 0; i < I; i++){
            temp = bfr.readLine().split(" ");
            int a = Integer.parseInt(temp[0]);
            int b = Integer.parseInt(temp[1]);
           int j=i+1;
            while(j<=I){
                combinations+=4;
                j++;
            }
        }


        //long combinations = 0;

        // Compute the final answer - the number of combinations

        System.out.println(combinations);

    }
}
