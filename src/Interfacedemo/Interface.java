package Interfacedemo;
      
interface vehicle{
	void cost() ;
	void milage();
	}
   abstract class car implements vehicle{
	  void viper() { 
		  System.out.println("viper is used cleannig the car glasses" );
	  }
  } 
   abstract class bike implements vehicle{
		  void stand() { 
			  System.out.println("stand it is used for hold the bike " );
		  }
	  } 
   class audi extends car{

	@Override
	public void cost() {
		super.viper();
		
		 System.out.println("the audi cost is :25lk " );
	}
@Override
	public void milage() {
		 System.out.println("audi milage is 1,liter per 15kilometers " );
	}
	   
   }
   class bmw extends car{

	@Override
	public void cost() {
		
		 System.out.println("the BMW cost is :1cro " );
	}

	@Override
	public void milage() {
		 System.out.println("BMW milage is 1,liter per 13kilometers " );
		
	}
	   
   }
   class apach extends bike {

	@Override
	public void cost() {
		super.stand();
		System.out.println("the apache cost is :1lk " );
		
	}

	@Override
	public void milage() {
		 System.out.println("the apache is 1,liter per 35 to 40kilometers " );
			
	}
	   
   }
   class Fz extends bike {

	@Override
	public void cost() {
		System.out.println("the Fz cost is :l.2lk " );
		
	}

	@Override
	public void milage() {
		 System.out.println("the Fz is 1,liter per 35kilometers " );
		
	}
	   
   }
public class Interface {

	public static void main(String[] args) {
		
         vehicle obj;
         System.out.println("-------AUDI--details--------");
         obj = new audi ();
         obj.cost();
         obj.milage();
         System.out.println("-------BMW--details--------");
         obj = new bmw ();
         obj.cost();
         obj.milage();
         System.out.println("-------APACHE--details--------");
         obj = new apach ();
         obj.cost();
         obj.milage();
         System.out.println("-------FZ--details--------");
         obj = new Fz ();
         obj.cost();
         obj.milage();
         
	}

}
