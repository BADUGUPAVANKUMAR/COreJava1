package Arrays;
import java.util.Scanner;
public class Arraysdemo {
	
	public static void main(String[] args) {
		int a[];
		a = new int[5];
		Scanner sc = new Scanner(System.in);
		for (int i=0; i<5; i++) {
			System.out.println("enter the array element");
			a[i]= sc.nextInt();
			
		}
		//int sum=0;
		for (int i=0; i<5; i++) {
			//sum=sum+a[i];
			System.out.println("a["+i+"]="+a[i]);
	}
		//System.out.println("sum="+sum);
	}
}
///////////// for lopp we used 