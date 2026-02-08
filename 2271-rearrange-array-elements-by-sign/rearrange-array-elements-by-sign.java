class Solution {
    public int[] rearrangeArray(int[] nums) {
        int temp[]=new int[nums.length];
        int post=0;
        int neg=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0){
                temp[post]=nums[i];
                post+=2;
            }
            if(nums[i]<=0){
                temp[neg]=nums[i];
                neg+=2;
            }

        }
        for(int i=0;i<nums.length;i++){
            nums[i]=temp[i];
        }
        return nums;
    }
}