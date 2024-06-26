package Java.ConditionalsAndControlFlow.CarLoan;

public class CarLoan {
	public static void main(String[] args) {
    int carLoan = 10000;
    int loanLength = 3;
    int interestRate = 5;
    int downPayment = 2000;
    if (loanLength <= 0 || interestRate <= 0) {
    System.out.println("Error! You must take out a valid car loan.");
    }

    else if (downPayment >= carLoan) {
      System.out.println("The car can be paid in full.");
    }

    else {
      // monthly payment
      int remainingBalance = carLoan - downPayment;
      // convert the years into months (for monthly payments)
      int months = loanLength * 12;
      // find the monthly payment
      int monthlyBalance = remainingBalance / months;
      // calculate the interest
      int interest = (monthlyBalance * interestRate) / 100;
      int monthlyPayment = monthlyBalance + interest;

      System.out.println(monthlyPayment);
    }
  }
}
