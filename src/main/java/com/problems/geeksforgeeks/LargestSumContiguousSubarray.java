package com.problems.geeksforgeeks;

/**
 * Created by Maks on 6/4/2017.
 * http://www.geeksforgeeks.org/largest-sum-contiguous-subarray/
 */
public class LargestSumContiguousSubarray {
    public int kadanesAlgorithm(int[]arr){
        int max=Integer.MIN_VALUE;
        int tmp=0;
        for(int i=1; i<arr.length; i++){
            tmp+=arr[i];
            if(tmp<0)
                tmp=0;

            max=Math.max(max, tmp);
        }
        return  max;

    }

    public ResultTuple kadanesAlgorithmExt(int[]arr){
        int startPos=-1;
        int endPos=-1;
        int max=Integer.MIN_VALUE;
        int tmp=0;
        for(int i=0; i<arr.length;i++){
            tmp+=arr[i];
            if (tmp<0){
                tmp=0;
                startPos=-1;
                endPos=-1;
            } else if(startPos<0)
                startPos=i;

            if(tmp>max){
                max=tmp;
                endPos=i;
            }

        }
        return new ResultTuple(max,startPos,endPos);
    }

    public class ResultTuple{
        public int sum;
        public int startPos;
        public int endPos;
        public ResultTuple(int sum, int startPos, int endPos){
            this.sum=sum;
            this.startPos=startPos;
            this.endPos=endPos;
        }
    }
}
