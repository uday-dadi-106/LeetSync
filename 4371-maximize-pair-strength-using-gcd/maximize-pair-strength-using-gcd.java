class Solution {
    public static int gcd(int a,int b){
        while(b!=0){
            int temp=a%b;
            a=b;
            b=temp;
        }
        return a;
    }
    public long maxPairStrength(int[] nums) {
     long ans=Integer.MIN_VALUE;
     int i=0;
     int j=1;
     while(i<nums.length-1){
        long mu=(long)nums[i]*nums[j];
        long  mu1=gcd(nums[i],nums[j]);
        ans=Math.max(mu/(mu1*mu1),ans);
        j++;
        if(j==nums.length){
            i++;
            j=i+1;
        }
     }
     return ans;
    }
}