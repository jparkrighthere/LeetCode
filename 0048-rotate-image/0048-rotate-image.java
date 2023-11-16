class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int[][] temp = new int[n][n];


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                temp[i][j] = matrix[i][j];
            }
        }

        for (int i = 0; i < n; i++) {
           int count = 0; 
            for (int j = n - 1 ; j >= 0; j--) {
                matrix[i][count] = temp[j][i];
                count++;
            }
        }
    }

}