package methodoverriding;
class Animal {
	  public void animalSound() {
	    System.out.println("The animal makes a sound");
	  }
	}

	class Pig extends Animal {
		int x=10;
	  public void animalSound() {
		 //super.animalSound(); 

	    System.out.println("The pig says: wee wee");
	    //System.out.println("the value is "+x);
	    //System.out.println("my name is "+name);
	  }
	}

	class Dog extends Animal {
	  public void animalSound() {
	    System.out.println("The dog says: bow wow");
	  }
	}

	class overriding {
	  public static void main(String[] args) {
	   // Create a Animal object
	    Animal pavan = new Animal();
	    // Create a Pig object
	   // Animal myDog = new Dog();  // Create a Dog object
	    pavan.animalSound();
	    
	    pavan =new Dog();
	    pavan.animalSound();
	    pavan = new Pig();
	    pavan.animalSound();
	  }
	}
