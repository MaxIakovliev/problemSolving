package com.problems.geeksforgeeks.dp;

/**
 * Created by Maks on 9/1/2017.
 * http://www.geeksforgeeks.org/space-optimized-solution-lcs/
 */
public class LongestCommonString {
    public int solution1(String s1, String s2) {
        int x = s1.length();
        int y = s2.length();

        int res[][] = new int[x + 1][y + 1];
        //res[0][0] = 0;
        for (int i = 0; i <= x; i++) {
            for (int j = 0; j <= y; j++) {
                if(i==0 || j==0){
                    res[i][j]=0;
                }
                else
                if (s1.charAt(i-1) == s2.charAt(j-1)) {
                    res[i][j] = res[i - 1][j - 1] + 1;
                } else {
                   res[i][j]= Math.max(res[i - 1][j], res[i][j - 1]);
                }
            }
        }
        return res[x][y];
    }

    public static void main(String[] args) {
            System.out.println(new LongestCommonString().solution1("ABCDGH", "AEDFHR"));
    }
}
