class Node{
    int data;
    int min;
    Node next;
    Node(int data,int min){
        this.data=data;
        this.min=min;
        this.next=null;
    }
}
class MinStack {
    Node top=null;
    public MinStack() {
        
    }
    
    public void push(int value) {
      if(top==null){
        top=new Node(value,value);
      }else{
        int min=Math.min(value,top.min);
        Node n=new Node(value,min);
        n.next=top;
        top=n;
      }
    }
    public void pop() {
        if(top==null){
            return ;
        }
       top=top.next;
    }
    
    public int top() {
        return top.data;
    }
    
    public int getMin() {
        return top.min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */