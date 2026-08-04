class Solution {
    public int[] twoSum(int[] nums, int target) {
      /*  int a[]=new int[2];
       for(int i=0;i<nums.length-1;i++){
         for(int j=i+1;j<nums.length;j++){
            if(nums[i]+nums[j]==target){
               a[0]=i;
               a[1]=j;
            }
         }
       }
       return a;*/
       HashMap<Integer,Integer> list=new HashMap<Integer,Integer>();
       int a[]=new int[2];
       for(int i=0;i<nums.length;i++){
        int diff=target-nums[i];
        if(list.containsKey(diff)){
           a[0]=list.get(diff);
           a[1]=i;
           return a;
        }
        list.put(nums[i],i);
       }
       return a;

    }
}