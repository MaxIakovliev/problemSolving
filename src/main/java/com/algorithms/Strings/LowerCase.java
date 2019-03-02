package com.algorithms.Strings;

public class LowerCase {
    public String toLowerCase(String str) {
        StringBuilder sb=new StringBuilder();
        Character start='a';
        Character end='z';
        for (char c:str.toCharArray()){
            if (c>=start && c<=end){
                sb.append(c);
            }
            else if(c>=start-32 && c<=end-32){
                sb.append((char)(((int)c)+32));
            }
            else{
                sb.append(c);
            }
        }
        return  sb.toString();
    }

    public static void main(String[] args) {
        LowerCase lc=new LowerCase();
        System.out.println(lc.toLowerCase("ThiS IS SPARTA!!!"));
    }
}
