class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer>ss=new HashMap<>();
        for(int i=0;i<numbers.length;i++){
            int diff=target-numbers[i];
            if(ss.containsKey(diff)){
                return new int[]{ss.get(diff)+1,i+1};
            }
            ss.put(numbers[i],i);

        }
        return new int[]{-1,-1};
        
    }
}