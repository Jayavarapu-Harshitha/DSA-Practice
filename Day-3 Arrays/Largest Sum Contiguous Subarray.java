
class Solution{
    long maxSubarraySum(int a[], int n){  
        int max = a[0];
    int curr_max = a[0];
    for (int i = 1; i <a.length; i++)
    {
           curr_max = Math.max(a[i], curr_max+a[i]);
        max = Math.max(max, curr_max);
    }
          return max;
    }
}
