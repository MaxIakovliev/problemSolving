package com.problems.leetcode.DynamicProgramming;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    //Question: https://leetcode.com/problems/permutations/
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> tmp=new ArrayList<>();
        List<Integer> input=new ArrayList<>();
        for (int i:nums){
            input.add(i);
        }
        do_perm(input,tmp,res);
        return  res;
    }
    private void do_perm(List<Integer> s, List<Integer> prefix, List<List<Integer>>res){
        if (s.size()==0){
            res.add(prefix);
        }
        else{
            for (int i=0; i<s.size(); i++){
                List<Integer> remaining=new ArrayList<>();
                remaining.addAll(s.subList(0,i));
                if (i+1<s.size()) {
                    remaining.addAll(s.subList(i + 1, s.size()));
                }
                List<Integer> tmp=new ArrayList<>();
                for (int j:prefix){
                    tmp.add(j);
                }
                tmp.add(s.get(i));
                do_perm(remaining,tmp,res);
            }
        }
    }


    //*******************attempt2*********************************************
    public List<List<Integer>> permute2(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> tmp=new ArrayList<>();
        List<Integer> input=new ArrayList<>();
        for (int item: nums){
            input.add(item);
        }
        this.do_perm2(input, tmp, res);
        return res;
    }

    private void do_perm2(List<Integer> input, List<Integer> tmp, List<List<Integer>> res) {
        if (input.size()==0){
            res.add(tmp);
        }
        else{
            for(int i=0; i< input.size(); i++) {
                List<Integer> rest = new ArrayList<>();
                rest.addAll(input.subList(0,i));
                if (i+1<input.size()) {
                    rest.addAll(input.subList(i + 1, input.size()));
                }
                List<Integer> pref=new ArrayList<>();
                for (int item : tmp){
                    pref.add(item);
                }
                pref.add(input.get(i));
                do_perm2(rest,pref, res);
            }
        }
    }


    public static void main(String[] args) {
        // write your code here
        Permutations p=new Permutations();
        int[] arr={1,2,3};
        p.permute(arr);
    }
}
