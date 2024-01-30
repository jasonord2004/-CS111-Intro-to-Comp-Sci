public class factorial{
    public static void main (String[] args)
    {
        int n = Integer.parseInt(args[0]);
        StdOut(factorial(n));
    }

    public static int factorial(int n){
        if (n == 1)
        {
            return 1;
        }
        return n * factorial (n - 1);
    }
}
