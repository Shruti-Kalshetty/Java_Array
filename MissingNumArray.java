
public class MissingNumArray
{
    public static void main(String[] args)
    {
        int total;
        int[] num=new int[] {1, 2, 3, 5, 6, 7};
        total=7;

        int expected_sum=total*((total+1)/2);
        int num_sum=0;

        for (int i:num)
        {
            num_sum += i; 
        }

        System.out.println(expected_sum - num_sum);
    }
}