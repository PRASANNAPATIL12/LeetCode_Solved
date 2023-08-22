class Solution {
    public char[][] rotateTheBox(char[][] box) {
        int row = box.length, col = box[0].length;
        char[][] res = new char[col][row];
        // move right then rotate
        for (int i = 0; i < row; i++) {
            for (int j = col-1; j >= 0; j--) {
                if (box[i][j] == '#') {
                    int curCol = j;
                    while (curCol+1 < col && box[i][curCol+1] == '.') {
                        curCol++;
                    }
                    if (curCol != j) {
                        box[i][curCol] = '#';
                        box[i][j] = '.';
                    }
                }
            }
        }
        
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                res[j][i] = box[row-1-i][j];
            }
        }
        return res;
    }
}









// class Solution {
//     public char[][] rotateTheBox(char[][] box) {
//         for(int i=0;i<box.length;i++){
//             int stone=0;
//             for(int j=0;j<box[0].length;j++){
//                 if(box[i][j]=='*'||j>=box[0].length)continue;
//                 if(box[i][j]=='#'){
//                     box[i][j]='.';
//                     stone++;}
//                 if(box[i][j]=='.')for(int k=0;k<stone;k++){

//                     box[i][j-k]='#';
//                 }
//             }
//         }
// char [][] bx=new char[box[0].length][box.length];
//          for(int i=0;i<box.length;i++)
//          for(int j=0;j<box[0].length;j++){
//              bx[j][i]=box[i][j];
             
//          }
//          return bx;
//     }
// }