package com.dataStructures.search;

import com.dataStructures.search.IST;

/**
 * Created by Maks on 2/27/2017.
 */
public class SymbolTable<Key extends Comparable<Key>,Value> implements IST<Key, Value> {

    private Key[] _keys;
    private Value[] _val;
    private int _count=0;
    private  static int _INIT_SIZE=8;

    public  SymbolTable(){
        _keys=(Key[]) new Object[_INIT_SIZE];
        _val=(Value[]) new Object[_INIT_SIZE];
    }


    public void put(Key key, Value value){

        if(_count==_INIT_SIZE-1)
            resize();

        delete(key);

        _keys[_count]=key;
        _val[_count]=value;
        _count++;
    }

    public void delete(Key key){
        for(int i=0; i<_count; i++){
            if(key.equals(_keys[i])){
                _keys[i]=_keys[_count-1];
                _val[i]=_val[_count-1];

                _keys[_count-1]=null;
                _val[_count-1]=null;
                _count--;
                return;
            }

        }
    }

    private void resize(){
        _INIT_SIZE*=2;
        Key[] newKeys=(Key[]) new Object[_INIT_SIZE];
        Value[] newVals=(Value[])new Object[_INIT_SIZE];

        for(int i=0; i<_count; i++){
            newKeys[i]=_keys[i];
            newVals[i]=_val[i];
        }
        _keys=newKeys;
        _val=newVals;
    }
    public Value get(Key key){

        for(int i=0; i<_count; i++){
            if(key.equals(_keys[i]))
                return _val[i];
        }
        return null;
    }



    public boolean contains(Key key){
        for(int i=0; i<_count;i++){
            if(key.equals(_keys[i]))
                return  true;
        }
        return  false;
    }

    public boolean isEmpty(){
        return _count>0;
    }
/*
    public  Iterable<Key> keys(){

    }
*/
    public  int size(){
        return _count;
    }

}
