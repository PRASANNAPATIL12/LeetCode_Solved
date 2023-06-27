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



// class Solution {
//     public String capitalizeTitle(String title) {
//         title = title.toLowerCase();

//         String[] arr = title.split(" ");
//         StringBuilder result = new StringBuilder();
//         int n = arr.length;

//         for(String s: arr){
//             if(s.length() <= 2){
//                 result.append(s);
//             }
//             else{
//                 result.append(s.substring(0,1).toUpperCase()).append(s.substring(1));
//             }
            
//             if(n > 1){
//                 result.append(" ");
//             }
//             n--;
//         }
//         return result.toString();
//     }
// }
