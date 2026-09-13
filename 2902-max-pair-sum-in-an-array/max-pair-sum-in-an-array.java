class Solution {
   static int sum(int a){
    int max=Integer.MIN_VALUE;
     while(a>0){
       int last=a%10;
       max=Math.max(max,last);
       a=a/10;
     }
     return max;
   } 
   static int sum1(int b){
    int max1=Integer.MIN_VALUE;
     while(b>0){
       int last=b%10;
       max1=Math.max(max1,last);
       b=b/10;
     }
     return max1;
   }    
    public int maxSum(int[] nums) {
        Arrays.sort(nums);
        int ans=-1;
        for(int i=nums.length-1;i>0;i--){
            for(int j=i-1;j>=0;j--){
                int f=sum(nums[i]);
                int s=sum1(nums[j]);
                if(f==s){
                ans=Math.max(ans,nums[i]+nums[j]);
                }
            }
        }
        return ans;
    }
}