class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
       int ans=0;
       for(int i=0;i<arr.length;i++){
        int sum=0;
        for(int j=i;j<arr.length;j++){
            sum=sum+arr[j];
            int len=(j-i+1);
            if(len%2!=0){
              ans=ans+sum;  
            }
        }
       } 
       return ans;
    }
}