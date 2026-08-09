class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
      Arrays.sort(arr);  
      int l=0,j=1;
      int diff=Math.abs(arr[l]-arr[j]);
      while(j<arr.length){
          if(Math.abs(arr[l]-arr[j])!=diff){
             return false;
          }
          l++;
          j++;
      }
      return true;
    }
}