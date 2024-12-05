public class MultiplyingArray {
    public static void main(String[] args) {
        int[][] arr = { { 2, 3, 5 }, { 8, 4, 2 } };

        int[][] arr1 = { { 7, 8 }, { 1, 2 } };

        int[][] result = new int[arr.length][arr1[0].length];

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                for (int k = 0; k < result[j].length; k++) {
                    result[i][j] += arr[i][k] * arr1[k][j];
                }

            }
        }
        System.out.println("Result of Matrix Multiplication:");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
