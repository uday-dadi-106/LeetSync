class Solution {
    public int minSteps(String s, String t) {
     int count=0;
     HashMap<Character,Integer> list1=new  HashMap<Character,Integer>();
     HashMap<Character,Integer> list2=new  HashMap<Character,Integer>();
    for(int i=0;i<s.length();i++){
        char ch1=s.charAt(i);
        char ch2=t.charAt(i);
        list1.put(ch1,list1.getOrDefault(ch1,0)+1);
        list2.put(ch2,list2.getOrDefault(ch2,0)+1);
    }   
    for(char ch:list1.keySet()){
        int counts=list1.get(ch);
        int countt=list2.getOrDefault(ch,0);
        if(counts>countt){
            int dif=counts-countt;
            count=count+dif;
        }
    }
    return count;
    }
}