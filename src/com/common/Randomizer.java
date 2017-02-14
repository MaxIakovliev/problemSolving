package com.common;

import java.util.Random;

/**
 * Created by Maks on 2/14/2017.
 */
public class Randomizer {

    public Integer[] generateRandomArray(int n){
        Integer[] list = new Integer[n];
        Random random = new Random();

        for (int i = 0; i < n; i++)
        {
            list[i]=random.nextInt(1000);
        }
        return list;
    }
}
