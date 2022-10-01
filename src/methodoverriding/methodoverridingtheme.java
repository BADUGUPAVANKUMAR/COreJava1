package methodoverriding;

public class methodoverridingtheme {
	void login(String Name, String password){
        System.out.println("the stores is two types");
    }
    String search(String profileName){
        return "wholesale store ";
    }
    String search(String job,String internship){
        return "retail store";
    }
    public static void main(String arg[]){
    	methodoverridingtheme pavan = new methodoverridingtheme();
    	pavan.login("Surendra","Varma@123");
        System.out.println(pavan.search("big investment"));
        System.out.println(pavan.search("small investment"));
    }
	

}

