class Solution {
    public String reverseWords(String s) {
String []arr=s.split("\\s+");
ArrayList<String>ss=new ArrayList<>();
for(String p:arr){
    if(!p.isEmpty()){
        ss.add(p);
    }
}
Collections.reverse(ss);
return String.join(" ",ss);
    }
}