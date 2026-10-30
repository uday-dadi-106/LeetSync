class Solution {
    public int longestNiceSubarray(int[] nums) {
        int le=1;
        for(int i=0;i<nums.length-1;i++){
            boolean flag=true;
            for(int j=i+1;j<nums.length;j++){
               for(int k=i;k<j;k++){
                if((nums[k]&nums[j])!=0){
                    flag=false;
                    break;
                }
               }
               if(flag!=true){
                 break;
               }
               le=Math.max(le,j-i+1);
            }
        }
        return le;
    }
}