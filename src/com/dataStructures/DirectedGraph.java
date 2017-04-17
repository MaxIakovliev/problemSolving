package com.dataStructures;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Maks on 4/17/2017.
 */
public class DirectedGraph<V> {
    public static  class Edge<V> {
        private V vertex;
        private int cost;
        public Edge(V v, int c){
            vertex=v;
            cost=c;
        }

        public  V getVertex(){
            return vertex;
        }

        public  int getCost(){
            return cost;
        }
    }
    private Map<V, List<Edge<V>>> neighbours;

    public DirectedGraph(){
        neighbours=new HashMap<>();
    }

}
