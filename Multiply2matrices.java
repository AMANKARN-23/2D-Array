package GFG;

public class Multiply2matrices {
    public static void main(String[] args) {
        int[][] matrixA = {{1, 1, 1}, {1, 1, 1},{1, 1, 1}};
        int[][] matrixB = {{1, 1, 1}, {1, 1, 1},{1, 1, 1}};

        int[][] result = multiply(matrixA, matrixB);

        System.out.println("Result:");
        printMatrix(result);
    }

    public static int[][] multiply(int[][] matrixA, int[][] matrixB) {
        int rowsA = matrixA.length;
        int columnsA = matrixA[0].length;
        int columnsB = matrixB[0].length;

        int[][] result = new int[rowsA][columnsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < columnsB; j++) {
                for (int k = 0; k < columnsA; k++) {
                    result[i][j] += matrixA[i][k] * matrixB[k][j];
                }
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
