import javax.lang.model.util.ElementScanner14;

public class vote 
{
    public static void main (String[] args)    
    {
        int age = Integer.parseInt(args[0]);
        if(age <= 0)
        {
            System.out.println("Error");
        }
        else if(age >= 18)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }

    }
}
