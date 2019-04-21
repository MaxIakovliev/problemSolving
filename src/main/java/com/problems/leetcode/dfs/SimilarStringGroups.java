package com.problems.leetcode.dfs;

import java.util.HashSet;

/**
 * https://leetcode.com/problems/similar-string-groups/
 */
public class SimilarStringGroups {
    private HashSet<String> processed=new HashSet<>();
    public int numSimilarGroups(String[] A) {
        HashSet<String> tmp=new HashSet<String>();
        for (String item: A){
            tmp.add(item);
        }

        A=new String[tmp.size()];
        int i=0;
        for(String item:tmp){
            A[i]=item;
            i++;
        }
        int res=0;
        for(i =0; i<A.length; i++){
            if (this.processed.contains(A[i]))
                continue;
            res++;
            this.dfs(A,A[i]);
        }
        return  res;
    }

    private void dfs(String[] a, String s) {
        for(String item:a){
            if(this.processed.contains(item)){
                continue;
            }

            if (this.belongSameGroup(item,s)){
                this.processed.add(item);
                this.processed.add(s);
                dfs(a,item);
            }
        }
    }

    private boolean belongSameGroup(String item, String s) {
        int swaps=0;
        int i=0;
        while (swaps<=2 && i<item.length()){
            if (item.charAt(i)!=s.charAt(i))
                swaps++;
            i++;
        }
        return swaps==2;
    }
}
