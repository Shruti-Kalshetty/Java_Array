public class ArrayCopy {
    public static void main(String[] args) {
        int[] source = { 1, 2, 3, 4, 5 };
        int[] destination = new int[source.length];

        // copy elements source to elements
        for (int i = 0; i < source.length; i++) {
            destination[i] = source[i];
        }

        System.out.println("Copied Array : ");
        for (int i = 0; i < destination.length; i++) {
            System.out.println(destination[i] + " ");
        }
    }
}
