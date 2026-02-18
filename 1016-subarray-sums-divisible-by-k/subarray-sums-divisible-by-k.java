class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int n=nums.length;
        int p[]=new int[n];
        p[0]=nums[0];
        int count=0;
        for(int i=1;i<n;i++){
            p[i]=p[i-1]+nums[i];
        }
        HashMap<Integer,Integer>ss=new HashMap<>();
        ss.put(0,1);
        for(int i=0;i<n;i++){
            int diff=p[i]%k;
            if(diff<0)diff+=k;
            if(ss.containsKey(diff)){
                count+=ss.get(diff);
            }
            ss.put(diff,ss.getOrDefault(diff,0)+1);
        }
        return count;
    }
}