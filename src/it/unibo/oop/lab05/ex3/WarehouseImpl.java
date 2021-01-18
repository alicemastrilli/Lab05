package it.unibo.oop.lab05.ex3;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class WarehouseImpl implements Warehouse {
	private LinkedHashSet<Product> set = new LinkedHashSet<>();
	

	

	@Override
	public void addProduct(Product p) {
		if(!containsProduct(p)) {
			set.add(p);
		}
		
		// TODO Auto-generated method stub

	}

	@Override
	public Set<String> allNames() {
		TreeSet<String> names = new TreeSet<>();
		for(Product p : set) {
			names.add(p.getName());
		}
		// TODO Auto-generated method stub
		return names;
	}

	@Override
	public Set<Product> allProducts() {
		// TODO Auto-generated method stub
		return new LinkedHashSet<>(set);
	}

	@Override
	public boolean containsProduct(Product p) {
		for(Product prod : set) {
			if(prod.getName() == p.getName()) {
				return true;
			}
		}
		return false;
	}

	@Override
	public double getQuantity(String name) {
		double i =0;
		for(Product p : set) {
			if(p.getName() == name) {
				i++;
			}
		}
		// TODO Auto-generated method stub
		return i;
	}

}
