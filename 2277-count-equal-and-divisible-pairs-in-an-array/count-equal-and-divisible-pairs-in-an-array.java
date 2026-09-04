class Solution {
    public int countPairs(int[] nums, int k) {
      int i=0;
      int j=i+1;
      int count=0;
      while(i<nums.length-1){
        if(nums[i]==nums[j]){
            if(i*j%k==0){
                count++;
            }
        }
        if(j>=nums.length-1){
            i++;
            j=i+1;
        }else{
            j++;
        }
      }
    return count;
    }
}