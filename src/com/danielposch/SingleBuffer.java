package com.danielposch;

/**
 * Created by Danni on 2016-04-14.
 */
public class SingleBuffer<T> {
    private T buffer;

    public SingleBugffer(){
        buffer = null;
    }

    public boolean put(T add){
        if(buffer = null){
           return true;
        }
        return false;
    }

    public T get(T getBuffer){
        if(buffer = null){
            return null;
        }
        else{
            T temp = buffer;
            buffer = null;
            return temp;
        }
    }


}
