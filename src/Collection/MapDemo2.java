package Collection;
import java.awt.RenderingHints.Key;
import java.util.Map;
import java.util.TreeMap;
public class MapDemo2 {

	public static void main(String[] args) {
		TreeMap<Integer,String> p = new TreeMap<Integer,String>();
		 p.put(2021, "avinash");
		 p.put(2023, "akhil");
		 p.put(2025, "nikhil");
		 p.put(2027, "ravi");
		 p.put(2029, "ganesh");
		 p.put(20210, "harshavardhan");
		 p.put(2021, "pavankumar");
		 System.out.println(p);
		 
		 for (Map.Entry<Integer , String> s : p.entrySet()) {
			 System.out.println(s.getKey()+"  "+s.getValue());
		 }
	}	 
	}	 
		 
	//	 p.forEach((key,value)->System.out.println(key+" "+value ));
	//}

