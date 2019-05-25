
/**
 * Write a description of class PayDay here.
 *
 * @author (Alex Brown)
 * @version (24-May-2019)
 */
public class PayDay
{
    // instance variables - replace the example below with your own
    private String name = "Kris";
    private Double hourlyRate = 12.5;
    private Double hoursWorked = 10.0;
    private Double deductionRate = 0.05;
    
    private Double grossPay = 0.0;
    private Double deduction = 0.0;
    private Double netPay = 0.0;
    
    private String payOut ="";
 
    /**
     * Constructor for objects of class PayDay
     */
    public String PayDay()
    {
        grossPay = gP(hourlyRate, hoursWorked);
        deduction = deductionMethod(grossPay, deductionRate);
        netPay = net( grossPay, deduction);
        
        payOut = name + "  " + grossPay + "   ";
        payOut = payOut + deduction + "   ";
        payOut = payOut + netPay;
        
        System.out.println(payOut);
        return payOut;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public Double deductionMethod(Double gp, Double dr)
    {
        Double deduct = gp * dr;
        return deduct;
    }
    
    
    
    
        public Double gP(Double rate, Double hours)
    {
        Double gross = rate * hours;
        return gross;
    }
    
    
           public Double net(Double gp, Double ded)
    {
        Double netP = gp - ded;
        return netP;
    }
    
    
}
