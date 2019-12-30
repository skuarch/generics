package app.generics;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Integer[] intArray = {1,2,3,4,5,6};
        printArray(intArray);

        Character[] charAray = {'A','2','3','4','5','6'};
        printArray(charAray);

        // ----------------------------------------------
        Integer max = MaximumTest.maximum(3, 6 ,9 );
        System.out.println("el maximo " + max);

        String mx = MaximumTest.maximum("A", "B", "C");
        System.out.println("otro max " + mx);

        // ----------------------------------------------
        List<String> list = new ArrayList<>();
        list.add("mocos");
        List<String> r = MaximumTest.otro(list);
        System.out.println("la lista " + r);
    }

    public static <T> T printArray(T[] inputArray) {

        T element = null;

        for(T e: inputArray) {
            element = e; // just to have a return
            System.out.printf("%s ", e);
        }
        System.out.println();
        return element;

    }

}
