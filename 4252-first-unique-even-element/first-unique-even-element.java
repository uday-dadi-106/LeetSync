class Solution {
    public int firstUniqueEven(int[] nums) {
        LinkedHashMap<Integer,Integer> list=new LinkedHashMap<Integer,Integer>();
        for(int n:nums){
            if(n%2==0){
                list.put(n,list.getOrDefault(n,0)+1);
            }
        }
        int ans=0;
        for(int n:list.keySet()){
            if(list.get(n)==1){
              return n;
            }
        }
        return -1;
    }
}