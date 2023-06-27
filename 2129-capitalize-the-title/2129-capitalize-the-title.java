class Solution {
    public String capitalizeTitle(String title) {
        String s[]=title.split(" ");
        title="";
        for(int i=0;i<s.length;i++){
            s[i]=s[i].toLowerCase();
            if(s[i].length()<=2)
            title+=s[i]+" ";
            else{
                s[i]=s[i].substring(0,1).toUpperCase()+s[i].substring(1);
                title+=s[i]+" ";
            } 
        }
        return title.trim();
        
    }
}