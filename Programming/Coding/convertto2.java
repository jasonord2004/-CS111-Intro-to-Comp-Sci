
public class convertto2 
{
    public static void main(String[] args)
    {
        convert(100);
        System.out.println();
        // System.out.println(convertStr(100));
    }

    public static int convert(int n)
    {
        int quotient = n / 2;
        int remainder = n % 2;
        if (quotient > 0);
        {
            convert(quotient);
        }
        System.out.print(remainder);
        
    }

    // public static String convertStr(int n)
    // {
    //     if (n == 1) return "1";
    //     return convertStr(n/2) + (n % 2);
    // }

}
