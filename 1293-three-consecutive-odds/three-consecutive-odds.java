class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
     int i=0;
     int j=1;
     int k=2;
     if(arr.length<=2){
        return false;
     }
     while(i<=arr.length-3){
        if(arr[i]%2!=0&&arr[j]%2!=0&&arr[k]%2!=0){
            return true;
        }
        i++;
        j++;
        k++;
     }
     return false;
    }
}