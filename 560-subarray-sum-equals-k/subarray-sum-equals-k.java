class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
                int p[]=new int[n];
                int count=0;
                p[0]=nums[0];
                HashMap<Integer,Integer>ss=new HashMap<>();
                ss.put(0,1);
                for(int i=1;i<n;i++){
                    p[i]=p[i-1]+nums[i];
                }
                for(int i=0;i<n;i++){
                   
                    int val=p[i]-k;
                    if(ss.containsKey(val)){
                        count+=ss.get(val);
                
                    }
                    ss.put(p[i],ss.getOrDefault(p[i],0)+1);
                }
                return count;


    }
}