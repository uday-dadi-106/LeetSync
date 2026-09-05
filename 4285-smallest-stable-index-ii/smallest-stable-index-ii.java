class Solution {
    public int firstStableIndex(int[] nums, int k) {
    int n=nums.length;
    int arr[]=new int[n];
    arr[n-1]=nums[n-1];
    for(int i=n-2;i>=0;i--){
        arr[i]=Math.min(nums[i],arr[i+1]);
    }
    int max=Integer.MIN_VALUE;
    for(int j=0;j<nums.length;j++){
         max=Math.max(max,nums[j]);
        if(max-arr[j]<=k){
            return j;
        }
    }
    return -1;
    }
}