class Solution {
    public int longestSubarray(int[] nums) {
      int zero=0;
      int l=0;
      int maxLength=0;
      for(int r=0;r<nums.length;r++){
           if(nums[r]==0){
            zero++;
           }
          while(zero>1){
            if(nums[l]==0){
                zero--;
            }
            l++;
          }
           maxLength=Math.max(maxLength,r-l);
      }
    return maxLength;
    }
}