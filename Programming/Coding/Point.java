public class Point {
    
    private double x;
    private double y;

    public Point(){ //java's instructor initializes all of the private variables
        this.x = 0; //this. is optional most of the time
        this.y = 0; 
    }

    /*this. has to be used when you are taking in parameters that have the 
    same name as the private variable as seen below */
    public Point(double x, double y){
        this.x = x; 
        this.y = y;
    }

    public double getX(){
        return this.x;
    }
    
    public double getY(){
        return this.y;
    }

    public void setX(double x){
        this.x = x;
    }

    public void setY(double y){
        this.y = y;
    }
    
    //Point is the public method earlier, and is used as a Parameter below.
    public double findSlope(Point other){
        double yDiff = this.y - other.getY();
        double xDiff = this.x - other.getX();
        double slope = yDiff/xDiff;
        return slope;
    }

    public Point findMidpoint(Point other){
        double midX = (this.x + other.getX())/2;
        double midY = (this.y + other.getY())/2;
        Point mid = new Point(midX, midY);
        return mid;


    }
    
    /*Translates class + @ + and the hexadecimal representation of the hash code of the object
    (computer data) into a readable result*/
    public String toString(){
        String s = "";
        s = s + "(" + this.x + ", " + this. y + ")";
        return s;
    }

    //overrides Java's equals method because the method below is the same name
    public boolean equals (Object obj){
        //if the object passed in is a Point
        if (obj instanceof Point){
            Point p = (Point) obj;
            return (this.x == p.x) && (this.y == p.y);
        }
        else{
            return false;
        }
    }

    public double findDistanceToOrigin(){
        double dist = Math.sqrt(x*x + y*y);
        return dist;
    }

    public double findDistanceBetween(Point other){
        double xDiff = x - other.x;
        double yDiff = y - other.y;
        double result = Math.sqrt(xDiff * xDiff + yDiff * yDiff);
        return result;
    }
    public static void main(String[] args){
        Point p1 = new Point();
        Point p2 = new Point(3,4);
        Point p3 = new Point(3,4);
        System.out.println(p1.getX());
        System.out.println(p1);
        double theSlope = p1.findSlope(p2);
        System.out.println(theSlope);
        System.out.println(p1.findMidpoint(p2));
        System.out.println(p2.findDistanceToOrigin());
        System.out.println(p1.findDistanceBetween(p2));
        System.out.println(p2 == p3);
        System.out.println(p2.equals(p3));
    }
    
}