package com.dataStructures.search;

import com.dataStructures.DirectedGraph;

import java.util.Map;
import java.util.Set;

/**
 * Created by Maks on 4/17/2017.
 */
public class DecissionTree<V,K> {
    private Map<V,Set<K>> _decissions;

    public  int getMinimalPath(DirectedGraph<V> graph, V from, V to ){
        int sum=0;
        for(DirectedGraph.Edge<V> e: graph.getNeighbours(from)){

        }
        return -1;
    }
    private int getSum(DirectedGraph.Edge<V> edge, V to, int sum){
        //sum+=getSum(edge.getVertex())
        return 0;

    }
}
