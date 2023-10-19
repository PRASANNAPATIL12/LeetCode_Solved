class Solution {
    
    public boolean backspaceCompare(String s, String t) {
       return check(s).equals(check(t));
        
    }
    public String check(String s){
                Stack<Character>stk=new Stack<>();
         for(char k:s.toCharArray()){
            if(k!='#')
                stk.push(k);
             else if(!stk.isEmpty())
                 stk.pop();
                 
        }
return stk.toString();

    }
}