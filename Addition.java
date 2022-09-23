package Demo;
//Accept two number using command line and display its sum//
public class Addition {

	public static void main(String[] args) 
	 {
		if(args.length==2)
		{
			int a=Integer.parseInt(args[0]);
			int b=Integer.parseInt(args[1]);
			int ans=a+b;
			
			System.out.println("Sum is:+ans");
		}
		else
		{
			System.out.println("Less no of arguments");
			
			
			
		}

	}

}
