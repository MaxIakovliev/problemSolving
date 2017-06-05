package com.problems.geeksforgeeks;

/**
 * Created by Maks on 6/5/2017.
 * http://www.geeksforgeeks.org/dynamic-programming-set-5-edit-distance/
 */
public class EditDistance {

    public int recursiveSolution(String  s1, String s2, int x,int y){

        // If first string is empty, the only option is to
        // insert all characters of second string into first
        if(x==0){
            return y;
        }

        // If second string is empty, the only option is to
        // remove all characters of first string
        if(y==0){
            return  x;
        }

        // If last characters of two strings are same, nothing
        // much to do. Ignore last characters and get count for
        // remaining strings.
        if(s1.charAt(x-1)==s2.charAt(y-1)){
            return  recursiveSolution(s1,s2,x-1,y-1);
        }

        // If last characters are not same, consider all three
        // operations on last character of first string, recursively
        // compute minimum cost for all three operations and take
        // minimum of three values.
        return 1+ min(  recursiveSolution(s1,s2,x-1,y-1),//Replace
                        recursiveSolution(s1,s2,x-1,y),//Remove
                        recursiveSolution(s1,s2,x,y-1));//Insert


    }

    private int min(int i, int j, int k) {
        int tmp=Math.min(i,j);
        return Math.min(tmp,k);
    }
}
