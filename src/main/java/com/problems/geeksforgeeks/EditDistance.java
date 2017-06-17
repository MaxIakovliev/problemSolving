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

    private int min(int i, int j, int k) {
        int tmp=Math.min(i,j);
        return Math.min(tmp,k);
    }
}
