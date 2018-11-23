package sets;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestSetDouble {

	public static void main(String[] args) {
		
		
		//create HashSet with values
		Set<Double> set = new HashSet<>(Arrays.asList(1.5, 8.25, -7.32, 13.3, -12.45, 48.5, 0.01));
		
		System.out.println(set.toString());
	
		//largest value of the collection
		System.out.println(Collections.max(set));
		
		//find smallest value and remove it from the collection
		set.remove(Collections.min(set));
		System.out.println(set.toString());
		
		//change all negative values to positive
		HashSet<Double> set2 = new HashSet<Double>();
		
		for (Double value : set) {
			if (value < 0) {	
				set2.add(Math.abs(value));
			}else {
				set2.add(value);
			}
		}
		set.clear();
		set.addAll(set2);
		
		
		System.out.println(set.toString());
		
	}

}
