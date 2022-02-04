import java.util.Scanner;

public class BeautifulMatrix {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int a[][]=new int[5][5];
	int index=0,in=0;
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				a[i][j]=s.nextInt();
				if(a[i][j]==1)
				{
					 index=i;
					in=j;
					System.out.println(i);
					System.out.println(j);
				}
			}
		}
		if(index==2)
			System.out.println(Math.abs(2-in));
		else
		{
			System.out.println(Math.abs(in-2)+Math.abs(index-2));
		}
		
	}

}
