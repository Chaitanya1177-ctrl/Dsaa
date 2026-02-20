class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int n=nums.length;

        int even[]=new int[(n+1)/2];
        int odd[]=new int[n/2];

int e=0,o=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                even[e++]=nums[i];
            }else{
                odd[o++]=nums[i];
            }
        }
        Arrays.sort(even);
        Arrays.sort(odd);

        e=0;
        o=odd.length-1;
        for(int i=0;i<n;i++){
            if(i%2==0){
                nums[i]=even[e++];
            }else{
                nums[i]=odd[o--];
            }
        }
        return nums;
    }
}