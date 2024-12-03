public class TwoDimensionalArray {
    public static void main(String[] args) {
        int[][] matrix = { { 2, 3, 4 }, { 5, 6, 4 }, { 7, 2, 4 } };

        System.out.println("Two Dimensional Array : ");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
