class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum=0;
        int n=nums.length;
        for(int i=0;i<k;i++){
            sum=sum+nums[i];
        }
      int l=0,r=k-1;
      double maxavg=sum;
      while(r<n-1){
       sum=sum-nums[l];
       l++;
       r++;
       sum=sum+nums[r];
       maxavg=Math.max(maxavg,sum);
      }
      return maxavg/k;
    }
}