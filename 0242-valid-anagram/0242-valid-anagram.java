class Solution {
    public boolean isAnagram(String s, String t) {

        // HashMap<Character,Integer>m=new HashMap<>();
        // HashMap<Character,Integer>n=new HashMap<>();
        // for(char  k:s.toCharArray()){
        //     if(m.containsKey(k))
        //     m.put(k,m.get(k)+1);
        //     else
        //     m.put(k,1);
        // }
        // for(char  k:t.toCharArray()){
        //     if(n.containsKey(k))
        //     n.put(k,n.get(k)+1);
        //     else
        //     n.put(k,1);
        // }

        // return true;
        if(s.length()!=t.length())return false;
        

        char p[]=s.toCharArray();
        char q[]=t.toCharArray();
        Arrays.sort(p);Arrays.sort(q);
        int n=Math.min(p.length,q.length);
        try{
            for(int i=0;i<n;i++){
            if(p[i]!=q[i])return false;
        }
        }
        catch(Exception e){
            return false;
        }
        
        return true;


        //  int[] freq = new int[26];
        // char[] sca = s.toCharArray();
        // char[] tca = t.toCharArray();

        // for(char c: sca){
        //     int index = c - 'a';
        //     freq[index]++;
        // }
        // // String freqS = String.valueOf(freq);
        
        // // freq = new int[26];
        // for(char c: tca){
        //     int index = c - 'a';
        //     freq[index]--;
        // }

        // for(int n: freq){
        //     if(n!=0){
        //         return false;
        //     }
        // }

        // return true;







    }
}
