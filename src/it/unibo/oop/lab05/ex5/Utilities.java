package it.unibo.oop.lab05.ex5;

import java.util.Collection;
import java.util.Iterator;
import java.util.Random;

/**
 *
 */
public final class Utilities {

    private Utilities() {
    }

    /**
     * Copies all the element of the first collection in the second collection.
     * 
     * @param source
     *            the source collection
     * @param target
     *            the target collection
     * @param <X>
     *            Collection type
     */
    public static <X> void copyAll(final Collection<X> source, final Collection<? super X> target) {
    	target.addAll(source);
    }

    /**
     * @param coll
     *            the collection
     * @param <X>
     *            collection type
     * @return a random element from the collection
     * 
     */
    public static <X> X getRandomElement(final Collection<X> coll) {
    	int size = coll.size();
    	Random rand = new Random();
    	int k=0;
    	int elem = rand.nextInt(size);
    	for (X x : coll) {
    		if(k == elem) {
    			return x;
    		}
    		k++;
    	}
    	return null;
    }

    /**
     * @param one
     *            first collection
     * @param two
     *            second collection
     * @param <X>
     *            First collection type
     * @param <Y>
     *            Second collection type
     * @return a pair with two random elements
     */
    public static <X, Y> Pair<X, Y> getRandomPair(final Collection<X> one, final Collection<Y> two) {
        return new Pair<X,Y>(getRandomElement(one), getRandomElement(two));
    }
}
