class Solution {
    public int minPartitions(String n) {
        int m=0;
        for(char k:n.toCharArray()){
            if((k-'0')>m)m=(k-'0');
        }
        return m;
    }
}