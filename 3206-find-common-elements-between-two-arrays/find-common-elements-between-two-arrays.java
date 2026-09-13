class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
      int ans[]=new int[2];
      HashSet<Integer> set1=new HashSet<Integer>();
      HashSet<Integer> set2=new HashSet<Integer>();
      for(int n:nums1){
        set1.add(n);
      }
      for(int n:nums2){
        set2.add(n);
      }
      int ans1=0;
      int ans2=0;
      for(int n:nums1){
        if(set2.contains(n)){
            ans1++;
        }
      }
      for(int n:nums2){
        if(set1.contains(n)){
            ans2++;
        }
      }
     ans[0]=ans1;
     ans[1]=ans2;
     return ans;
    }
}