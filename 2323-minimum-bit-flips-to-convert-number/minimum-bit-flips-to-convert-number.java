class Solution {
    public int minBitFlips(int start, int goal) {
      int ans=start^goal;
      String res=Integer.toBinaryString(ans);
      int count=0;
      for(int i=0;i<res.length();i++){
        if(res.charAt(i)=='1'){
            count++;
        }
      }
      return count;
    }
}