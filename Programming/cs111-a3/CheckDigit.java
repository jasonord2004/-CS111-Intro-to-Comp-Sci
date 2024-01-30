/*************************************************************************
 *  Compilation:  javac CheckDigit.java
 *  Execution:    java CheckDigit 020131452
 *
 *  @author: Jason Ordonez, jro73@scarletmail.rutgers.edu, jro73
 *
 *  Takes a 12 or 13 digit integer as a command line argument, then computes
 *  and displays the check digit
 *
 *  java CheckDigit 048231312622
 *  0
 *
 *  java CheckDigit 9780470458310
 *  0
 * 
 *  java CheckDigit 9780470454310
 *  8
 * 
 *  Print only the check digit character, nothing else.
 *
 *************************************************************************/

public class CheckDigit {

    public static void main (String[] args) 
    {
        long input = Long.parseLong(args[0]);
        long n1 = input;
        long sum1 = 0;
        while (n1 > 0)
        {
            sum1 = sum1 + (n1 % 10);
            n1 /= 100;
        }
        sum1 = sum1 % 10;

        long n2 = input/10;
        long sum2 = 0;
        while (n2 > 0)
        {
            sum2 = sum2 + (n2 % 10);
            n2 /= 100;
        }
        sum2 = sum2 % 10;
        sum2 = (3 * sum2) % 10;

        long answer = (sum1 + sum2) % 10;
        System.out.println(answer);
    }
}