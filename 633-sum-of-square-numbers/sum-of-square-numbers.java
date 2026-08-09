class Solution {
    public boolean judgeSquareSum(int c) {
       int i=0;
       int j=(int)Math.sqrt(c);
       while(i<=j){
        long opr=(long)i*i+(long)j*j;
        if(opr==c){
            return true;
        }else if(c<opr){
            j=j-1;
        }else{
            i=i+1;
        }
       }
       return false;
    }
}