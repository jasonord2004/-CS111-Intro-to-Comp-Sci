public class printTable
{
    public static void main(String[] args)
    {
        int input = Integer.parseInt(args[0]);
        mutTable(input);
    }

    public static int mutTable(int n)
    {
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= n; j++)
            {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }
}

