import java.io.*;

class Main {
	public static void main (String[] args) {
	int a[]={2,4,-10,13,-7,-60,52,8,-19};
 int j=0,c;
 for(int i=0;i<a.length;i++)
 {
     if(a[i]<0)
     {
         if(i!=j)
         {
             c=a[i];
             a[i]=a[j];
             a[j]=c;
         }
         j++;
     }
 }
	for(int i=0;i<a.length;i++)
	System.out.println(a[i]);
	}
}
