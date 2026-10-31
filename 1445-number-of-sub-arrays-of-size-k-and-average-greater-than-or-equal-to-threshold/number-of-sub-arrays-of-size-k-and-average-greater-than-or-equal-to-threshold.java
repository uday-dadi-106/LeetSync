class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
       int count=0;
       int sum=0;
       for(int i=0;i<k;i++){
        sum=sum+arr[i];
       }
       if(sum/k>=threshold){
        count=count+1;
       }
       int i=0;
       int j=k-1;
       while(j<arr.length-1){
        sum=sum-arr[i];
        i++;
        j++;
        sum=sum+arr[j];
        if(sum/k>=threshold){
            count=count+1;
        }
       }
       return count;
    }
}