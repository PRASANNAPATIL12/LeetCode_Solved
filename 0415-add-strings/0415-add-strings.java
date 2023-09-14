class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder sb=new StringBuilder();
        int p=num1.length()-1;
        int q=num2.length()-1;
        int c=0;
        while(p>=0||q>=0){
            int s=c;
            if(p>=0)s+=num1.charAt(p--)-'0';
            if(q>=0)s+=num2.charAt(q--)-'0';
            sb.append(s%10);
            c=s/10;
        }
        if(c!=0)            sb.append(c);
        return sb.reverse().toString();

        
        
        
    }
}



// class Solution {
//     public String addStrings(String num1, String num2) {
//         StringBuilder sb = new StringBuilder();

//         int i = num1.length() - 1, j = num2.length() - 1;
//         int carry = 0;

//         while (i >= 0 || j >= 0) {
//             int sum = carry;

//             if (i >= 0) sum += (num1.charAt(i--) - '0');
//             if (j >= 0) sum += (num2.charAt(j--) - '0');

//             sb.append(sum % 10);
//             carry = sum / 10;
//         }

//         if (carry != 0) sb.append(carry);

//         return sb.reverse().toString();
//     }
// }