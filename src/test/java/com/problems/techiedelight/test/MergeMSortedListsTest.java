package com.problems.techiedelight.test;

import com.problems.techiedelight.MergeMSortedLists;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Maks on 5/9/2017.
 */
public class MergeMSortedListsTest {

    @Test
    public  void simpleSolutionTestCase1(){
        MergeMSortedLists mm=new MergeMSortedLists();
        Integer[][] input=new Integer[4][];
        input[0]=new Integer[]{10, 20, 30, 40 };
        input[1]=new Integer[]{ 15, 25, 35  };
        input[2]=new Integer[]{ 27, 29, 37, 48, 93  };
        input[3]=new Integer[]{ 32, 33 };
        Integer[] res=mm.simpleSolution(input);
        Integer[] expected=new Integer[]{10, 15, 20, 25, 27, 29, 30, 32, 33, 35, 37, 40, 48, 93};
        for(int i=0; i<expected.length; i++){
            Assert.assertEquals(expected[i], res[i]);
        }
    }
}
