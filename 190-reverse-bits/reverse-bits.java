class Solution {
    public int reverseBits(int n) {
     String res="";
     for(int i=0;i<32;i++){
        if(n%2==0){
            res=res+'0';
        }else{
            res=res+'1';
        }
        n=n/2;
     }   
     int num=0;
     int p=1;
     for(int i=res.length()-1;i>=0;i--){
        if(res.charAt(i)=='1'){
            num=num+p;
        }
        p=p*2;
     }
     return num;
    }
}