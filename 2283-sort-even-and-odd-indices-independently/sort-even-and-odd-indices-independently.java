import java.util.*;
class Solution {
    public int[] sortEvenOdd(int[] nums) {
        // take two list k
        ArrayList<Integer>even=new ArrayList<>();
        ArrayList<Integer>old=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                even.add(nums[i]);
            }else{
                old.add(nums[i]);
            }
        }
        Collections.sort(even);
        Collections.sort(old,Collections.reverseOrder());
        int e=0;
        int o=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                nums[i]=even.get(e++);
            }else{
                nums[i]=old.get(o++);
            }
        }return nums;
        
    }
}