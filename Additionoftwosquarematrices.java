package GFG;

class Additionoftwosquarematrices {
        public static void main(String[] args) {
        int[][] matrixA = {{1, 2}, {3, 4}};
        int[][] matrixB = {{4, 3}, {2, 1}};

        int[][] result = addition(matrixA, matrixB);

        System.out.println("Result:");
        printMatrix(result);
    }

    public static int[][] addition(int[][] matrixA, int[][] matrixB) {
        int rows = matrixA.length;
        int columns = matrixA[0].length;

        int[][] result = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }

        return result;
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
    
