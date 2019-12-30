package app.generics;

import java.util.ArrayList;
import java.util.List;

public class MaximumTest {

    public static <T extends Comparable<T>> T maximum(T x, T y, T z){

        T max = x;

        if(y.compareTo(max) > 0){
            max = y;
        }

        if(z.compareTo(max) > 0){
            max = z;
        }

        return max;

    }

    public static <T extends List> T otro(T list){
        if(list != null) {
            list.forEach(l -> System.out.println("chales " + l));
        }

        T l = list;
        return l;
    }

}
