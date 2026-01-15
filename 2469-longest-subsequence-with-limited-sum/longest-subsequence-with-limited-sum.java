class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        int n=nums.length;
        int p[]=new int[n];
        p[0]=nums[0];
        for(int i=1;i<n;i++){
            p[i]=p[i-1]+nums[i];
        }
                int ans[]=new int[queries.length];

                for(int i=0;i<queries.length;i++){
                    int q=queries[i];
                    int count=0;
                    for(int j=0;j<n;j++){

                    if(p[j]<=q)count++;
                    else  break;
                }
                ans[i]=count;
                }
                return ans;
                
    }
}