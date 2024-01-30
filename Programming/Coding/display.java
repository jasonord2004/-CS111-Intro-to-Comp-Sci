public class display {
   
    public static void main()
    {
        printnumber();
    }
   
    public static void printnumber(int n)
    {
        if (n>=0)
        {
            printnumber(n-1);
            System.out.println(n);
        }
    }
}
