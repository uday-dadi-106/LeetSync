class Solution {
    public String mergeAlternately(String word1, String word2) {
      String ans="";
      int n=word1.length();
      int m=word2.length();
      int l=0,r=0;
      while(l<n&&r<m){
        char ch=word1.charAt(l);
        char ch1=word2.charAt(r);
        ans=ans+ch;
        ans=ans+ch1;
        l++;
        r++;
      }
      while(l<n){
        char ch=word1.charAt(l);
        ans=ans+ch;
        l++;
      }
      while(r<m){
        char ch1=word2.charAt(r);
        ans=ans+ch1;
        r++;
      }
    return ans;
    }
}