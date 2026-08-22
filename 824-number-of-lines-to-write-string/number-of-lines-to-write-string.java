class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int ans[]=new int[2];
        int sum=0;
        int Line=1;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
          int wi=widths[ch-'a'];
            if(wi+sum>100){
              Line++;
              sum=wi;
            }else{
                sum=sum+wi;
            }
        }
        ans[0]=Line;
        ans[1]=sum;
        return ans;
    }
}