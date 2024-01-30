public class eqTriangle
{
    public static void main (String[] args)
    {
        //(double x0, double y0, double x1, double y1)
        double height = Math.sqrt(3.0)/2.0;
        StdDraw.line (0.0, 0.0, 1.0, 0.0);
        StdDraw.line (1.0, 0.0, 0.5, height);
        StdDraw.line (0.5, height, 0.0, 0.0);
    }
}