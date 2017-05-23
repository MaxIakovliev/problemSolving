package com.problems.techiedelight.test;

import com.problems.techiedelight.PartitionProblem;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Maks on 5/23/2017.
 */
public class PartitionProblemTest {

    @Test
    public  void solution1TestCase1(){
        PartitionProblem pp=new PartitionProblem();
        Integer [] arr={ 7, 3, 1, 9 };
        boolean res=pp.recursive(arr);
        boolean exp=true;
        Assert.assertEquals(exp,res);
    }
}
