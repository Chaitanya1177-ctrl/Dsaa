class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int res=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            int odd=(n-i)*(i+1);
            int sub=(odd)/2;
            if(odd % 2!=0){
                sub++;
            }
            res+=arr[i]*sub;
        }
        return res;

    }
}
































