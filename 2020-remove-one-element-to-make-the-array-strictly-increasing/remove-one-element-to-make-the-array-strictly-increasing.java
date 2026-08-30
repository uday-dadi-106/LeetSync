class Solution {
   public boolean check(int num[],int remove){
    int ans[]=new int[num.length-1];
      int k=0;
      for(int j=0;j<num.length;j++){
        if(j==remove){
            continue;
        }
        ans[k]=num[j];
        k++;
      }
      for(int i=1;i<ans.length;i++){
        if(ans[i-1]>=ans[i]){
            return false;
        }
      }
      return true;
   }
    public boolean canBeIncreasing(int[] nums) {
      int found=-1;
      for(int i=1;i<nums.length;i++){
        if(nums[i-1]>=nums[i]){
            found=i-1;
            break;
        }
      }  
      if(found==-1){
        return true;
      }
      if(check(nums,found)){
        return true;
      }
      if(check(nums,found+1)){
        return true;
      }
      return false;
    }
}