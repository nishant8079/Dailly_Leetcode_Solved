class Solution {
    public int[][] generateMatrix(int n) {

        int matrix[][] = new int[n][n];

        int startrow = 0;
        int startcol = 0;
        int endrow  = n-1;
        int endcol = n-1;
        int value = 1;

        while(startrow <= endrow && startcol <= endcol){

            for(int col = startcol; col<=endcol; col++){
                matrix[startrow][col] = value++;
            }    

            for (int row = startrow + 1; row<=endrow; row++){
                matrix[row][endcol] = value++;
            }  

            for (int col = endcol -1; col>=startcol; col--){
                if(startcol == endcol){
                    break;
                }
                matrix[endrow][col] = value++;
            }

            for (int row = endrow-1; row>=startrow+1; row--){
                if(startrow==endrow){
                    break;
                }
                matrix[row][startcol] = value++;
            }

            startrow++;
            startcol++;
            endcol--;
            endrow--;
        }

        return matrix;
        
    }
}