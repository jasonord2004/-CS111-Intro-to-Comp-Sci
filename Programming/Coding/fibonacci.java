public class fibonacci
{
    public static int fibonacci (int n)
    {
        if (n == 1 || n == 2)
        {
            return 1;
        }

        return fibonacci (n - 1) + fibonacci (n - 2);
    }
}

    public static void pyramid (int nStars)
    {
        if (nStars == 1)
        {
            return printrow(1);
        }

        Pyramid (nstars - 1);
        printRow(nstars);
    }

    public static void upsideDownPyramid (int nStars)
    {
        if nStars == 1;
        {
            return printRow(1);
        }
        
        printRow(nStars);
        upsideDownPyramid(nStars - 1);
    }

    // recurserecursion