package com.problems.geeksforgeeks;

/**
 * Created by Maks on 6/5/2017.
 * http://www.geeksforgeeks.org/dynamic-programming-set-5-edit-distance/
 */
public class EditDistance {

    public int recursiveSolution(String  s1, String s2, int x,int y){

        //if s1 is empty- we have to use whole s2 string
        if(x==0)
            return y;
        //if s2 is empty we have to use whole s1 string
        if(y==0)
            return x;

        if(s1.charAt(x-1)==s2.charAt(y-1))
            return recursiveSolution(s1,s2,x-1,y-1);
        else
            return 1+min(
                    recursiveSolution(s1,s2, x-1, y-1),
                    recursiveSolution(s1,s2, x-1, y),
                    recursiveSolution(s1,s2,x,y-1)
            );
    }

    public int iterativeSolution(String s1, String s2, int x, int y){
        int[][] tmp=new int[x+1][y+1];

        for(int i=0; i<=x; i++){
            for(int j=0; j<=y; j++){
                if(i==0)
                    tmp[i][j]=j;
                else if(j==0)
                    tmp[i][j]=i;
                else if(s1.charAt(i-1)==s2.charAt(j-1)){
                    tmp[i][j]=tmp[i-1][j-1];
                }
                else
                    tmp[i][j]=1+min(
                            tmp[i-1][j-1],
                            tmp[i-1][j],
                            tmp[i][j-1]
                    );
            }
        }
        return tmp[x][y];
    }

    private int min(int i, int j, int k) {
        int tmp=Math.min(i,j);
        return Math.min(tmp,k);
    }
}
