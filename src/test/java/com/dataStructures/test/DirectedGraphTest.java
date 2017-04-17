package com.dataStructures.test;

import com.dataStructures.DirectedGraph;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Maks on 4/17/2017.
 */
public class DirectedGraphTest {

    private DirectedGraph<Integer> graph=new DirectedGraph<Integer>();

    @Before
    public  void before(){
        graph.add(0);
        graph.add(1);
        graph.add(2);
        graph.add(3);

        graph.add(0, 1, 1);
        graph.add(1, 2, 2);
        graph.add(2, 3, 2);
        graph.add(3, 0, 2);
        graph.add(1, 3, 1);
        graph.add(2, 1, 5);
    }

    @Test
    public void TestBuildSimpleDirectedGraphEdgeExists() {

        Assert.assertEquals(true, graph.isEdge(0,1));
        Assert.assertEquals(false, graph.isEdge(1,0));

        Assert.assertEquals(true, graph.isEdge(1,2));
        Assert.assertEquals(false, graph.isEdge(2,0));

        Assert.assertEquals(true, graph.isEdge(2,3));
        Assert.assertEquals(false, graph.isEdge(3,2));

        Assert.assertEquals(true, graph.isEdge(3,0));
        Assert.assertEquals(false, graph.isEdge(0,3));

        Assert.assertEquals(true, graph.isEdge(1,3));
        Assert.assertEquals(false, graph.isEdge(3,1));

    }


    @Test
    public void TestBuildSimpleDirectedGraphCost(){
        Assert.assertEquals(1, graph.getCost(0,1));
        Assert.assertEquals(2, graph.getCost(1,2));
        Assert.assertEquals(2, graph.getCost(2,3));
        Assert.assertEquals(2, graph.getCost(3,0));
        Assert.assertEquals(1, graph.getCost(1,3));
        Assert.assertEquals(5, graph.getCost(2,1));
    }
}
