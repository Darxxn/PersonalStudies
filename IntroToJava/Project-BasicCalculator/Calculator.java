// Perform basic arithmetic equations
public class Calculator {
    public static void main(String[] args) {
      Calculator myCalculator = new Calculator();
      System.out.println(myCalculator.add(5, 7));
      System.out.println(myCalculator.subtract(45, 11));
      System.out.println(myCalculator.modulo(40, 9));
    }
  
    public Calculator() {
    }
  
    public int add(int a, int b) {
      return a + b;
    }
  
    public int subtract(int a, int b) {
      return a - b;
    }
  
      public int multiply(int a, int b) {
        return a * b;
    }
  
      public int divide(int a, int b) {
        return a / b;
    }
  
      public int modulo(int a, int b) {
        return a % b;
    }
  }