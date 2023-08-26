class Solution {
    public char[][] rotateTheBox(char[][] box) {
       box= rotate(box);
        fall(box);
        return box;  
    }
    public  char[][] rotate(char[][] box){
        int m=box.length,n=box[0].length;
        char[][]res=new char[n][m];
          for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                res[j][i]=box[m-1-i][j];
            }
        }
        // for(int i=0,c=m-1;i<m;c--,i++){
        //     for(int j=0,r=0;j<n;r++,j++){
        //         res[r][c]=box[i][j];
        //     }
        // }
        return res;
    }
    public  void fall(char[][] box){
                int m=box.length,n=box[0].length;

        for(int c=0;c< n;c++){
            int l=m-1;  
            for(int r=m-1;r>=0;r--){
                char ch=box[r][c];
                if(ch=='*') l=r-1;
                else if(ch=='#'){
                    box[r][c]='.';
                     box[l][c]='#';
                    l--;
                }
            }
        }
    }
}