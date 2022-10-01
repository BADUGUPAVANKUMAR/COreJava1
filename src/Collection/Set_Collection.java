package Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
public class Set_Collection {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("Vijay balu");
		set.add("Uday kiran");
		set.add("Pavan Kumar");
		set.add("Pavan Kalyan");
		set.add("Sai krishna");
		System.out.println(set);
		
		Set<Integer> set1 = new LinkedHashSet<Integer>();
		set1.add(3);
		set1.add(4);
		set1.add(5);
		set1.add(6);
		System.out.println(set1);
		
		Set<Float> set3 = new TreeSet<Float>();
		set3.add(2.35f);
		set3.add(3.56f);
		set3.add(4.78f);
		set3.add(6.98f);
		System.out.println(set3);
	}
}
