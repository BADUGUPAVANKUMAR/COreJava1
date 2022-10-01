package Abstractdemo;
import java.util.Scanner;
abstract class store {
	Scanner sc = new Scanner(System.in);
     abstract void wholesale ();
     abstract void  retail ();
}
      class City extends store{
		void wholesale() {
			String name;
			System.out.println("what is whole sale");
			name = sc.next();
		}
		void retail() {
			String name;
			  System.out.println("what is retaile");
			  name = sc.next();
		}
      }
    	  class village extends store{
			void  wholesale() {
				String name;
				System.out.println("what is whole sale ");
				name = sc.next();
			}
			@Override
			void retail() {
				String name;
				  System.out.println("what is retail");
				  name = sc.next();
			}
    	  }
   public class Sports {  
	public static void main(String[] args) {
		store obj;
		obj = new village();
		obj.wholesale();
		obj.retail();
		obj = new City();
		obj.wholesale();
		obj.retail();
	}
}
