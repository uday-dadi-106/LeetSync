class Solution {
    public String removeDuplicates(String s) {
       Stack<Character> list=new Stack<Character>();
       String a="";
       for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(list.isEmpty()){
            list.push(ch);
        }else{
            if(list.peek()==ch){
                list.pop();
            }else{
            list.push(ch);
            }
        }
       } 
    while(!list.isEmpty()){
        a=list.pop()+a;
    }
    return a;
    }
}