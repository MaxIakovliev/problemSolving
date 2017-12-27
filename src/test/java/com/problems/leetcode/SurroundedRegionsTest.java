package com.problems.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Maks on 12/25/2017.
 */
public class SurroundedRegionsTest {

    @Test
    public  void test1() {
        SurroundedRegions sr = new SurroundedRegions();
        char[][] input = new char[][]{
                {'X', 'X', 'X', 'X'},
                {'X', 'O', 'O', 'X'},
                {'X', 'X', 'O', 'X'},
                {'X', 'O', 'X', 'X'},
        };

        char[][] expected = new char[][]{
                {'X', 'X', 'X', 'X'},
                {'X', 'X', 'X', 'X'},
                {'X', 'X', 'X', 'X'},
                {'X', 'O', 'X', 'X'},
        };

        char[][] actual = sr.solve(input);

        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                Assert.assertEquals(expected[i][j], actual[i][j]);
            }
        }
    }


    @Test
    public  void test2() {
        SurroundedRegions sr = new SurroundedRegions();
        char[][] input = new char[][]{
                {'X', 'O'},
                {'O', 'X'}
        };

        char[][] expected = new char[][]{
                {'X', 'O'},
                {'O', 'X'}
        };

        char[][] actual = sr.solve(input);

        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                Assert.assertEquals(expected[i][j], actual[i][j]);
            }
        }
    }

    @Test
    public  void test3() {
        SurroundedRegions sr = new SurroundedRegions();
        char[][] input = new char[][]{
                {'X','O','X','O','X','O'},
                {'O','X','O','X','O','X'},
                {'X','O','X','O','X','O'},
                {'O','X','O','X','O','X'}
        };

        char[][] expected = new char[][]{
                {'X','O','X','O','X','O'},
                {'O','X','X','X','X','X'},
                {'X','X','X','X','X','O'},
                {'O','X','O','X','O','X'}
        };

        char[][] actual = sr.solve(input);

        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                Assert.assertEquals(expected[i][j], actual[i][j]);
            }
        }
    }

    @Test
    public  void test4() {
        SurroundedRegions sr = new SurroundedRegions();
        char[][] input = new char[][]{
                {'O','X','X','O','X'},
                {'X','O','O','X','O'},
                {'X','O','X','O','X'},
                {'O','X','O','O','O'},
                {'X','X','O','X','O'}
        };

        char[][] expected = new char[][]{
                {'O','X','X','O','X'},
                {'X','X','X','X','O'},
                {'X','X','X','O','X'},
                {'O','X','O','O','O'},
                {'X','X','O','X','O'}
        };

        char[][] actual = sr.solve(input);

        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                Assert.assertEquals(expected[i][j], actual[i][j]);
            }
        }
    }

    @Test
    public  void test5() {
        SurroundedRegions sr = new SurroundedRegions();
        char[][] input = new char[][]{
                {'X','X','O','X','X'},
                {'X','X','O','X','X'},
                {'O','X','X','O','O'},
                {'X','O','O','X','X'},
                {'X','X','O','X','O'},
                {'X','X','O','X','X'}
        };

        char[][] actual = sr.solve(input);
    }
}
