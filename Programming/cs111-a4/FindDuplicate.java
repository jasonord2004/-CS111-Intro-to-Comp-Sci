/*************************************************************************
 *  Compilation:  javac FindDuplicate.java
 *  Execution:    java FindDuplicate
 *
 *  @author: Jason Ordonez, jro73@scarletmail.rutgers.edu, jro73
 *
 * FindDuplicate that reads n integer arguments from the command line 
 * into an integer array of length n, where each value is between is 1 and n, 
 * and displays true if there are any duplicate values, false otherwise.
 *
 *  % java FindDuplicate 10 8 5 4 1 3 6 7 9
 *  false
 *
 *  % java FindDuplicate 4 5 2 1 2
 *  true
 *************************************************************************/

public class FindDuplicate {

    public static void main(String[] args) 
	{
		int[] a = new int[args.length];
		boolean answer = false;
		for (int n = 0; n < args.length; n++)
		{
			a[n] = Integer.parseInt(args[n]);
		}
		
		for (int counter = 1; counter < args.length; counter++)
		{
			for (int k = 1; k <= counter; k++)
			{
				if (a[counter] == a[counter-k])
				{
					answer = true;
				}

			}
		}
		System.out.println(answer);

	}
}
