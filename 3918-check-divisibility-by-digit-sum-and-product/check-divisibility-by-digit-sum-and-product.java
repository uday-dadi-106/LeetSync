class Solution {
    public boolean checkDivisibility(int n) {
    int sum=0;
    int pro=1;
    int temp=n;
    while(temp>0){
        int last=temp%10;
        sum=sum+last;
        pro=pro*last;
        temp=temp/10;
    }    
    return n%(sum+pro)==0;
    }
}