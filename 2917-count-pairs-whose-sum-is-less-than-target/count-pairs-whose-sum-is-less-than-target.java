class Solution {
    public int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums);
        int left=0;
        int count=0;
        int right=nums.size()-1;
        while(left<right){
            int diff=nums.get(left)+nums.get(right);
            if(diff<target){
                count+=(right-left);
                left++;

            }else{
                right--;
            }
        }
        return count;
    }
}