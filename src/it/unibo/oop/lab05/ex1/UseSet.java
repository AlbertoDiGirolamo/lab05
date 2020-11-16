package it.unibo.oop.lab05.ex1;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Example class using {@link Set}.
 * 
 */

public final class UseSet {

    private UseSet() {
    }

    /**
     * @param args
     *            ignored
     */
    public static void main(final String[] args) {
        /*
         * Considering the content of "UseCollection, write a program which, in
         * order:
         * 
         * 1) Builds a TreeSet containing Strings
         * 
         * 2) Populates such Collection with all the Strings ranging from "1" to
         * "20"
         * 
         * 3) Prints its content
         * 
         * 4) Removes all those strings whose represented number is divisible by
         * three
         * 
         * 5) Prints the content of the Set using a for-each costruct
         * 
         * 6) Verifies if all the numbers left in the set are even
         */
    	
    	final int MAXNUM=20;
    	
    	final Set<String> set = new TreeSet<>();
    	
    	for (int i = 1; i <= MAXNUM; i++) {
    		set.add(Integer.toString(i));
    	}
    	
    	for (final String s : set) {
    		System.out.println(s);
    	}
    	
    	//for (final String s : set) {
    		//set.removeAll(set);
    	//}
    	
    	for (final String s : set) {
    		if(Integer.parseInt(s) % 3 ==0) {
    			Iterator<String> itr = set.iterator();
    			itr.remove();
    		}
    	}
    	

    	
    }
}
