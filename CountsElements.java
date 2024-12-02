public class CountsElements
{
    public static void main(String[] args )
    {
        int[]  nums = {1, 2, 3, 4, 5, 2, 8, 2, 2};
        int element = 2;
        int count = 0;

        for(int i=0; i < nums.length; i++)
        {
            if(nums[i] == element)
            {
                count++;
            }
            
        }

        System.out.println(" The elements " + element + " appears " + count + " times.");
    }
}
