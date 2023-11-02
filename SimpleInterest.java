public class SimpleInterest     // This is a class named SimpleInterest.
{  
  public static int InterestRate(int rate, int time, int principle) // This is a method named InterestRate that calculates simple interest.
    {
        int simpleInterest = (principle * rate * time) / 100;  // Calculate simple interest using the formula: (principle * rate * time) / 100
        return simpleInterest;  // Return the calculated simple interest.
    }

    public static void main(String args[])  // This is the main method where the program starts execution.
    {
        SimpleInterest mySimpleInterest = new SimpleInterest();  // Creating an instance of the SimpleInterest class.

        int simpleInt = mySimpleInterest.InterestRate(5, 5, 100000);  //Passing the values of rate,time and principal

        System.out.println("The simple interest is: " + simpleInt);  // Print the calculated simple interest to the console.
    }
}
