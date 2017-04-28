package com.problems;

/**
 * Created by Maks on 4/28/2017.
 * https://en.wikipedia.org/wiki/Knight%27s_tour
 */
public class KnightsTour {

    private Integer[][] field;
    private  final int size;
    public  KnightsTour(int size){
        this.size=size;
        field=new Integer[size][];
        for(int i=0; i<size; i++){
            field[i]=new Integer[size];
            for(int j=0; j<size; j++){
                field[i][j]=0;
            }
        }
    }

    public boolean solve(int x, int y, int numOfMoves){
        numOfMoves++;
        field[x][y]=numOfMoves;

        if(numOfMoves==(size*size)-1)
            return  true;
        //create arrays of allowed moves
        Integer[] row=new Integer[]{-2, -2, -1, 1, 2, 2, 1, -1};
        Integer[] col=new Integer[]{-1,  1,  2, 2, 1,-1,-2, -2};

        for(int i=0; i<row.length; i++){
            int r=x+row[i];
            int c=y+col[i];
            if(r>=0 && r<size && c>=0 && c<size && field[r][c]==0){
                if(solve(r,c,numOfMoves)){
                    return  true;
                }

            }
        }
        field[x][y]=0;
        return  false;
    }

    public  void print(){
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                System.out.print(field[i][j]+"\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        KnightsTour kt=new KnightsTour(8);
        kt.solve(0,0,0);
        kt.print();

    }
}
