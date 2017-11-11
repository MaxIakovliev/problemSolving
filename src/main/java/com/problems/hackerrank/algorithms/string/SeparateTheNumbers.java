package com.problems.hackerrank.algorithms.string;

/**
 * Created by Maks on 11/11/2017.
 */
public class SeparateTheNumbers {
    public String solve(String str) {
        for(int i=1; i<=str.length()/2; i++){
            String s=str.substring(0,i);
            boolean res= tryParseInt(s) && validNumber(Long.parseLong(s),str);
            if(res){
                return "YES "+s;
            }
        }
        return "NO";
    }

    public boolean validNumber(long n, String str) {
        boolean res = false;
            long nextLen = (Long.toString(n + 1)).length();
        int it = (Long.toString(n)).length();
        while (it < str.length()) {
            //it++;
            String nstr = (Long.toString(++n));
            for (int i = 0; i < nstr.length(); i++) {
                if ((it+i)>=str.length() || str.charAt(it + i) != nstr.charAt(i)) {
                    return false;
                }
            }
            it += nstr.length();
        }
        return true;
    }

    boolean tryParseInt(String value) {
        try {
            Long.parseLong(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
