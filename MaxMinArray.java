public class MaxMinArray {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 40, 15, 90 };
        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max)
            {
                max = arr[i];
            }
            
            if (arr[i] < min) 
            {
                min = arr[i];
            }

        }
        System.out.println("Maximum number is : " + max);
        System.out.println("Minimum number is : " + min);

    }
}
