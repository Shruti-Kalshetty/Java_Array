public class ThreeDimensionalArrayExample {
    public static void main(String[] args) {
        int[][][] array = {
            {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
            },
            {
                {13, 14, 15, 16},
                {17, 18, 19, 20},
                {21, 22, 23, 24}
            }
        };

        for (int i = 0; i < array.length; i++) {
            System.out.println("Matrix " + (i + 1) + ":");
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    System.out.print(array[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
