class Solution {
    public static int sum(int num){
        int sumofdigit=0;
        while(num>0){
            int last=num%10;
            sumofdigit=sumofdigit+last;
            num=num/10;
        }
        return sumofdigit;
    }
    public int smallestIndex(int[] nums) {
      int ans=-1;
      for(int i=0;i<nums.length;i++){
        int reuslt=sum(nums[i]);
        if(reuslt==i){
            ans=i;
            break;
        }
      } 
      return ans;
    }
}