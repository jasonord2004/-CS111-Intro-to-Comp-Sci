public class Fraction {
    
    private int numer;
    private int denom;

    public Fraction(int numerator, int denominator){
        numer = numerator;
        denom = denominator;
    }

    public int gcd(int num1, int num2){
        if (num2 == 0){
            return num1;
        }
        int remainder = num1 % num2;
        return gcd(num2, remainder);
    }

    public String toString(){
        String s = "";
        int divisor = gcd(numer, denom);
        int newNumer = numer / divisor;
        int newDenom = denom / divisor;
        if(newNumer == newDenom || newDenom == 1){
            s = s + newNumer/newDenom;
        }
        else if (numer < denom){
            s = s + newNumer + "/" + newDenom;
        }
        else if (numer > denom){
            s = s + newNumer/newDenom + " " + newNumer % newDenom + "/" + newDenom;
            
        }
        return s;
    }
    public static void main (String[] args){
        Fraction f1 = new Fraction(2,3); // 10/8, 8/10, 6/3
        Fraction f2 = new Fraction(4,5);
        System.out.println(f1);
    }
}