package cal_demo;
import java.util.Scanner;

public class CalDemo {

	public static void main(String[] args) {
		float a,b,ans;
		int choice;
		try (Scanner sc = new Scanner(System.in)){
			System.out.println("Addition");
			System.out.println("Subtract");
			System.out.println("multiplication");
			System.out.println("Division");
			System.out.println("Enter your choice (1-4):");
			choice=sc.nextInt();
			if(choice>=1&&choice<=4)
			{
				System.out.print("Enter any two Number:\n");
				       a=sc.nextFloat();
				       b=sc.nextFloat();
				       if(choice==1)
				    	   ans=a+b;
				       else if(choice==2)
				    	   ans=a-b;
				       else if(choice==3)
				    	   ans=a*b;
				       else
				    	   ans=a/b;
				       System.out.println("\nOutput ="+ans);
			}
			else
				System.out.println("\nInvalid Choice");
		
			}

	}

}
