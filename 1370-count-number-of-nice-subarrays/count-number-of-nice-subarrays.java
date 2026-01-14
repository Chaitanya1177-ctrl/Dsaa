class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int n=nums.length;
        int p[]=new int [n];
        int count=0;
        p[0]=(nums[0]%2);
        for(int i=1;i<n;i++){
            p[i]=p[i-1]+(nums[i]%2);
        }
        HashMap<Integer,Integer>mm=new HashMap<>();
        mm.put(0,1);
        for(int j=0;j<n;j++){
            int val=p[j]-k;
            if(mm.containsKey(val)){
                count+=mm.get(val);

            }
            mm.put(p[j],mm.getOrDefault(p[j],0)+1);
        }
        return count;
    }

}