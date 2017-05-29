package com.problems.techiedelight;

/**
 * Created by Maks on 5/29/2017.
 * http://www.techiedelight.com/print-possible-solutions-n-queens-problem/
 */
public class NQueenProblem {

    private boolean solve(int[][] arr, int size, int col){

        if(col==size){
            printSolution(arr, size);
            return true;
        }

        for(int i=0; i<size; i++){
            if(isSafe(arr,size, i, col)){

                arr[i][col]=1; //put queen
                solve(arr,size,col+1);
                arr[i][col]=0;
            }
        }
        return false;
    }

    private void printSolution(int[][] arr, int size) {
        System.out.println();
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }

    }

    private boolean isSafe(int[][] arr, int size, int row, int col) {

        int i,j;
        //check row
        for( i=0; i<size; i++){
            if(arr[row][i]==1){
                return  false;
            }
        }

        //check column
        for( i=0; i<size; i++){
            if(arr[i][col]==1){
                return  false;
            }
        }

        //check diagonal on upper left side
        i=row;
        j=col;
        while(i>=0 && j>=0){
            if(arr[i][j]==1){
                return  false;
            }
            i--;
            j--;
        }

        //check diagonal upper right
        i=row;
        j=col;
        while(i<size && j>=0){
            if(arr[i][j]==1){
                return  false;
            }
            i++;
            j--;
        }

        //check diagonal lower left
        i=row;
        j=col;
        while(i>=0 && j<size){
            if(arr[i][j]==1){
                return  false;
            }
            i--;
            j++;
        }

        //check diagonal lower right
        i=row;
        j=col;
        while(i<size && j<size){
            if(arr[i][j]==1){
                return  false;
            }
            i++;
            j++;
        }
        return  true;
    }


    public static void main(String[] args) {
     NQueenProblem np=new NQueenProblem();
        int size=4;
        int[][] arr=new int[size][size];
        for(int i =0; i<size; i++){
            for(int j=0; j<size; j++){
                arr[i][j]=0;
            }
        }
        np.solve(arr,size,0);

    }
}
