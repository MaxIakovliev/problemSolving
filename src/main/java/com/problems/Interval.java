package com.problems;

/**
 * Created by Maks on 5/6/2017.
 */
public class Interval implements Comparable {
    public int start;
    public int end;
    public Interval(int start, int end){
        this.start=start;
        this.end=end;
    }

    public int compareTo(Object o) {
        return Integer.compare(start, ((Interval)o).start);
    }
}
