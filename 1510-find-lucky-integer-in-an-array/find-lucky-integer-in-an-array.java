class Solution {
    public int findLucky(int[] nums) {
     HashMap<Integer,Integer> list=new HashMap<Integer,Integer>();
     for(int i=0;i<nums.length;i++){
        list.put(nums[i],list.getOrDefault(nums[i],0)+1);
     }  
     int max=Integer.MIN_VALUE;
     for(int n:list.keySet()){
        if(n==list.get(n)){
            max=Math.max(max,n);
        }
     }
     if(max==Integer.MIN_VALUE){
        return -1;
     }
     return max;
    }
}