public class summation 
{
    public static void main(String[] args)
    {
        int x = Integer.parseInt(args [0]);
        int sum = 0;
        for (int i = 0; i <= x; i++)
        {
            sum += i;
        }
        System.out.println(sum);
    }
}
