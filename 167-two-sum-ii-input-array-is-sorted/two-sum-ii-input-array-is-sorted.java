class Solution {
    public int[] twoSum(int[] nums, int target) {
      HashMap<Integer,Integer> list=new HashMap<Integer,Integer>();
      int a[]=new int[2];
       for(int i=0;i<nums.length;i++){
        int diff=target-nums[i];
        if(list.containsKey(diff)){
           a[0]=list.get(diff)+1;
           a[1]=i+1;
           return a;
        }
        list.put(nums[i],i);
       }
       return a;  
    }
}