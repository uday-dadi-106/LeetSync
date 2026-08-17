class Solution {
    public int firstUniqChar(String s) {
        LinkedHashMap<Character,Integer> list=new LinkedHashMap<Character,Integer>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            list.put(ch,list.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<s.length();i++){
            if(list.get(s.charAt(i))==1){
                 return i;
            }
        }
         
         return -1;
    }
}