class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> list=new HashMap<Integer,Integer>();
        long sum=0;
        long max=0;
        int n=nums.length;
        for(int i=0;i<k;i++){
            sum=sum+nums[i];
            list.put(nums[i],list.getOrDefault(nums[i],0)+1);
        }
        if(list.size()==k){
            max=sum;
        }
        int l=0,r=k-1;
        while(r<n-1){
            sum=sum-nums[l];
            list.put(nums[l],list.get(nums[l])-1);
            if(list.get(nums[l])==0){
                list.remove(nums[l]);
            }
            l++;
            r++;
            sum=sum+nums[r];
            list.put(nums[r],list.getOrDefault(nums[r],0)+1);
            if(list.size()==k){
                max=Math.max(sum,max);
            }
        }
        return max;
    }
}