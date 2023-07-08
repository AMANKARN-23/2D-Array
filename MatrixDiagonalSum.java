package LeetCode;

public class MatrixDiagonalSum {
    public static int diagonalSum(int[][] mat) {
        int i = 0, j = mat.length - 1, k = 0, s = 0;
        while (i < mat.length) {
            if (k != j)
                s += (mat[i][k] + mat[i][j]);
            else
                s += mat[i][j];
            i++;
            k++;
            j--;
        }
        return s;
    }

    public static void main(String[] args) {
        int mat[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int output = diagonalSum(mat);
        System.out.println(output);
    }
}
