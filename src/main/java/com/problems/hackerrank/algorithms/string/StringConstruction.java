package com.problems.hackerrank.algorithms.string;

import java.util.HashSet;

/**
 * Created by Maks on 11/15/2017.
 */
public class StringConstruction {
    public int solve(String s){
        int res=0;
        HashSet<Character> c=new HashSet<>();
        for(int i=0;i<s.length(); i++){
            if(!c.contains(s.charAt(i))){
                c.add(s.charAt(i));
                res++;
            }
        }
        return  res;
    }
}
