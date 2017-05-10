package com.problems.techiedelight.test;

import com.problems.techiedelight.SmallestRangeInAllLists;
import javafx.util.Pair;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Maks on 5/10/2017.
 */
public class SmallestRangeInAllListsTest  implements  com.problems.test.ISingleTestCase{

    @Test
    public void solution1TestCase1() {
        SmallestRangeInAllLists sr=new SmallestRangeInAllLists();
        Integer[][] input=new Integer[4][];
        input[0]=new Integer[]{3, 6, 8, 10, 15};
        input[1]=new Integer[]{1, 5, 12 };
        input[2]=new Integer[]{4, 8, 15, 16 };
        input[3]=new Integer[]{2,6 };

        Pair<Integer, Integer> res= sr.solution1(input);
        Pair<Integer, Integer> exp=new Pair<Integer, Integer>(4,6);
        Assert.assertEquals(exp.getKey(),res.getKey());
        Assert.assertEquals(exp.getValue(),res.getValue());

    }
}
