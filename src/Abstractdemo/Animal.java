package Abstractdemo;
import java.util.Scanner;
abstract class Animal1 {
	Scanner sc = new Scanner(System.in);
     abstract void lifespan ();
     abstract void  breed ();
}
      class dog extends  Animal1{
		void lifespan() {
			String name;
			
			System.out.println("LIFESPANE ");
			name = sc.next();
		}
		void breed() {
			String name;
			  System.out.println("BREED ");
			  name = sc.next();
		}
      }
    	  class horse extends Animal1{
			void lifespan() {
				String name;
				System.out.println("LIFESPANE ");
				name = sc.next();
			}
			@Override
			void breed() {
				String name;
				  System.out.println("BREED");
				  name = sc.next();
			}
    	  }
   
    public class Animal{	  
	public static void main(String[] args) {
		Animal1 obj;
		System.out.println("ANIMAL  NAME IS ----DOG");
		obj = new dog();
		obj.lifespan();
		obj.breed();
		System.out.println("ANIMAL NAME IS -----HOURSE");
		obj = new horse();
		obj.lifespan();
		obj.breed();
	}
}
