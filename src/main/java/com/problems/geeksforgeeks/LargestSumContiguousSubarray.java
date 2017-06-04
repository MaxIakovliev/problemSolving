package com.problems.geeksforgeeks;

/**
 * Created by Maks on 6/4/2017.
 * http://www.geeksforgeeks.org/largest-sum-contiguous-subarray/
 */
public class LargestSumContiguousSubarray {
    public int kadanesAlgorithm(int[]arr){
        int max=Integer.MIN_VALUE;
        int maxEndHere=0;

        for(int i=0; i<arr.length; i++){
            maxEndHere+=arr[i];
            if(max<maxEndHere){
                max=maxEndHere;
            }

            if(maxEndHere<0){
                maxEndHere=0;
            }
        }
        return  max;
    }

    public ResultTuple kadanesAlgorithmExt(int[]arr){
        ResultTuple res=new ResultTuple();
        int max=Integer.MIN_VALUE;
        int maxEndHere=0;
        int startPos=0;
        int endPos=0;
        int tmpStartPos=0;

        for(int i=0; i<arr.length; i++){
            maxEndHere+=arr[i];
            if(max<maxEndHere){
                max=maxEndHere;
                endPos=i;
                if(tmpStartPos>0){
                    startPos=tmpStartPos+1;
                }
            }

            if(maxEndHere<0){
                maxEndHere=0;
                tmpStartPos=i;
            }
        }
        res.sum=max;
        res.startPos=startPos;
        res.endPos=endPos;
        return  res;
    }

    public class ResultTuple{
        public int sum;
        public int startPos;
        public int endPos;
    }
}
