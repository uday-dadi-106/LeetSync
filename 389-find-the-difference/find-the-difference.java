class Solution {
    public char findTheDifference(String s, String t) {
       int ans=0;
       for(int i=0;i<s.length();i++){
        ans=ans^s.charAt(i);
       }
       for(int j=0;j<t.length();j++){
        ans=ans^t.charAt(j);
       }
       return (char)ans;
    }
}