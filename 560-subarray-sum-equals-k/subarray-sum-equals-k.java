class Solution {
    public int subarraySum(int[] nums, int k) {
        int pp[]=new int[nums.length];
       int count=0;
       pp[0]=nums[0];
       for(int i=1;i<nums.length;i++){
        pp[i]=pp[i-1]+nums[i];

       }
       HashMap<Integer,Integer>mm=new HashMap<>();
        for(int j=0;j<nums.length;j++){
            if(pp[j]==k)count++;
            int val=pp[j]-k;
            if(mm.containsKey(val)){
                count+=mm.get(val);
            }
            mm.put(pp[j],mm.getOrDefault(pp[j],0)+1);
        }
        return count;
    }
}