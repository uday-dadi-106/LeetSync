class Solution {
    public int minimumSubarrayLength(int[] nums, int k) {
      int ans=Integer.MAX_VALUE;
      for(int i=0;i<nums.length;i++){
        int sum=0;
        for(int j=i;j<nums.length;j++){
           sum=sum|nums[j];
           if(sum>=k){
            ans=Math.min(ans,j-i+1);
            break;
           }
        }
      }
      return ans==Integer.MAX_VALUE?-1:ans;
    }
}