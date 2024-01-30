/*************************************************************************
 *  Compilation:  javac RandomWalker.java
 *  Execution:    java RandomWalker 10
 *
 *  @author: Jason Ordonez, jro73@scarletmail.rutgers.edu, jro73
 *
 * The program RandomWalker that takes an int command-line argument n
 * and simulates the motion of a random walk for n steps. Print the
 * location at each step (including the starting point), treating the
 * starting point as the origin (0, 0). Also, print the square of the
 * final Euclidean distance from the origin.
 *
 *  % java RandomWalker 10
 * (0,0)
 * (-1,0)
 * (-1,-1)
 * (-1,-2)
 * (-1,-3)
 * (-1,-4)
 * (-1,-5)
 * (0,-5)
 * (-1,-5)
 * (-2,-5)
 * (-2,-4)
 * Squared distance = 20.0
 *
 *************************************************************************/

public class RandomWalker {

    public static void main(String[] args) 
    {
        int n = Integer.parseInt(args[0]);
        int x = 0;
        int y = 0;
        if (n < 0)
        {
            System.out.println("ERROR");
        }
        System.out.println("(" + x + "," + y + ")");
        for (int i = 0; i < n; i++)
        {
            int a = (int) (Math.random()*2) + 1;
            // Randomly Picks 1 or 2 for each step

            if (a == 1) //x direction
            {
                int b = (int) (Math.random()*2) + 1;
                // Randomly Picks 1 or 2 
                if (b == 1) // Forwards
                {
                    x = x + 1;
                    System.out.println("(" + x + "," + y + ")");
                }
                else // Backwards
                {
                    x = x - 1;
                    System.out.println("(" + x + "," + y + ")");
                }
            }

            if (a == 2) //y direction
            {
                int c = (int) (Math.random()*2) + 1;
                // Randomly Picks 1 or 2
                if (c == 1) // Forwards
                {
                    y = y + 1;
                    System.out.println("(" + x + "," + y + ")");
                }
                else // Backwards
                {
                    y = y - 1;
                    System.out.println("(" + x + "," + y + ")");
                }
            }
        }

        double squaredDistance = 1.0 * (x * x) + (y * y);
        System.out.println("Squared distance = " + squaredDistance);

    }
}
