class Solution {
    public int findMiddleIndex(int[] nums) {
        int total=0;
        for(int n:nums){
            total+=n;

        }
        int leftsum=0;
        for(int i=0;i<nums.length;i++){
            int rigth=total-leftsum-nums[i];
            if(leftsum==rigth){
                return i;
            }
            leftsum+=nums[i];
        }
        return -1;
    }
}