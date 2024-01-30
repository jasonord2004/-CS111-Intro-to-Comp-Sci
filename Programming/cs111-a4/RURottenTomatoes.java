import java.util.Arrays;

/*************************************************************************
 *  Compilation:  javac RURottenTomatoes.java
 *  Execution:    java RURottenTomatoes
 *
 *  @author: Jason Ordonez, jro73@scarletmail.rutgers.edu, jro73
 *
 * RURottenTomatoes creates a 2 dimensional array of movie ratings 
 * from the command line arguments and displays the index of the movie 
 * that has the highest sum of ratings.
 *
 *  java RURottenTomatoes 3 2 5 2 3 3 4 1
 *  0
 *************************************************************************/

public class RURottenTomatoes {

    public static void main(String[] args) {

		// WRITE YOUR CODE HERE
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		int[][] array = new int [x][y];

		int v = 2;
		for (int i = 0; i < x; i++)
		{
			for (int j = 0; j < y; j++)
			{
				array[i][j] = Integer.parseInt(args[v]);
				v++;
			}
		}

		int max = 0;
		int c = 0;
		for (int j = 0; j < array[0].length; j++)
		{
			int sum = 0;
			for (int i = 0; i < array.length; i++)
			{
				sum += array[i][j];
			}

			if (sum > max)
			{
				max = sum;
				c = j;
			}
		}

		System.out.println(c);
	}
}
