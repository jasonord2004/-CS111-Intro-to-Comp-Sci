public class Pay
{
    public static void main(String[] args)
    {
        double hoursWorked = Double.parseDouble(args[0]);
        double ratePerHour = Double.parseDouble(args[1]);
        double totalPay = 0;
        if ((hoursWorked < 0) || (ratePerHour < 0))
        {
            System.out.println("error");
        }
        else
        {
            totalPay = hoursWorked * ratePerHour;
            System.out.println("total pay = " + totalPay);
        }
    }
}