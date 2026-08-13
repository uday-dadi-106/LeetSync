class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> list=new HashMap<Character,Integer>();
        list.put('I',1);
        list.put('V',5);
        list.put('X',10);
        list.put('L',50);
        list.put('C',100);
        list.put('D',500);
        list.put('M',1000);
        int sum=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(i+1<s.length()&&list.get(ch)<list.get(s.charAt(i+1))){
                sum=sum-list.get(ch);
            }else{
                sum=sum+list.get(ch);
            }
        }
        return sum;
    }
}