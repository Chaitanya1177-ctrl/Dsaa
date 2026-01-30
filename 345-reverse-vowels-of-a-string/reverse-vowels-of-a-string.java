class Solution {

    public boolean vowle(char ch){
    return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
            || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }
    public String reverseVowels(String s) {
    int left=0;
    char a[]=s.toCharArray();
    int right=a.length-1; 
    while(left<right){
    if(!vowle(a[left])){
    left++;       
    }
    else if(!vowle(a[right])){
    right--;
}
else{
char temp=a[left];
a[left]=a[right];
a[right]=temp;
left++;
right--;
}

}return new String(a);
    }
}