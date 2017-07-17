package com.problems.geeksforgeeks.dp;

/**
 * Created by Maks on 7/18/2017.
 * http://www.geeksforgeeks.org/count-possible-paths-top-left-bottom-right-nxm-matrix/
 */
public class CountPossiblePathsInMatrix {

    public int recursivesolution(int x, int y){
        if(x==1 || y==1){
            return 1;
        }
        return recursivesolution(x-1,y)+recursivesolution(x,y-1);
    }

    public int iterativeSolution(int x, int y){
        int tmp[][]=new int[x][y];
        for(int i=0;i<x; i++){
            tmp[i]=new int[y];
        }

        for(int i=0; i<x; i++){
            tmp[i][0]=1;
        }

        for(int i=0; i<y;i++){
            tmp[0][i]=1;
        }
        for(int i=1; i<x; i++){
            for(int j=1; j<y; j++){
                tmp[i][j]=tmp[i-1][j]+tmp[i][j-1];
            }
        }
        return tmp[x-1][y-1];
    }
}
