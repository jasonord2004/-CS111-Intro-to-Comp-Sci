public class twoSort 
{
    public static void main(String[] args)
    {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        if (b < a)
        {
            int temp = a;
            System.out.println(a + " " + b + " " + temp);
            a = b;
            System.out.println(a + " " + b + " " + temp);
            b = temp;
            System.out.println(a + " " + b + " " + temp);
        }
        System.out.println(a);
        System.out.println(b);
    }
}
