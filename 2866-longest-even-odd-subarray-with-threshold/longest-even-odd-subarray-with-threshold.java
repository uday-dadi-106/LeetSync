class Solution {
    public int longestAlternatingSubarray(int[] nums, int threshold) {
       int len=0;
       int i=0;
       while(i<nums.length){
        if(nums[i]%2==0&&nums[i]<=threshold){
            int r=i;
            while(r+1<nums.length&&nums[r+1]<=threshold&&nums[r]%2!=nums[r+1]%2){
                r++;
            }
            len=Math.max(len,r-i+1);
        }
        i++;
       } 
       return len;
    }
}