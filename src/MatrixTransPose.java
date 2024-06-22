public class MatrixTransPose {
    public static void main(String[] args) {
        int[][] matrix = {
                {2, 3, 4},
                {5, 6, 4}
        };

        int[][] transposesMatrix = new int[matrix[0].length][matrix.length];

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                transposesMatrix[j][i] = matrix[i][j];
            }
        }

        for(int[] row : transposesMatrix){
            for(int col : row){
                System.out.print(col +" ");
            }
            System.out.println();
        }
    }

}
