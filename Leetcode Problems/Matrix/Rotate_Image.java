class Solution {
    public void rotate(int[][] matrix) {
        int row_size = matrix.length;
        int col_size = matrix[0].length;
        for(int i=0; i<row_size; i++){
             for(int j=0; j<i; j++){
                 int temp = matrix[i][j];
                 matrix[i][j] = matrix[j][i];
                 matrix[j][i] = temp;
             }
        }
        for (int i=0; i< row_size; i++){
            reverse(matrix[i],0,row_size-1);
        }

    }
    private void reverse(int []mat, int i, int j){
        while(i<j){
            swap(mat,i++,j--);
        }
    }
     private void swap(int []mat, int i, int j){
         int temp = mat[i];
         mat[i] = mat[j];
         mat[j] = temp;
     }

     public static void main(String args[]){
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(canConstruct(ransomNote, magazine));
    }
}