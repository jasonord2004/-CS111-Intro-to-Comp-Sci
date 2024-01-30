import java.util.HexFormat;

/*************************************************************************
 *  Compilation:  javac Sierpinski.java
 *  Execution:    java Sierpinski
 *
 *  @author: Jason Ordonez, jro73, jro73@scarletmail.rutgers.edu
 *
 *************************************************************************/

public class Sierpinski {

    // Height of an equilateral triangle whose sides are of the specified length. 
    public static double height(double length) {

	// WRITE YOUR CODE HERE
        double height = (Math.sqrt(3) * length) / 2;
        return height;
    }

    // Draws a filled equilateral triangle whose bottom vertex is (x, y) 
    // of the specified side length. 
    public static void filledTriangle(double x, double y, double length) {

	// WRITE YOUR CODE HERE
        double x1 = x;
        double x2 = x + 0.5*length;
        double x3 = x - 0.5*length;

        double y1 = y;
        double y2 = y + height(length);
        double y3 = y + height(length);
        
        double[] arrx = {x1, x2, x3};
        double[] arry = {y1, y2, y3};
        StdDraw.filledPolygon(arrx, arry);
    }

    // Draws a Sierpinski triangle of order n, such that the largest filled 
    // triangle has bottom vertex (x, y) and sides of the specified length. 
    public static void sierpinski(int n, double x, double y, double length) {

	// WRITE YOUR CODE HERE  
        if (n == 0){
            return;
        }
        if(n > 0){
            filledTriangle(x, y, length);  
            sierpinski(n-1, x+(length/2.0), y, length/2);
            sierpinski(n-1, x-(length/2.0), y, length/2);
            sierpinski(n-1, x, y+height(length), length/2);
        }
        return;
    }

    // Takes an integer command-line argument n; 
    // draws the outline of an equilateral triangle (pointed upwards) of length 1; 
    // whose bottom-left vertex is (0, 0) and bottom-right vertex is (1, 0); and 
    // draws a Sierpinski triangle of order n that fits snugly inside the outline. 
    public static void main(String[] args) {

	// WRITE YOUR CODE HERE 
        int n = Integer.parseInt(args[0]);
        double length = 1.0;
        double x = length/2.0;
        double y = 0;
        double h = height(length);

        StdDraw.line(0.0, 0.0, 1.0, 0.0);
        StdDraw.line(1.0, 0.0, x, h);
        StdDraw.line(x, h, 0.0, 0.0);

        sierpinski(n, x, y, length/2);
    }
}
