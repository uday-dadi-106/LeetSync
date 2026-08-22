class Solution {
    public boolean uniqueOccurrences(int[] arr) {
      HashMap<Integer,Integer> list=new HashMap<Integer,Integer>();
       for(int n:arr){
        list.put(n,list.getOrDefault(n,0)+1);
       } 
       HashSet<Integer> se=new HashSet<Integer>();
       for(int n:list.keySet()){
        se.add(list.get(n));
       }
       return list.size()==se.size();
    }
}