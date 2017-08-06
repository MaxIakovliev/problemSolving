package com.problems.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Maks on 8/6/2017.
 */
public class TextJustification {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> res=new ArrayList<>();
        int curCountWords=0;
        int curLen=0;
        int i=0;
        List<String> curWords=new ArrayList<>();
        while(i<words.length){
            if(curLen+(words[i].length())>=maxWidth){
                String line= justify(curWords,curLen,maxWidth);
                res.add(line);
                curLen=0;
                curWords.clear();
            }else{
                if(curLen+(words[i].length()+1)>=maxWidth)
                    curLen+=(words[i].length());
                else
                    curLen+=(words[i].length()+1);
                curWords.add(words[i]);
                i++;
            }
        }
        if(curWords.size()>0){
            String line= justify(curWords,curLen,maxWidth);
            res.add(line);
        }

        return  res;
    }

    private String justify(List<String> curWords, int curLen, int maxLen){
        if (curLen==maxLen){
            StringBuilder sb=new StringBuilder(maxLen);
            for (int i = 0; i < curWords.size(); i++) {
                sb.append(curWords.get(i));
                if(i!=curWords.size()-1)
                    sb.append(" ");
            }
            return  sb.toString();
        }
        else if(curWords.size()==1){
            if(curWords.get(0).length()==maxLen)
            return curWords.get(0);
            else {
                StringBuilder sb=new StringBuilder(maxLen);
                sb.append(curWords.get(0));
                int diff=maxLen-curWords.get(0).length();
                for (int i = 0; i < diff; i++) {
                    sb.append(" ");
                }
                return sb.toString();

            }
        }
        else {
            int diff=maxLen-curLen;
            int spaces= diff/(curWords.size()-1);
            int extraSpace=0;
            if(maxLen-curLen %2>0)
                extraSpace++;
            StringBuilder sb=new StringBuilder(maxLen);
            for (int i = 0; i < curWords.size(); i++) {
                if(i==curWords.size()-1 && sb.length()+curWords.get(i).length()==maxLen-1){
                    sb.append(" ");
                }
                sb.append(curWords.get(i));
                if(i!= curWords.size()-1){
                    for(int j=0; j<spaces+1; j++){
                        sb.append(" ");
                    }
                    if(extraSpace>0){
                        sb.append(" ");
                        extraSpace--;
                    }
                }
            }
            return sb.toString();

        }
    }
}
