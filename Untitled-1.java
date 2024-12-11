// Java Program to print the smallest element in an array
import java.util.Scanner;

public class day1_4 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
// accept the number
        for (int i = 1; i< arr.length;i++)
        {
            System.out.println("Enter the elements of array :- ");
            int a = sc.nextInt();
            arr[i]=a;
        }
        // printing array
        for (int j =1 ; j<arr.length;j++)
        {
            System.out.print(arr[j]);
        }
        // small number logic
        int z = arr[1];
        for (int k=2;k< arr.length;k++)
        {
            if (z>arr[k])
            {
                z=arr[k];
            }
        }
        System.out.println("smallest number is " +z);
    }
}