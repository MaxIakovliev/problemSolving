package com.dataStructures.search;

/**
 * Created by Maks on 2/27/2017.
 * Interface for declaring  api of symbol table
 */
public interface IST<Key extends Comparable<Key>, Value> {
    void put(Key key, Value value);
    Value get(Key key);
    void delete(Key key);
    boolean contains(Key key);
    boolean isEmpty();

}
