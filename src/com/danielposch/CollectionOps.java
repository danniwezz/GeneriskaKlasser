package collection;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Function;

public class CollectionOps {

    // Put your code for print here ...
    public static void<T> void print(Collection<T> l){
        int check = 0;
        System.out.print("[");
        for(T temp : l){
            if(check = 0) {
                System.out.print(temp.toString());
                check++;
            }
            else{System.out.print(","+temp.toString());}
        }
        System.out.print("]");
    }
    
    // Put your code for reverse here ...
    public static <T> List<T> reverse(List<T> l){
        
    }

    // Put your code for less here ...
    
    // Example
    public static <T,R> Collection<R>
    map(Function<T,R> f, Collection<T> c)
    {
        // Determine the dynamic type of the collection
        Class<? extends Collection> cls = c.getClass();
        try {
            // Create an object of the same dynamic type as c
            Collection<R> result = (Collection<R>)cls.newInstance();
            // type.cast(type.newInstance());
            // Copy the elements and apply op to them
            for ( T x : c )
                result.add(f.apply(x));
            return result;   
        }   
        catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    // Put your code for filter here ...

}
