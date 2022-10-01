package Collection;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
public class IteratorDemo {

	public static void main(String[] args) {
		LinkedHashSet<Integer> p = new LinkedHashSet<Integer>();
		 p.add(2021 );
		 p.add(2023);
		 p.add(2025);
		 p.add(2027 );
		 p.add(2029);
		 p.add(20210);
		 p.add(2021) ;

		 System.out.println(p);
		 Iterator<Integer> i = p.iterator();
		 while (i.hasNext()) {
			 System.out.println(i.next());
 }
 }

}
