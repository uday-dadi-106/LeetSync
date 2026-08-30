class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        HashSet<Integer> set3 = new HashSet<>();
        for(int n:nums1){
            set1.add(n);
        }
        for(int n:nums2){
            set2.add(n);
        }
        for(int n:nums3){
            set3.add(n);
        }
        for(int n:set1){
            hm.put(n,hm.getOrDefault(n,0)+1);
        }
        for(int n:set2){
            hm.put(n,hm.getOrDefault(n,0)+1);
        }
        for(int n:set3){
            hm.put(n,hm.getOrDefault(n,0)+1);
        }
    for(int n:hm.keySet()){
        if(hm.get(n)>1){
            list.add(n);
        }
    }
  return list;
    }
}