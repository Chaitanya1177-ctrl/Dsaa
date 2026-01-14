class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {

      int n=nums.length;
      int p[]=new int [n];
      int count=0;
      p[0]=nums[0];
      for(int i=1;i<n;i++){
        p[i]=p[i-1]+nums[i];
      }
      HashMap<Integer,Integer>mm=new HashMap<>();
     mm.put(0,1);
      for(int j=0;j<n;j++ ){
        int val=p[j]-goal;
        if(mm.containsKey(val)){
            count+=mm.get(val);

        }
        mm.put(p[j],mm.getOrDefault(p[j],0)+1);

      }
      return count;
    }
}