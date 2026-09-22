class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count=0;
        TreeSet<Character> list=new  TreeSet<Character>();
         for(char c:allowed.toCharArray()){
            list.add(c);
         }
    for(int i=0;i<words.length;i++){
        char ch[]=words[i].toCharArray();
        boolean found=true;
        for(char ch1:ch){
            if(!list.contains(ch1)){
              found=false;
              break;
            }
        }
        if(found==true){
            count++;
        }
    }     
    return count++;    
    }
}