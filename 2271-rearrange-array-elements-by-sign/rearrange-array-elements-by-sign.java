class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int p[]=new int[n];
        int post=0;
        int left=1;
        for(int i=0;i<n;i++){
            if(nums[i]>=0){
                p[post]=nums[i];
                post+=2;
            }else if(nums[i]<=0){
                p[left]=nums[i];
                left+=2;
            }
        }
        for(int i=0;i<n;i++){
            nums[i]=p[i];
        }
        return nums;
    }
}