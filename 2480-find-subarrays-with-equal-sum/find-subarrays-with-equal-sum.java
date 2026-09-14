class Solution {
    public boolean findSubarrays(int[] nums) {
        ArrayList<Integer> list=new ArrayList<Integer>();
       int sum=0;
       for(int i=0;i<2;i++){
        sum=sum+nums[i];
       }
       list.add(sum);
       int i=0;
       int j=1;
       while(j<nums.length-1){
        int sum1=sum;
        sum1=sum1-nums[i];
        i++;
        j++;
        sum1=sum1+nums[j];
        if(list.contains(sum1)){
            return true;
        }
        list.add(sum1);
         sum=sum1;
       }
    return false;
    }
}