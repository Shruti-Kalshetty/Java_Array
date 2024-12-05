public class Transpose3DArray {
    public static void main(String[] args) {
        int[][][] array = {
            {
                {1, 2},
                {3, 4},
                {5, 6}
            },
            {
                {7, 8},
                {9, 10},
                {11, 12}
            }
        };

        System.out.println("Original 3D Array:");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Layer " + (i + 1) + ":");
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    System.out.print(array[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

        int[][][] transposedArray = new int[array.length][array[0].length][array[0][0].length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    transposedArray[i][j][k] = array[i][j][k];
                }
            }
        }

        System.out.println("Transposed 3D Array:");
        for (int i = 0; i < transposedArray.length; i++) {
            System.out.println("Layer " + (i + 1) + ":");
            for (int j = 0; j < transposedArray[i].length; j++) {
                for (int k = 0; k < transposedArray[i][j].length; k++) {
                    System.out.print(transposedArray[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
