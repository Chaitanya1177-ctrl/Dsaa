class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int n=nums.length;
        int p[]=new int [n];
        p[0]=((nums[0]%2));
        HashMap<Integer,Integer>ss=new HashMap<>();
        ss.put(0,1);
        int count=0;
        for(int i=1;i<n;i++){
            p[i]=p[i-1]+((nums[i]%2));
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