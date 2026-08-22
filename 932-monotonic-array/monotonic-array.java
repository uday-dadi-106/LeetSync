class Solution {
    public boolean isMonotonic(int[] nums) {
      boolean incre=true;
      boolean dec=true;
      for(int i=1;i<nums.length;i++){
        if(nums[i-1]<nums[i]){
            incre=false;
        }
        if(nums[i-1]>nums[i]){
            dec=false;
        }
      }
      return incre||dec;
      }  
}
