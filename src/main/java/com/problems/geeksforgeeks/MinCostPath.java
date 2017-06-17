package com.problems.geeksforgeeks;

/**
 * Created by Maks on 6/4/2017.
 * http://www.geeksforgeeks.org/dynamic-programming-set-6-min-cost-path/
 */
public class MinCostPath {
    public  int recursive(int[][]cost, int x,int y){
      if(x<0 || y<0) {
          return  Integer.MAX_VALUE;
      }
      else if  (x==0 && y==0) {
          return  cost[x][y];
      }
      else {
          return cost[x][y]+min(
                  recursive(cost,x-1,y-1),
                  recursive(cost,x-1,y),
                  recursive(cost,x,y-1)
          );
      }
    }

    private int min(int x, int y, int z) {
        int tmp=Math.min(x,y);
        tmp=Math.min(tmp,z);
        return  tmp;
    }
}
