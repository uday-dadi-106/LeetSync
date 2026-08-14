class Solution {
    public boolean isValid(String s) {
    Stack<Character> list=new Stack<Character>();
    for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(list.isEmpty()){
            list.push(ch);
        }else{
          char top=list.peek();
            if(ch==')'&&top=='('||ch=='}'&&top=='{'||ch==']'&&top=='['){
                list.pop();
            }else{
                list.push(ch);
            }
        }
    }
    return list.isEmpty();   
    }
}