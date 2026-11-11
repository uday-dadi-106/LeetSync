class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String ans="";
        for(int i=0;i<word2.length;i++){
            ans=ans+word2[i];
        }
        String ans1="";
        for(int i=0;i<word1.length;i++){
            ans1=ans1+word1[i];
        }
        return ans.equals(ans1);
    }
}