

class Solution {
    public boolean canBeEqual(String s1, String s2) {
        if(s1.equals(s2)) return true;
        
        // iterating till 1
     
    char arr1[] = s1.toCharArray();
    char arr2[] = s2.toCharArray();
    Arrays.sort(arr1);
    Arrays.sort(arr2);
    if(!Arrays.equals(arr1,arr2))
        return false;
    
    for(int i=0;i<2;i++)
    {
        if(s1.charAt(i)==s2.charAt(i+2) && s1.charAt(i+2)==s2.charAt(i))
            return true;
    }
    return false;
//         for(int i=0;i<=1;i++){
//             if(s1.charAt(i)!=s2.charAt(i) && s1.charAt(i)!=s2.charAt(i+2)) return false;
//         }
        
//         for(int i=2;i<=3;i++){
//             if(s1.charAt(i)!=s2.charAt(i) && s1.charAt(i)!=s2.charAt(i-2)) return false;
//         }
        
//         return true;
    }
}