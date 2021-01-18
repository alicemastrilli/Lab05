package it.unibo.oop.lab05.ex4;

import java.util.Comparator;

import it.unibo.oop.lab05.ex3.Product;
import it.unibo.oop.lab05.ex3.ProductImpl;

public class ComparableProducts extends ProductImpl implements Comparable<Product> {



	public ComparableProducts(String name, double quantity) {
		super(name, quantity);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compareTo(Product arg0) {
		// TODO Auto-generated method stub
		return getName().compareTo(((it.unibo.oop.lab05.ex3.Product) arg0).getName());
	}

}
