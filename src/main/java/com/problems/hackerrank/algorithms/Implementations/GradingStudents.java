package com.problems.hackerrank.algorithms.Implementations;

/**
 * Created by Maks on 11/2/2017.
 */
public class GradingStudents {

    public int[] solve(int[] grades) {
        int[] res = new int[grades.length];
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] < 38) {
                res[i] = grades[i];
                continue;
            }
            int mult = grades[i] / 5 + (grades[i] % 5 > 0 ? 1 : 0);
            res[i] = (5 * mult - grades[i] < 3 ? 5 * mult : grades[i]);
        }
        return res;
    }
}
