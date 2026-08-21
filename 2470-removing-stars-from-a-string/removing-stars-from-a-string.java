class Solution {
    public String removeStars(String s) {
      Stack<Character> list=new Stack<Character>();
      for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(list.isEmpty()&&ch!='*'){
            list.push(ch);
        }else{
            if(ch=='*'){
                list.pop();
            }else{
                list.push(ch);
            }
        }
      }
      String a="";
      while(!list.isEmpty()){
       a=list.pop()+a;
      }  
   return a;
    }
}