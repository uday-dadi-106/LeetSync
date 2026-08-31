class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
       int count=0;
       int avg=0;
       int n=arr.length;
       for(int i=0;i<k;i++){
          avg=avg+arr[i];
       }
       if(avg/k>=threshold){
        count++;
       }
       int max=avg;
       int i=0;
       int j=k-1;
       while(j<n-1){
         max=max-arr[i];
         i++;
         j++;
         max=max+arr[j];
         if(max/k>=threshold){
            count++;
         }
       }
       return count;
    }
}