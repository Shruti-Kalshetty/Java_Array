import java.util.concurrent.ThreadLocalRandom;

class RandomNumber{
    public static int getRandomValue(int min, int max)
    {
        //Get and return the random integer
        //within min and max
        return ThreadLocalRandom.current().nextInt(min, max+1);
    }

    //Driver code
    public static void main(String[] args)
    {
        int min=1, max=100;
        System.out.println("Random value between " + min + " and " + max + " : " +getRandomValue(min, max));
    }
}