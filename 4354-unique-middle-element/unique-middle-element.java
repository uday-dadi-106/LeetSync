class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        if(nums.length==1){
            return true;
        }
        int n=nums[nums.length/2];
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(n==nums[i]){
                count++;
            }
        }
        return count==1?true:false;
    }
}