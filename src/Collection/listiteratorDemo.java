package Collection;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
	
public class listiteratorDemo {

		public static void main(String[] args) {
			List<Integer> p = new LinkedList<Integer>();
			 p.add(2021 );
			 p.add(2023);
			 p.add(2025);
			 p.add(2027 );
			 p.add(2029);
			 p.add(20210);
			 p.add(2022) ;

			
			 ListIterator i = p.listIterator();
			 while (i.hasNext()) {
				 System.out.println(i.next());
				 
	 }
			 System.out.println("=======================");
		
			while (i.hasPrevious()) {
				 System.out.println(i.previous());
	 }
		}
	}
