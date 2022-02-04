
import java.util.Scanner;
import java.math.*;
public class Soft_Drinking {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int k=s.nextInt();
		int l=s.nextInt();
		int c=s.nextInt();
		int d=s.nextInt();
		int p=s.nextInt();
		int nl=s.nextInt();
		int np=s.nextInt();
         
		int toasts=(k*l)/nl;
		int limes=c*d;
		int salt=p/np;
	    int result=(Math.min(Math.min(toasts,limes),salt))/n;
	      System.out.println(result);
	}

}
