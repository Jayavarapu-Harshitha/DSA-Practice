import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Points_and_Lines {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		int count=0;
		
		while(t-->0)
		{
			int x=s.nextInt();
			int y[]=new int[x];
			int z[]=new int[x];
			HashSet<Integer> hm=new HashSet<>();
			HashSet<Integer> hl=new HashSet<>();
			for(int i=0;i<x;i++)
			{
				 y[i]=s.nextInt();
				 z[i]=s.nextInt();
				 hm.add(y[i]);
				 hl.add(z[i]);
			}
			System.out.println(hm.size()+hl.size());
			hm.clear();
			hl.clear();
		}
	}

}
