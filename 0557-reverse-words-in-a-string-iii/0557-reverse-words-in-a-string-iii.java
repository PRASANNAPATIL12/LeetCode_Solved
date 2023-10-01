class Solution {
    public String reverseWords(String s) {
        char arr[]=s.toCharArray();
        int start=0,end=0;
        while(start<arr.length){
            while(end<arr.length && arr[end]!=' '){
                end++;
            }
            reverse(start,end-1,arr);
            start=end+1;
            end=start;
        }
        return new String( arr);

    }
        private void reverse(int l,int r,char[] arr){

                while(r>l){
                    char temp=arr[r];
                    arr[r--]=arr[l];
                    arr[l++]=temp;
                }
        }
}