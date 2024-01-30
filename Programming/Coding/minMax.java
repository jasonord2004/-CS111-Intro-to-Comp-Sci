public class minMax
{
    public static void main (String[] args)
    {
        int max = StdIn.readInt();
        int min = max;

        while(!StdIn.isEmpty())
        {
            int temp = StdIn.readInt();
    
            if (temp > max)
            {
                max = temp;
            }
            else if (temp < min)
            {
                min = temp;
            }
        }
        StdOut.println ("max = " + max + "  min = " + min);
    }
}

post recitation code: printpassword