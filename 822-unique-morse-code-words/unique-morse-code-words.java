class Solution {
    public int uniqueMorseRepresentations(String[] words) {
     String code[]={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
     HashSet<String> list=new HashSet<String>();
     for(String s:words){
        String a="";
        for(char c:s.toCharArray()){
            a=a+code[c-'a'];
        }
        list.add(a);
     }
     return list.size();
    }
}