import java.util.Scanner;

public class Chef_and_his_fruit_stand {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t-->0)
		{
			int x=s.nextInt();
			int y=s.nextInt();
			if(x>2*y )
			{
				System.out.println(y);
			}
			else 
			{
				System.out.println(x/2);
			}
			
		}

	}

}
