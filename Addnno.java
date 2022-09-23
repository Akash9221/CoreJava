package Demo;
// Accept n number from user using command line and display its total sum//
public class Addnno {

	public static void main(String[] args) 
	{
		if(args.length==0)
		{
			System.out.println("No argument pass");
			System.exit(0);
		}
		int sum=0;
		for(int i=0;i<args.length;i++)
		{
			int num=Integer.ParseInt(args[i]);
			sum=sum+num;
		}
			System.out.println("Additio is="+sum);
			
	}

}
