package com.problems;

/**
 * Created by Maks on 5/6/2017.
 */
public class TaskWithDeadline  implements Comparable{
    public int task;
    public int deadline;
    public int profit;

    public TaskWithDeadline(int task, int deadline, int profit){
        this.task=task;
        this.deadline=deadline;
        this.profit=profit;
    }


    public int compareTo(Object o) {
        return Integer.compare(profit,((TaskWithDeadline)o).profit);
    }
}
