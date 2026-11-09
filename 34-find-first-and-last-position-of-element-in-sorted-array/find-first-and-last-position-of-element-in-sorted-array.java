class Solution {
    public int lowerBound(int[] a, int target) {
       int left=0,right=a.length-1,ans=a.length;
       while(left<=right){
       int mid=left+(right-left)/2;
        if(a[mid]>=target){
            ans=mid;
            right=mid-1;
        }else{
            left=mid+1;
        }
       }
       return ans;
     }
    public int upperBound(int[] a, int target) {
    int low=0,high=a.length-1;
        int ans=a.length;
        while(low<=high){
            int mid=(low+high)/2;
            if(a[mid]>target){
                ans=mid;
               high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }

    public int[] searchRange(int[] nums, int target) {
       int first = lowerBound(nums, target);
        if(first == nums.length || nums[first] != target) {
            return new int[]{-1, -1};
        }
        int last = upperBound(nums, target) - 1;
        return new int[]{first, last};
        
    }
}