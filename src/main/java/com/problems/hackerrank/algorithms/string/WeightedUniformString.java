package com.problems.hackerrank.algorithms.string;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by Maks on 11/11/2017.
 */
public class WeightedUniformString {

    public HashSet<Integer> prepareCache(String str){
        HashMap<Character, Integer> hash=new HashMap<>();
        char c='a';
        hash.put(c,1);
        for(int i=1; i<26; i++){
            c=(char)((int)c+1);
            hash.put(c,i+1);
        }
        HashSet<Integer> cache=new HashSet<>();
        int prev=0;
        for(int i=0; i<str.length();i++){
            if(!cache.contains(hash.get(str.charAt(i)))) {
                cache.add(hash.get(Character.toLowerCase(str.charAt(i))));
            }
            if(i>0 && str.charAt(i-1)==str.charAt(i)){
                prev+=hash.get(Character.toLowerCase(str.charAt(i)));
                if(!cache.contains(hash.get(prev))) {
                    cache.add(prev);
                }
            }
            else prev=hash.get(Character.toLowerCase(str.charAt(i)));
        }
        return cache;
    }

    public boolean solve(HashSet<Integer> cache, int num){
        if(cache.contains(num))
            return  true;
        return  false;
    }
}
