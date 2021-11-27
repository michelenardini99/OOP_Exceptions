package it.unibo.oop.lab.collections1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Example class using {@link java.util.List} and {@link java.util.Map}.
 * 
 */
public final class UseCollection {
    
    private static final int START = 1000;
    private static final int END = 2000;
    private static final int ELEMS = 100_000;
    private static final int TO_MS = 1_000_000;
    private static final int READS = 10_000;
    private static final long AMERICAS = 972_005_000L;
    private static final long AFRICA = 1_110_635_000L;
    private static final long EUROPE = 742_452_000L;
    private static final long ASIA = 4_298_723_000L;
    private static final long OCEANIA = 38_304_000L;
    private static final long ANTARCTICA = 0L;

    private UseCollection() {
    }

    /**
     * @param s
     *            unused
     */
    public static void main(final String... s) {
        /*
         * 1) Create a new ArrayList<Integer>, and populate it with the numbers
         * from 1000 (included) to 2000 (excluded).
         */
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=START; i < END; i++) {
            arr.add(i);
        }
        System.out.println(arr);
        /*
         * 2) Create a new LinkedList<Integer> and, in a single line of code
         * without using any looping construct (for, while), populate it with
         * the same contents of the list of point 1.
         */
        LinkedList<Integer> linkl = new LinkedList<>(arr);
        System.out.println(linkl);
        /*
         * 3) Using "set" and "get" and "size" methods, swap the first and last
         * element of the first list. You can not use any "magic number".
         * (Suggestion: use a temporary variable)
         */
        final int lastN = arr.get(arr.size()-1);
        arr.set(arr.size()-1, arr.get(0));
        arr.set(0, lastN);
        /*
         * 4) Using a single for-each, print the contents of the arraylist.
         */
        for(int i: arr){
            System.out.print(i + "|");
        }
        /*
         * 5) Measure the performance of inserting new elements in the head of
         * the collection: measure the time required to add 100.000 elements as
         * first element of the collection for both ArrayList and LinkedList,
         * using the previous lists. In order to measure times, use as example
         * TestPerformance.java.
         */
        long time = System.nanoTime();
        
        for(int i = 0; i < ELEMS; i++) {
            arr.add(i);
        }
        
        time = System.nanoTime() - time;
        System.out.println("\nConverting " + ELEMS
                + " int to String and inserting them in a Set took " + time
                + "ns (" + time / TO_MS + "ms)");
        
        time = System.nanoTime();
        for(int i = 0; i < ELEMS; i++) {
            linkl.add(i);
        }
        time = System.nanoTime() - time;
        System.out.println("\nConverting " + ELEMS
                + " int to String and inserting them in a Set took " + time
                + "ns (" + time / TO_MS + "ms)");
        /*
         * 6) Measure the performance of reading 1000 times an element whose
         * position is in the middle of the collection for both ArrayList and
         * LinkedList, using the collections of point 5. In order to measure
         * times, use as example TestPerformance.java.
         */
        time = System.nanoTime();
        for(int i=0; i < READS; i++) {
            arr.get(arr.size()/2);
        }
        time = System.nanoTime() - time;
        System.out.println("\nReading " + READS
                + " time a element took " + time
                + "ns (" + time / TO_MS + "ms)");
        
        time = System.nanoTime();
        for(int i=0; i < READS; i++) {
            arr.get(arr.size()/2);
        }
        time = System.nanoTime() - time;
        System.out.println("\nReading " + READS
                + " time a element took " + time
                + "ns (" + time / TO_MS + "ms)");
        /*
         * 7) Build a new Map that associates to each continent's name its
         * population:
         * 
         * Africa -> 1,110,635,000
         * 
         * Americas -> 972,005,000
         * 
         * Antarctica -> 0
         * 
         * Asia -> 4,298,723,000
         * 
         * Europe -> 742,452,000
         * 
         * Oceania -> 38,304,000
         */
        Map<String, Long> world = new HashMap<>();
        world.put("Americas", AMERICAS);
        world.put("Africa", AFRICA);
        world.put("Europe", EUROPE);
        world.put("Asia", ASIA);
        world.put("Oceania", OCEANIA);
        world.put("Antarctica", ANTARCTICA);
        /*
         * 8) Compute the population of the world
         */
        long totPop = 0;
        for(Long pop: world.values()) {
            totPop+=pop;
        }
        System.out.println("Tot population: "+totPop);
    }
}
