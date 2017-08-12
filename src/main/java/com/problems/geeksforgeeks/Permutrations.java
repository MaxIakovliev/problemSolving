package com.problems.geeksforgeeks;

/**
 * Created by Maks on 8/12/2017.
 */
public class Permutrations {
    private void permute(String s, int l, int r){
        if(l==r){
            System.out.println(s);
        }
        else {
            for(int i=l;i<=r; i++){
                s=swap(s,l,i);
                permute(s,l+1,r);
                s=swap(s,l,i);
            }
        }
    }

    private String swap(String s, int i, int j){
        char[] c=s.toCharArray();
        char tmp=c[i];
        c[i]=c[j];
        c[j]=tmp;
        return  new String(c);
    }


    public static void main(String[] args) {
        Permutrations p =new Permutrations();
        String s="123456";
        p.permute(s,0,s.length()-1);
    }
}
