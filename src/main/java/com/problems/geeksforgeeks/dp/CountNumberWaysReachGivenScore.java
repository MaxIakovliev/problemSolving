package com.problems.geeksforgeeks.dp;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Stack;


/**
 * Created by Maks on 8/26/2017.
 * http://www.geeksforgeeks.org/count-number-ways-reach-given-score-game/
 */
public class CountNumberWaysReachGivenScore {

    public int recursive(int n) {
        if (n == 0)
            return 1;
        if (n < 0)
            return 0;
        if (n == 3 || n == 5)
            return 1;

        return recursive(n - 3) + recursive(n - 5) + recursive(n - 10);
    }

    public int recursivePrint(int n, int cur, List<Integer> data, int original) {

        if (cur != 0)
            data.add(cur);
        if (n == 0) {
            print(data, original);
            data.clear();
            return 1;
        }
        if (n < 0) {
            data.clear();
            //data.remove(data.size()-1);
            return 0;
        } else {
            return recursivePrint(n - 1, 1, data, original) +
                    recursivePrint(n - 3, 3, data, original);
        }
    }

    public void iterative(int n) {
        Stack<Integer> stack = new Stack<Integer>();
        List<Integer> data = new ArrayList<>();
        HashSet<Integer> excluded = new HashSet<>();
        int[] op = {3,1};
        do {
            int i = 0;
            for (i = 0; i < op.length; i++) {
                boolean proceed = true;
                if (excluded.size() == op.length)
                    return;
                if (excluded.contains(i)) {
                    proceed = false;
                    break;
                }

                if (!proceed)
                    continue;

                stack.push(op[i]);
                data.add(op[i]);
                n -= op[i];
                if (n == 0) {
                    print(data);
                    //data.clear();
                }
                while (n <= 0 && stack.size() > 0) {
                    int k = stack.pop();
                    n += k;

                    int m = 0;
                    while (m < data.size()) {
                        if (data.get(m) == k)
                            data.remove(m);
                        else m++;
                    }
                    excluded.add(k);
                }
            }

        } while (stack.size() != 0);
    }

    private void print(List<Integer> data, int original) {
        int tmp = 0;
        for (int i = 0; i < data.size(); i++) {
            tmp += data.get(i);
        }
        if (tmp != original)
            return;

        for (int i = 0; i < data.size(); i++) {
            System.out.print(data.get(i).toString() + " ");
        }
        System.out.println();
    }

    private void print(List<Integer> data) {

        for (int i = 0; i < data.size(); i++) {
            System.out.print(data.get(i).toString() + " ");
        }
        System.out.println();
    }

    public int count(int n) {
        int[] res = new int[n + 1];
        res[0] = 1;
        for (int i = 3; i <= n; i++) {
            res[i] += res[i - 3];
        }
        for (int i = 5; i <= n; i++) {
            res[i] += res[i - 5];
        }
        for (int i = 10; i <= n; i++) {
            res[i] += res[i - 10];
        }
        return res[n];
    }
}
