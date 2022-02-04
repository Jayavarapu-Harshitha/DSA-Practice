
import java.util.Arrays;
import java.util.Scanner;

public class Meeting_Friends {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int a[]=new int[3];
	 a[0]=s.nextInt();
     a[1]=s.nextInt();
	 a[2]=s.nextInt();
	 Arrays.sort(a);
	 System.out.println((a[2]-a[1])+(a[1]-a[0]));

	}

}
