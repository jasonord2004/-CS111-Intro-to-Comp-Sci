public class arraysPractice 
{
    public static void main (String[] args)
    {
        double[] a;
        a = new double [10];
        a[1] = 1;
        a[2] = 3;
        a[3] = a[1] + a[2];
        a[4] = 6;
        a[5] = 144;
        a[6] = a[5]/a[4];

        for (double elt : a) //Prints out all the numbers in the array
            System.out.println(elt);
    }    
}
