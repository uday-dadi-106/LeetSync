class Solution {
    public int maxDigitRange(int[] nums) {
       ArrayList<Integer> list=new ArrayList<Integer>();
       int i=0;
       while(i<nums.length){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int n=nums[i];
        while(n>0){
            int last=n%10;
            max=Math.max(max,last);
            min=Math.min(min,last);
            n=n/10;
        }
        list.add(max-min);
        i++;
       }
       int sum=0;
       int range=0;
       for(int j=0;j<list.size();j++){
        range=Math.max(range,list.get(j));
       }
       for(int j=0;j<nums.length;j++){
        if(list.get(j)==range){
            sum=sum+nums[j];
        }
       }
    return sum;
    }
}