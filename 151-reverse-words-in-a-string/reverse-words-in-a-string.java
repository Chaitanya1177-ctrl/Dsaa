class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String ss[]=s.split("\\s+");
        ArrayList<String>re=new ArrayList<>();
        for(String p:ss){
            if(!p.isEmpty()){
                re.add(p);
            }
        }
        Collections.reverse(re);
        return String.join(" ",re);
        
            }
}