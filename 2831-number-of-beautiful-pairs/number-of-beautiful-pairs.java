class Solution {
   public static int gcd(int a,int b){
    while(b!=0){
        int rem=a%b;
        a=b;
        b=rem;
    }
    return a;
   }
    public int countBeautifulPairs(int[] nums) {
      int count=0;
      for(int i=0;i<nums.length-1;i++){
        int a=nums[i];
        while(a>=10){
            a=a/10;
        }
        for(int j=i+1;j<nums.length;j++){
            int num=nums[j];
            int b=num%10;
            if(gcd(a,b)==1){
                count++;
            }
        }
      }
      return count;
    }
}