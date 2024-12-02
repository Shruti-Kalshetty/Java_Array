public class AvarageArray 
{
    public static void main(String[] args)
    {
        int[] nums = {10, 20, 30, 40, 50};
        int sum = 0;

        for(int i=1; i< nums.length; i++)
        {
            sum=sum+nums[i];
        }

        double average = sum / (double) nums.length;
        System.out.println("Average of Array elements : " +average);
    }
}
