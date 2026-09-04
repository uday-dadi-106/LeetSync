class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i=0;
        int j=0;
        int max=Integer.MAX_VALUE;
        int sum=0;
        while(j<nums.length){
            sum=sum+nums[j];
            while(sum>=target){
                sum=sum-nums[i];
                max=Math.min(max,j-i+1);
                i++;
            }
            j++;
        }
        return max==Integer.MAX_VALUE?0:max;
    }
}