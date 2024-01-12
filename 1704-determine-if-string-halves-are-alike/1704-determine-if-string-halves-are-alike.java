// class Solution {
//     public boolean halvesAreAlike(String s) {
//         s.toLowerCase();
//        Set vowels=Set.of('a','e','i','o','u');
//       String a=s.substring(0,s.length()/2);
//        String b=s.substring(s.length()/2);
//         return check(a,vowels)==check(b,vowels);
//     }
//     public static int check(String a,Set<Character> vowels){
//         int c=0;
//         for(char ch:a.toCharArray()){
//             if(vowels.contains(ch))
//                 c++;
//         }
//         return c;
        
//     }
// }



public class Solution {
    public boolean halvesAreAlike(String s) {
        Set<Character> vowels = new HashSet<>();
        vowels.add('a'); vowels.add('e'); vowels.add('i'); vowels.add('o'); vowels.add('u');
        vowels.add('A'); vowels.add('E'); vowels.add('I'); vowels.add('O'); vowels.add('U');

        int length = s.length();
        int midPoint = length / 2;

        String firstHalf = s.substring(0, midPoint);
        String secondHalf = s.substring(midPoint);

        return countVowels(firstHalf, vowels) == countVowels(secondHalf, vowels);
    }

    private int countVowels(String str, Set<Character> vowels) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (vowels.contains(c)) {
                count++;
            }
        }
        return count;
    }
}