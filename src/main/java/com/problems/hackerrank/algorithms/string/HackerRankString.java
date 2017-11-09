package com.problems.hackerrank.algorithms.string;

/**
 * Created by Maks on 11/9/2017.
 */
public class HackerRankString {
    public void solve(String str){
        String tmpl="hackerrank";
        int itr=0;
        boolean res=false;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)==tmpl.charAt(itr)){
                itr++;
            }
            if (itr==tmpl.length()){
                res=true;
                break;
            }
        }
        if (itr==tmpl.length())
            res=true;

        if(res)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
    public static void main(String[] args) {
        HackerRankString hr=new HackerRankString();
        hr.solve("haacckkerrannkk");
        hr.solve("haacckkerannk");

    }
}
