class Solution {
    public List<Integer> findAnagrams(String s, String p) {
      ArrayList<Integer> list=new  ArrayList<Integer>();
      int k=p.length();
      if(s.length()<k){
        return list;
      }
      int frqs[]=new int[26];
      int frqp[]=new int[26];
      for(int i=0;i<k;i++){
        frqs[s.charAt(i)-'a']++;
      }
      for(int i=0;i<k;i++){
        frqp[p.charAt(i)-'a']++;
      }
      int i=0;
      int j=k-1;
     if(Arrays.equals(frqs,frqp)){
        list.add(i);
     }
     while(j<s.length()-1){
       char ch=s.charAt(i);
       frqs[ch-'a']--;
       i++;
       j++;
       char ch1=s.charAt(j);
       frqs[ch1-'a']++;
       if(Arrays.equals(frqs,frqp)){
        list.add(i);
     }
     }
     return list;
    }
}