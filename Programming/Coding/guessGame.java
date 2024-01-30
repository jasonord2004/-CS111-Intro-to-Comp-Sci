public class guessGame
{
    public static void main (String[] args)
    {
        int n = (int)(Math.random()*1000) + 1;
        Boolean wincondition = false;

        while (wincondition == false)
        {
            StdOut.println("Guess a number between 1 and 1000: ");
            int guess = StdIn.readInt();
            if (guess == n)
            {
                StdOut.println("You Win!");
                wincondition = true;
            }
            else
            {
                if (guess > n)
                {
                    StdOut.println("You're number is too high, try again!");
                }
                if (guess < n)
                {
                    StdOut.println("You're number is too low, try again!");
                }
            }
        }
    }
}