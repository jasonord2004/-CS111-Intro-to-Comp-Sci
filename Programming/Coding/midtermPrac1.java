import javax.lang.model.util.ElementScanner14;

public class midtermPrac1
{
    public static void main(String[] args)
    {
        // String firstName = (args[1]);
        // String lastName = (args[0]);
        // System.out.println(firstName.concat(lastName));

        // int x = 0;
        // x = (int) (Math.random() * (10) + 1);
        // System.out.println(x);

        // int a = 0;
        // do 
        // {
        //     System.out.print(a);
        //     a++;
        // }
        // while(a <= 6);

        int num = Integer.parseInt(args[0]);
        if (num % 2 == 0)
        {
            System.out.println("even");
        }
        else
        {
            System.out.println("odd");
        }
        
    }
}