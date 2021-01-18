package it.unibo.oop.lab05.ex1;

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
    	TreeSet<String> set = new TreeSet<String>();
    	int i;
    	for(i = 0; i < 21; i++ ) {
    		set.add(Integer.toString(i));
    	}
    	System.out.println(set);
    	var setIterator = set.iterator();
    	while(setIterator.hasNext()) {
    		if(java.lang.Integer.parseInt(setIterator.next()) % 3 == 0) {
    			setIterator.remove();
    		}
    	}
    	
    	
    	for (String elem : set) {
    		System.out.println(elem);
    	}
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
    }
}
