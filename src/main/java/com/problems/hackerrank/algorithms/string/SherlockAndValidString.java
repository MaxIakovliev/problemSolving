package com.problems.hackerrank.algorithms.string;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Maks on 11/15/2017.
 */
public class SherlockAndValidString {
    public String solve(String s) {
//        char[] ar = s.toCharArray();
//        Arrays.sort(ar);
//        String k = String.copyValueOf(ar);

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.containsKey(s.charAt(i)) ? map.get(s.charAt(i)) + 1 : 1);
        }


        int dif=Integer.MAX_VALUE;

        boolean alowed=false;
        HashMap<Integer, Integer> sum=new HashMap<>();
        for (Map.Entry<Character, Integer> en : map.entrySet()) {
            int t = en.getValue();
            sum.put(t, sum.containsKey(t) ? sum.get(t) + 1 : 1);
            if(dif==Integer.MAX_VALUE){
                dif=t;
            }
            else if(Math.abs(dif-t)>1 && t!=1){// && !alowed){
                return "NO";
            }
        }

        if(sum.size()>2)
            return "NO";
        if(sum.size()==2){
            int countOne=0;
            for (Map.Entry<Integer, Integer> en : sum.entrySet()) {
                if(en.getValue()==1)
                    countOne++;
            }
            if(countOne==1){
                return "YES";
            }
            return "NO";
        }
        return "YES";
    }

    public static void main(String[] args) {
        SherlockAndValidString ss = new SherlockAndValidString();
        System.out.println(ss.solve("aabbcc"));//YES
        System.out.println(ss.solve("baacdd"));//NO
        System.out.println(ss.solve("aabcdd"));//NO
      /*yes*/   System.out.println(ss.solve("hfchdkkbfifgbgebfaahijchgeeeiagkadjfcbekbdaifchkjfejckbiiihegacfbchdihkgbkbddgaefhkdgccjejjaajgijdkd"));
         /*no*/ System.out.println(ss.solve("tfgyrknpgngtqgjccbyctwdcymwrcjtpoaflkeoxfxijxkngpjoofggsozftkpgxakptmzjxugavazwllxdtrjrrbjmrqwfxaby"));
        System.out.println(ss.solve("abcccc"));//NO
        System.out.println(ss.solve("aaaabbccdd"));//NO
        System.out.println(ss.solve("ibfdgaeadiaefgbhbdghhhbgdfgeiccbiehhfcggchgghadhdhagfbahhddgghbdehidbibaeaagaeeigffcebfbaieggabcfbiiedcabfihchdfabifahcbhagccbdfifhghcadfiadeeaheeddddiecaicbgigccageicehfdhdgafaddhffadigfhhcaedcedecafeacbdacgfgfeeibgaiffdehigebhhehiaahfidibccdcdagifgaihacihadecgifihbebffebdfbchbgigeccahgihbcbcaggebaaafgfedbfgagfediddghdgbgehhhifhgcedechahidcbchebheihaadbbbiaiccededchdagfhccfdefigfibifabeiaccghcegfbcghaefifbachebaacbhbfgfddeceababbacgffbagidebeadfihaefefegbghgddbbgddeehgfbhafbccidebgehifafgbghafacgfdccgifdcbbbidfifhdaibgigebigaedeaaiadegfefbhacgddhchgcbgcaeaieiegiffchbgbebgbehbbfcebciiagacaiechdigbgbghefcahgbhfibhedaeeiffebdiabcifgccdefabccdghehfibfiifdaicfedagahhdcbhbicdgibgcedieihcichadgchgbdcdagaihebbabhibcihicadgadfcihdheefbhffiageddhgahaidfdhhdbgciiaciegchiiebfbcbhaeagccfhbfhaddagnfieihghfbaggiffbbfbecgaiiidccdceadbbdfgigibgcgchafccdchgifdeieicbaididhfcfdedbhaadedfageigfdehgcdaecaebebebfcieaecfagfdieaefdiedbcadchabhebgehiidfcgahcdhcdhgchhiiheffiifeegcfdgbdeffhgeghdfhbfbifgidcafbfcd"));//NO

    }
}
