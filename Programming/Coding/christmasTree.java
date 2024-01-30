public class christmasTree
{
    public static void main(String[] args)
    {
        int size = Integer.parseInt(args[0]);
        for (int i = 1; i <= size; i++)
        {
            for (int j = 0; j <= size - i; j++)
            {
                System.out.print(" ");
            }
            int asterisk = 1;
            while (asterisk <= 2*i - 1)
            {
                System.out.print("*");
                asterisk++;
            }
            System.out.println();
        }
    }
}