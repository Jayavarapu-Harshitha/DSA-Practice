import java.util.Scanner;

public class Bitplusplus {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
	   int X=0;
		int t=s.nextInt();
		while(t-->0)
		{
		String st=s.next();
		if(st.charAt(0)=='+' && st.charAt(1)=='+')
		{
			++X;
		}
		else if(st.charAt(0)=='-' && st.charAt(1)=='-')
		{
			--X;
		}
		else if(st.charAt(1)=='+' && st.charAt(2)=='+')
		{
			X++;
		}
		else if(st.charAt(1)=='-' && st.charAt(2)=='-')
		{
			X--;
		}
		}
		System.out.println(X);
	}

}
