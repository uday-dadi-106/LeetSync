class Solution {
    public int arraySign(int[] nums) {
        int x=1;
        for(int n:nums){
           if(n==0){
            return 0;
           }
           if(n<0){
            x=x*-1;
           }
         
        } 
    return x;
    }
}