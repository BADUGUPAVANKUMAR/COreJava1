package Interfacedemo;
interface alchohol{
	void brand() ;
	void cost();
}
abstract class lightstrong implements alchohol{
	  void lowalchohol () { 
		  System.out.println(" serves for evry one " );
	  }
 } 
   abstract class hard implements alchohol{
		  void highalchohol() { 
			  System.out.println("serves only above 21 years " );
 }
 } 
   class kf extends lightstrong{
	public void brand() {
		super.lowalchohol();
		 System.out.println("kingfisher light beer" );
}
	public void cost() {
		 System.out.println("180/- " );
}
   }
   class classbarg extends lightstrong{
	public void brand() {
		 System.out.println("classburg is also a light beer " );
	}
	public void cost() {
		 System.out.println(" 160/- " );	
	}   
   }
   class bp extends hard {
	public void brand() { 
        super.highalchohol();
		System.out.println("blenders pride  " );	
	}
	public void cost() {
		 System.out.println(" 750ml is  1400/- " );		
	}   
   }
   class genaration extends hard {
	public void brand() {
		System.out.println("genaration " );	
	}
	public void cost() {
		 System.out.println("750ml is 1150/- " );	
	}   
   }
public class interface2 {
	public static void main(String[] args) {
		alchohol obj;
         System.out.println("-------kf--details--------");
         obj = new kf ();
         obj.brand();
         obj.cost();
         System.out.println("-------classbarg--details--------");
         obj = new classbarg ();
         obj.brand();
         obj.cost();
         System.out.println("-------bp--details--------");
         obj = new bp ();
         obj.brand();
         obj.cost();
         System.out.println("-------genaration--details--------");
         obj = new genaration ();
         obj.brand();
         obj.cost();      
	}
}

