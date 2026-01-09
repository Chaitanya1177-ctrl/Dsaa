class Solution {
    public int[] runningSum(int[] nums) {
     int []o=new int[nums.length];
     o[0]=nums[0];
     for(int i=1;i<nums.length;i++){
        o[i]=o[i-1]+nums[i];
     }   
     return o;
    }
}