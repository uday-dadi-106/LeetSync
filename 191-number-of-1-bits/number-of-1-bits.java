class Solution {
    public int hammingWeight(int n) {
      String res="";
     while(n>0){
        if(n%2==0){
            res=res+'0';
        }else{
            res=res+'1';
        }
        n=n/2;
     }  
     int sum=0;
     for(int i=0;i<res.length();i++){
        sum=sum+(res.charAt(i)-'0');
     }
     return sum;
    }
}