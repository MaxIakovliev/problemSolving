package com.problems.leetcode;

import java.util.regex.Pattern;

/**
 * Created by Maks on 1/5/2018.
 */
public class ValidateIpAddress {
    public String validIPAddress(String IP) {

        if (IP.contains(".") && validIp4Address(IP))
            return "IPv4";
        else if (IP.contains(":") && validIp6Address(IP))
            return "IPv6";

        return "Neither";

    }

    private boolean validIp6Address(String str) {
        int sepCount=0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)==':')
                sepCount++;
        }
        if(sepCount!=7)
            return  false;

        String[] cort = str.toUpperCase().split(Pattern.quote(":"));
        if (cort.length != 8) return false;
        for (int i = 0; i < cort.length; i++) {
            if (!correctHexNumber(cort[i]))
                return false;
        }
        return true;
    }

    private boolean correctHexNumber(String str) {
        if (str.length() < 1 || str.length()>4)
            return false;

        for(int i=0; i<str.length(); i++){
            Character c=str.charAt(i);
            if (c=='A' || c=='B' || c=='C'|| c=='D'|| c=='E'|| c=='F' || ( ((int)c-'0')>=0 && ((int)c-'0')<=9) )
                continue;

            return false;
        }
        return  true;

    }

    private boolean validIp4Address(String str) {
        int sepCount=0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='.')
                sepCount++;
        }
        if(sepCount!=3)
            return  false;

        String[] cort = str.split(Pattern.quote("."));
        if (cort.length != 4) return false;
        for (int i = 0; i < cort.length; i++) {
            if (!correctDecNumber(cort[i]))
                return false;
        }
        return true;
    }

    private boolean correctDecNumber(String str) {
        if (str.length() == 0)
            return false;
        int res = 0;
        for (int i = 0; i < str.length(); i++) {
            int tmp = ((int) str.charAt(i) - '0');
            if (tmp == 0 && res == 0&& str.length()>1)
                return false;
            res = res * 10 + tmp;
        }
        return res >= 0 && res <= 255 ? true : false;
    }
}
