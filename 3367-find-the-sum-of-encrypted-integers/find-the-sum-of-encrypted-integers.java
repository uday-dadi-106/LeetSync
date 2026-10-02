class Solution {
   public static int encrypt(int n){
      int max=0;
      int count=0;
      while(n>0){
        int last=n%10;
        max=Math.max(max,last);
        count++;
        n=n/10;
      }
      int ans=0;
      for(int i=0;i<count;i++){
        ans=ans*10+max;
      }
      return ans;
   }
    public int sumOfEncryptedInt(int[] nums) {
     int sum=0;
     for(int i=0;i<nums.length;i++){
       sum=sum+encrypt(nums[i]); 
     } 
     return sum;
    }
}