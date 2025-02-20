public class Main6 
{
    public static void main(String[] args) 
    {
        try 
        {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]); 
        }
        catch (ArrayIndexOutOfBoundsException e) 
        {

            System.out.println("Array index is out of bounds: " + e.getMessage());

        } 
        finally
        {
            System.out.println("This will execute anyway");

        }

    }

}

