class Solution {
    public int findGCD(int[] nums) {
     int max=Integer.MIN_VALUE;
     int min=Integer.MAX_VALUE;
     for(int n:nums){
        max=Math.max(max,n);
        min=Math.min(min,n);
     }
     while(max!=0){
        int temp=max;
        max=min%max;
        min=temp;
     }
     return min;
    }
}