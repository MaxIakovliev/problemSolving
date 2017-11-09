package com.problems.hackerrank.algorithms.string;

/**
 * Created by Maks on 11/9/2017.
 */
public class MarsExploration {

    public int solve(String s){
        String tmpl="SOS";
        int res=0;
        int itr=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)!=tmpl.charAt(itr++)){
                res++;
            }
            if(itr>= tmpl.length())
                itr=0;
        }
        return  res;

    }
    public static void main(String[] args) {
        MarsExploration m =new MarsExploration();
        System.out.println(m.solve("SOSSPSSQSSOR"));
    }
}
