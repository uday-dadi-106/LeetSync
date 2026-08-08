class Solution {
    public int triangularSum(int[] nums) {
      int n=nums.length;
      while(n>1){
        int a[]=new int[n-1];
        int i=0;
        while(i<n-1){
            a[i]=(nums[i]+nums[i+1])%10;
            i++;
        }
        n--;
        nums=a;
      } 
    return nums[0]; 
    }
}