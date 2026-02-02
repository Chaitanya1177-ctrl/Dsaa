class Solution {
    public String reversePrefix(String word, char ch) {
        char a[]= word.toCharArray();
        int index=-1;
        for(int i=0;i<a.length;i++){
            if(a[i]==ch){
                index=i;
                break;
            }
        }
            if(index==-1)return word;

        int left=0;int right=index;
        while(left<right){
            char temp=a[left];
            a[left]=a[right];
            a[right]=temp;
            left++;
            right--;
        }
        return new String(a);
    }
}