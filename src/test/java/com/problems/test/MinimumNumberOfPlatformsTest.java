package com.problems.test;

import com.problems.MinimumNumberOfPlatforms;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Maks on 5/3/2017.
 */
public class MinimumNumberOfPlatformsTest implements ISingleTestCase {

    @Test
    public void solution1TestCase1() {
        MinimumNumberOfPlatforms s=new MinimumNumberOfPlatforms();
        double arr[]= {2.00, 2.10, 3.00, 3.20, 3.50, 5.00 };
        double dep[]= {2.30, 3.40, 3.20, 4.30, 4.00, 5.20  };
        int res=s.solution1(arr,dep);
        int expected=2;
        Assert.assertEquals(expected,res);
    }
}
