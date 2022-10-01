package Collection;

import java.util.*;
import java.util.HashMap;
import java.util.Map.Entry;
public class spliteratordemo {

	public static void main(String[] args) {
     HashMap<Integer,String> p = new HashMap<Integer,String>();
		 p.put(2021, "avinash");
		 p.put(2023, "akhil");
		 p.put(2025, "nikhil");
		 p.put(2027, "ravi");
		 p.put(2029, "ganesh");
		 p.put(20210, "harshavardhan");
		 p.put(2021, "pavankumar");
		 System.out.println(p);
		 Set<Entry<Integer,String>> s = p.entrySet();
		 Spliterator<Entry<Integer,String>> obj= s.spliterator();
		 obj.forEachRemaining(System.out::println);
		 
	}

}
