package com.dataStructures;

import java.util.ArrayList;
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

    public  void add(V vertex){
        if(contains(vertex))
            return;
        neighbours.put(vertex, new ArrayList<Edge<V>>());
    }

    public  boolean contains(V vertex){
        return neighbours.containsKey(vertex);
    }
    public  void add(V from, V to, int cost){
        this.add(from);
        this.add(to);
        neighbours.get(from).add(new Edge<V>(to,cost));
    }

    public  boolean isEdge(V from, V to){
        for(Edge<V> e: neighbours.get(from)){
            if(e.vertex.equals(to))
                return true;
        }
        return  false;
    }

    public  int getCost(V from, V to){
        for(Edge<V> e: neighbours.get(from)){
            if (e.vertex.equals(to))
                return  e.cost;
        }
        return  -1;
    }

}
