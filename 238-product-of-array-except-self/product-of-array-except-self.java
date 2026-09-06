class Solution {
    public int[] productExceptSelf(int[] nums) {
     int ans[]=new int[nums.length];
     Arrays.fill(ans,1);
     int prefix=1;
     for(int i=0;i<nums.length;i++){
        ans[i]=prefix;
        prefix=prefix*nums[i];
     }
     int sufix=1;
     for(int j=nums.length-1;j>=0;j--){
        ans[j]=ans[j]*sufix;
        sufix=sufix*nums[j];
     }
     return ans;
    }
}