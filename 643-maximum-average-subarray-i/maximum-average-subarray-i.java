class Solution {
    public double findMaxAverage(int[] nums, int k) {
       double sum=0;
       int n=nums.length;
       for(int i=0;i<k;i++){
        sum=sum+nums[i];
       } 
       double max=sum;
       int i=0;
       int j=k-1;
       while(j<n-1){
        sum=sum-nums[i];
        i++;
        j++;
        sum=sum+nums[j];
        max=Math.max(max,sum);
       }
       return max/k;
    }
}