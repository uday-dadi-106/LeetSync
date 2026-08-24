class Solution {
    public double average(int[] salary) {
     int min=Integer.MAX_VALUE;
     int max=Integer.MIN_VALUE;  
     int sum=0; 
     for(int n:salary){
        min=Math.min(min,n);
        max=Math.max(max,n);
        sum=sum+n;
     }
     sum=sum-min-max;
     double cal=(double)sum/(salary.length-2);
     return cal;
    }
}