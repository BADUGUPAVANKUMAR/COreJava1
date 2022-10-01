package exceptionhandling;

public class NullpointException {

	public static void main(String[] args) {
		int a=10,b=2;
		String name = null;
		System.out.println("statment 1");
		try {
		System.out.println("statment 2and div="+(a/b));//jvm will throw arithmetic exception("/zero);  
		System.out.println("statment 3 lenth="+name.length());
		}
		catch (	ArithmeticException ae) {
			ae.printStackTrace();
		}
		catch (	nullpointexception np) {
			np.printStackTrace();
		}
		System.out.println("statment 4");
		System.out.println("statment 5");
		System.out.println("statment 6");
		System.out.println("statment 7");
		System.out.println("statment 8");
		System.out.println("statment 9");


	}

}
