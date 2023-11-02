public class CompoundInterest {
    public static void main(String[] args) 
    {
        Loan loan = new Loan(500000, 18, 3, 12); // Loan object with initial parameters
        double total = loan.Amount();// The total amount stored in 'total'
        System.out.println("Mr Bob will have paid:" + total);// Print the total amount paid by Mr. Bob
    }
}

class Loan { //A class named Loan
    // Declare variables for the loan
    double principal;          // The initial loan amount
    double rate;               // Annual interest rate (converted to decimal)
    double time;               // Loan duration in years
    double numberOftimes;      // Number of times interest is monthly
  
    public Loan(double principal, double rate, double time, double numberOftimes) {
        this.principal = principal;
        this.rate = rate / 100;   // Convert the annual interest rate to decimal
        this.time = time;
        this.numberOftimes = numberOftimes;
    }

    public double Amount() { // Calculate and return the total loan amount with interest
        return principal * Math.pow(1 + (rate / numberOftimes), numberOftimes * time); // Calculate the compound interest using the formula
    }
}
