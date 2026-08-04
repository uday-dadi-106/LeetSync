class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int n=arr.length;
        int sum=0;
        int count=0;
        for(int i=0;i<k;i++){
            sum=sum+arr[i];
        }
        if(sum/k>=threshold){
            count++;
        }
        int l=0,r=k-1;
        while(r<n-1){
           sum=sum-arr[l];
           l++;
           r++;
           sum=sum+arr[r];
           if(sum/k>=threshold){
            count++;
           }
        }
        return count;
    }
}