class Reverse
{
    public static int[]  reversearray(int[] arr,int n) {
		int[] rev=new int[n];
		int j=0;
		for(int i=n-1;i>=0;i--)
		{
			 rev[i]=arr[j];
			 j++;
		}
		return rev;
    }
}
