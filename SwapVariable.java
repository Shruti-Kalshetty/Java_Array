public class SwapVariable 
{
    public static void main(String[] args)
    {
        String a="Hello";
        String b="World";

        System.out.println("String before Swapping : a = " + a + " and  b = " +b );

        a=a+b;

        b=a.substring(0, a.length()-b.length());

        a=a.substring(b.length());

        System.out.println("String after swap : a = " + a + " and b = " +b  );
    }
}
