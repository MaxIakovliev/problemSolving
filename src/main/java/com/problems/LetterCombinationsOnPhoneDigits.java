package com.problems;

import java.util.*;

/**
 * Created by Maks on 5/28/2017.
 * http://www.geeksforgeeks.org/find-possible-words-phone-digits/
 * good review of problem can be found here: https://codereview.stackexchange.com/questions/91645/letter-combinations-of-phone-dial-pad-number
 */
public class LetterCombinationsOnPhoneDigits {
    private final Map<Character,String> map;

    public LetterCombinationsOnPhoneDigits(){
        map=new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
    }

    public List<String> getCombinations(String numbers){
        LinkedList<String> res= new LinkedList<>();
        res.add("");
        for(int i=0;i<numbers.length(); i++){
            String letters=map.get(numbers.charAt(i));
            for(int j=res.size(); j>0; j--){
                String tmp=res.poll();
                for(int k=0; k<letters.length(); k++){
                    res.add(tmp+letters.charAt(k));
                }
            }
        }
        return  res;
    }

}
