class Solution {
    public int[] numberOfPairs(int[] nums) {
        LinkedHashMap<Integer,Integer> list=new LinkedHashMap<Integer,Integer>();
        for(int n:nums){
            list.put(n,list.getOrDefault(n,0)+1);
        }
        int count=0;
        int se=0;
        for(int i:list.keySet()){
               count=count+list.get(i)/2;
               if(list.get(i)%2!=0){
                  se++;
               }
            }
        int ans[]=new int[2];
        ans[0]=count;
        ans[1]=se;
        return ans;
    }
}