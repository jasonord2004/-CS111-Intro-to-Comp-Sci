public class horizPyramid
{
    public static void main (String[] args)
    {
        int n = Integer.parseInt(args[0]);
        for (int i = 0; i <= n; i++)
        {
            for (int x = 0; x < i; x++)
            {
                System.out.print("*");
            }
        System.out.println();
        }
        for (int i = n-1; i > 0; i--)
        {
            for (int y = 0; y < i; y++)
            {
                System.out.print("*");
            }
        System.out.println();
        }

    }    
}
