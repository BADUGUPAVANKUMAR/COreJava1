package Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class List_Collection {

	public static void main(String[] args) {
		List<String> set = new ArrayList<String>();
		set.add("Vijay balu");
		set.add("Uday kiran");
		set.add("Pavan Kumar");
		set.add("Pavan Kalyan");
		set.add("Sai krishna");
		System.out.println(set);
		
		List<Integer> set1 = new LinkedList<Integer>();
		set1.add(3);
		set1.add(4);
		set1.add(5);
		set1.add(6);
		System.out.println(set1);
		
		List<Float> set3 = new Vector<Float>();
		set3.add(2.35f);
		set3.add(3.56f);
		set3.add(4.78f);
		set3.add(6.98f);
		System.out.println(set3);
		
     
	}

    }
