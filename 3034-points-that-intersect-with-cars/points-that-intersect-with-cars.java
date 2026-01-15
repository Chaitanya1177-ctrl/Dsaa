class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        HashSet<Integer>ss=new HashSet<>();
        for(List<Integer>m:nums){
            int s=m.get(0);
            int r=m.get(1);

            for(int i=s;i<=r;i++){
                ss.add(i);
            }
        }
        return ss.size();

    }
}