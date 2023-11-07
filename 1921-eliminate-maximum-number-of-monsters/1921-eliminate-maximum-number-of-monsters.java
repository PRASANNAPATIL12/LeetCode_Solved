class Solution {
    public int eliminateMaximum(int[] dist, int[] speed) {
        for(int i=0;i<dist.length;i++){
            dist[i]=(int)Math.ceil(dist[i]*1.0/speed[i]);
            
        }
        Arrays.sort(dist);
        int ele=0;
        for(int i=0;i<dist.length;i++){
            if(dist[i]>i)++ele;
            else
                break;
        }
        return ele;
        
    }
}