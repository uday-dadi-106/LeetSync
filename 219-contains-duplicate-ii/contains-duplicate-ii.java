class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
    HashMap<Integer,Integer> list=new HashMap<Integer,Integer>();
    for(int i=0;i<nums.length;i++){
        if(list.containsKey(nums[i])){
             if(Math.abs(list.get(nums[i])-i)<=k){
                return true;
             }
        }
        list.put(nums[i],i);
    }
    return false;
    }
}