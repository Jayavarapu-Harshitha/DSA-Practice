
import java.util.Scanner;

public class Fit_in_Data_Type {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t-->0)
		{
			int x=s.nextInt();
			int y=s.nextInt();
			if(y<x)
				System.out.println(y);
			else if(x==y)
				System.out.println(0);
			else
			{
				while(y>x)
				{
				   y=y-x-1;
				}
				   System.out.println(y);

			}
		}
	}

}
