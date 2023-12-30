class Solution {
    public boolean makeEqual(String[] words) {
        HashMap<Character,Integer>hm=new HashMap<>();
        
        for(String word:words){
            for(char ch:word.toCharArray()){
                hm.put(ch,hm.getOrDefault(ch,0)+1);
                
            }
        }
        int len=words.length;
        for(int chlen:hm.values()){
            if(chlen%len!=0)
                return false;
        }
        return true;
    }
}