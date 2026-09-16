class Solution {
    public boolean isTrionic(int[] nums) {
     int p=0;
     int q=0;
     for(int i=1;i<nums.length;i++){
        if(nums[i-1]>nums[i]){
            p=i-1;
            break;
        }
     }  
     for(int j=p+1;j<nums.length;j++){
        if(nums[j-1]<nums[j]){
            q=j-1;
            break;
        }
     }
     if(p==0||q==0||q==nums.length-1){
        return false;
     } 
     for(int i=1;i<=p;i++){
        if(nums[i-1]>=nums[i]){
            return false;
        }
     }
     for(int i=p+1;i<=q;i++){
        if(nums[i-1]<=nums[i]){
            return false;
        }
     }
     for(int i=q+1;i<nums.length;i++){
        if(nums[i-1]>=nums[i]){
            return false;
        }
     }
     return true;
    }
}