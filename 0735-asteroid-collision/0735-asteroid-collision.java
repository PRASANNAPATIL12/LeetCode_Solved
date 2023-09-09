// class Solution {
//     public int[] asteroidCollision(int[] asteroids) {
//         int arr[]=new int [asteroids.length];
//         int n=0;
//    Stack<Integer> s=new Stack<>();
//         s.push(asteroids[0]);
//         for(int i=1;i<asteroids.length;i++){
//             int k=s.peek() +asteroids[i];
//             if(k==0)
//             s.pop();
//             else if(k>0){
//                 s.push(Math.max(Math.abs(s.pop()),Math.abs(asteroids[i])));
//             }
//             else
//                  s.push(-Math.max(Math.abs(s.pop()),Math.abs(asteroids[i])));
//         }
//             return arr;
        
//     }
// }


class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int ast : asteroids) {
            if (ast > 0) {
                stack.push(ast);
            }
            else {
                while (!stack.isEmpty() && stack.peek() > 0 && stack.peek() < Math.abs(ast)) {
                    stack.pop();
                }

                if (stack.isEmpty() || stack.peek() < 0)  {
                    stack.push(ast);
                }

                if (stack.peek() == Math.abs(ast)) {
                    stack.pop();
                }
            }
        }

        return stack.stream().mapToInt(i -> i).toArray();
    }
}