class Solution {
    public String reverseByType(String s) {
        StringBuilder sb=new StringBuilder();
        StringBuilder sb1=new StringBuilder();
        for(char a:s.toCharArray()){
            if(Character.isLetter(a)){
                sb.append(a);
            }else{
                sb1.append(a);
            }
        }
        sb.reverse();
        sb1.reverse();
        StringBuilder ss=new StringBuilder();
        int l=0,sss=0;
        for(char c:s.toCharArray() ){
            if(Character.isLetter(c)){
                ss.append(sb.charAt(l++));
            }else{
                ss.append(sb1.charAt(sss++));
            }
        }
    return ss.toString();

    }
}