class Solution {
    public int similarPairs(String[] words) {
      int count=0;
      for(int i=0;i<words.length-1;i++){
         TreeSet<Character> set=new TreeSet<Character>();
         char c[]=words[i].toCharArray();
         for(char ch:c){
            set.add(ch);
         }
         for(int j=i+1;j<words.length;j++){
           TreeSet<Character> set1=new TreeSet<Character>();
         char c1[]=words[j].toCharArray();
         for(char ch2:c1){
            set1.add(ch2);
         } 
         if(set.equals(set1)){
            count++;
         }
         }
      }
      
     return count;  
    }
}