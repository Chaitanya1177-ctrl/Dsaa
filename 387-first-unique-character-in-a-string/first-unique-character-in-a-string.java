class Solution {
    public int firstUniqChar(String s) {
        // approach
        
// ✅ Idea

// First pass → Count frequency of each character.

// Second pass → Find the first character whose frequency is 1.

        HashMap<Character,Integer>ss=new HashMap<>();
        for(char c:s.toCharArray()){
            ss.put(c,ss.getOrDefault(c,0)+1);
        }
        for(int i=0;i<s.length();i++){
            if(ss.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;
   
   
   
    }
}