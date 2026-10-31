class Solution {
    public double findMaxAverage(int[] nums, int k) {
       double sum=0;
       for(int i=0;i<k;i++){
        sum=sum+nums[i];
       }
       double max=sum;
       int i=0;
       int j=k-1;
       while(j<nums.length-1){
        sum=sum-nums[i];
        i++;
        j++;
        sum=sum+nums[j];
        max=Math.max(sum,max);
       }
       return max/k;
    }
}