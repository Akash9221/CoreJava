package Scanner;

public class addscanner {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		
		System.out.print("Enter the 1st number");
		int a=sc.nextInt();
		
		System.out.println("Enter the 2nd number");
		int b=sc.nextInt();
		
		int c=a+b;
		System.out.println("Sum is="+c);
				

	}

}
