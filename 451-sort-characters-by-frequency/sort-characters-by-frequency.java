class Solution {
    public String frequencySort(String s) {
     HashMap<Character,Integer> map=new HashMap<Character,Integer>();
     for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        map.put(ch,map.getOrDefault(ch,0)+1);
     }
     ArrayList<Map.Entry<Character,Integer>> list =new ArrayList<>(map.entrySet());
     list.sort((a,b) -> b.getValue() - a.getValue());
     String s1="";
     for(Map.Entry<Character,Integer> entry:list){
    char ch=entry.getKey();
    int freq=entry.getValue();
    for(int i=0;i<freq;i++){
        s1=s1+ch;
    }
  }
     return s1;
    }
}