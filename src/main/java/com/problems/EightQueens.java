package com.problems;

/**
 * Created by Maks on 4/27/2017.
 * https://en.wikipedia.org/wiki/Eight_queens_puzzle
 */
public class EightQueens {
    //private int deployedCount=0;
    private Integer[][] field;
    private final int size=8;
    public EightQueens(){
        field=new Integer[size][];
        for(int i=0; i<size; i++){
            field[i]=new Integer[size];
            for(int j=0; j<size; j++){
                field[i][j]=0;
            }
        }
    }

    public void print(){
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                System.out.print(field[i][j]+" ");
            }
            System.out.println();
        }

    }

    public  boolean solve(int x, int y, int deployedCount){
        if(!isAllowed(x,y)) {
            return false;
        }
        if(deployedCount==8){
            return  true;
        }
        for (int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                if(field[i][j]!=1){
                    field[i][j]=1;

                    if(solve(i,j,deployedCount+1)){
                        return  true;
                    }
                    else {
                        field[i][j]=0;
                    }
                }
            }
        }
        return  false;
    }

    private boolean isAllowed(int x, int y) {
        //check row
        for(int i=0; i<size; i++){
            if(field[i][y]==1 && i!=x){
                return  false;
            }
        }

        //check column
        for(int i=0; i<size; i++){
            if(field[x][i]==1 && y!=i){
                return  false;
            }
        }

        int j=y;
        //check bottom right
        for (int i=x; i<size; i++){
            if(j>size-1)
                break;

            //for(int j=y; j<size; j++){
                if(field[i][j]==1 && i!=x && j!=y){
                    return  false;
                }
            j++;
            //}
        }

        j=y;
        //check bottom left
        for (int i=x; i>=0; i--){
            if(j>size-1)
                break;

            //for(int j=y; j<size; j++){
                if(field[i][j]==1 && i!=x && j!=y){
                    return  false;
                }
            j++;
            //}
        }

        j=y;
        //check up right
        for (int i=x; i<size; i++){
            if(j<0)
                break;

            //for(int j=y; j>=0; j--){
                if(field[i][j]==1 && i!=x && j!=y){
                    return  false;
                }
            //}
            j--;
        }

        j=y;
        //check up left
        for (int i=x; i>=0; i--){
            if(j<0)
                break;

            //for(int j=y; j>=0; j--){
                if(field[i][j]==1 && i!=x && j!=y){
                    return  false;
                }
            //}
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        EightQueens eq=new EightQueens();
        eq.solve(0,0,0);
        eq.print();
    }

}
