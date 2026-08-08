class Solution {
    public int minMaxGame(int[] nums) {
        int n=nums.length;
         while(n>1){
           int a[]=new int[n/2];
           for(int i=0;i<nums.length/2;i++){
            if(i%2==0){
                a[i]=Math.min(nums[2 * i],nums[2 * i + 1]);
            }else{
                a[i]=Math.max(nums[2*i],nums[2*i+1]);
            }
           }
           nums=a;
           n=n/2;
         }
    return nums[0]; 
    }
}