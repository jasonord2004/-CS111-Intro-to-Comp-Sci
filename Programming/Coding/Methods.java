public class Methods{
    public static void gcf(int num1, int num2)
    {
        int smaller = num1;
        if (num1 > num2)
        {
            smaller = num2;
        }

        for (int divisor; divisor > 1; divisor++)
        {
            if(num1 % divisor == 0 && num2 % divisor == 0)
            {
                return divisor;
            }
        }
        return 1;

        //Quiz Code: staticquiz
    }
}