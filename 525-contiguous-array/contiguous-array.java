class Solution {
    public int findMaxLength(int[] nums) {
        int n=nums.length;
        int p[]=new int[n];
        int maxlen=0;
        p[0]=((nums[0]==0)?-1:1);
        for(int i=1;i<n;i++){
            p[i]=p[i-1]+((nums[i]==0)?-1:1);

        }
        HashMap<Integer,Integer>ss=new HashMap<>();
        for(int i=0;i<n;i++){
            if(p[i]==0)maxlen=Math.max(maxlen,i+1);
            if(ss.containsKey(p[i])){
                maxlen=Math.max(maxlen,i-ss.get(p[i]));
            }
            else{
                ss.put(p[i],i);
            }
        }
        return maxlen;
    }
}