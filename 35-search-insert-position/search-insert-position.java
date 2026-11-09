class Solution {
    public int searchInsert(int[] a, int target) {
        int low=0,high=a.length-1;
        int ans=a.length;
        while(low<=high){
           int mid=(low+high)/2;
           if(a[mid]>=target){
            ans=mid;
            high=mid-1;
           }else{
            low=mid+1;
           }
        }
           return ans;
    }
}