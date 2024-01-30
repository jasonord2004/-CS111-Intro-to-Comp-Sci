public class array1
{
    public static void main(String[] args)
    {
        int numElts = args.length;
        int[] a = new int[numElts];
        for(int i = 0; i < numElts; i++)
        {
            a[i] = Integer.parseInt(args[i]);
        }
      
        for (int elt : a)
        {
            System.out.print(elt + " ");
        }
        System.out.println();

    }
}