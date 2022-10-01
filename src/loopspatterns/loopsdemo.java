package loopspatterns;

public class loopsdemo {

	public static void main(String[] args) {
		for (int i=1;i<=5;i++) {
			for (int j=1;j<=i;j++) {
				System.out.print(j);
				
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		for (int i=1;i<=5;i++) {
			for (int j=i;j<=5;j++) {
				System.out.print("$");
		
	}
			System.out.println();
	}
		System.out.println();
		System.out.println();
		int k= 1;
		for (int i=1;i<=3;i++) {		
			for (int j=1;j<=3;j++) {
				System.out.print(k);
				k++;
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		for (int i=1;i<=1;i++) {		
			for (int j=1;j<=10;j++) {
				System.out.print(j);
				
			}
			System.out.println();
		}
		for (int i=1;i<=1;i++) {		
			for (int j=1;j<=10;j++) {
				System.out.println(j);
			}
			System.out.println();
		}
		for (int i=1;i<=1;i++) {		
			for (int j=1;j<=10;j++) {
				System.out.println(j);
				for (int j=1; j<=i;)
			}
		}
}
}