class Solution {
    static long gcd(long a,long b){
        while(b!=0){
            long temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    static long lcm(long a,long b){
        return (a/gcd(a,b))*b;
    }
    public int maxLength(int[] nums) {
     int ans=1;
     for(int i=0;i<nums.length;i++){
        long product=1;
        long gcd=0;
        long lcm=1;
        for(int j=i;j<nums.length;j++){
            product=product*nums[j];
            gcd=gcd(gcd,nums[j]);
            lcm=lcm(lcm,nums[j]);
        if(gcd*lcm==product){
            ans=Math.max(ans,j-i+1);
        }
        }
     }   
     return ans;
    }
}