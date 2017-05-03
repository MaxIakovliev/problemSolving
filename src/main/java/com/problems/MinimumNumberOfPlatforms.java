package com.problems;

import java.util.Arrays;

/**
 * Created by Maks on 5/3/2017.
 * http://www.techiedelight.com/minimum-number-of-platforms-needed-avoid-delay-arrival-train/
 */
public class MinimumNumberOfPlatforms {
    public  int solution1(double[] arr, double[] dep){
        Arrays.sort(arr);
        Arrays.sort(dep);
         int res=0;
        int i=0; int j=0;
        int count=0;
        while(i<arr.length){
            if(arr[i]<dep[j]){
                res=Math.max(res,++count);
                i++;
            }
            else {
                count--;
                j++;
            }
        }
        return  res;
    }

}
