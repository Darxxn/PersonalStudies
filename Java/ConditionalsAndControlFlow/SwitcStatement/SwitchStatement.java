package Java.ConditionalsAndControlFlow.SwitcStatement;

public class SwitchStatement {
    boolean isFilled;
    double billAmount;
    String shipping;
    
    public SwitchStatement(boolean filled, double cost, String shippingMethod) {
          if (cost > 24.00) {
        System.out.println("High value item!");
      }
      isFilled = filled;
      billAmount = cost;
      shipping = shippingMethod;
    }
    
    public void ship() {
      if (isFilled) {
        System.out.println("Shipping");
        System.out.println("Shipping cost: " + calculateShipping());
      } else {
        System.out.println("Order not ready");
      }
    }
    
    public double calculateShipping() {
      double shippingCost;
           // declare switch statement here
      switch (shipping) {
        case "Regular":
          shippingCost = 0;
          break;
        case "Express":
          shippingCost = 1.75;
          break;
        default:
          shippingCost = .50;
      }
      return shippingCost;
       }
    
    public static void main(String[] args) {
      // do not alter the main method!
      SwitchStatement book = new SwitchStatement(true, 9.99, "Express");
      SwitchStatement chemistrySet = new SwitchStatement(false, 72.50, "Regular");
      
      book.ship();
      chemistrySet.ship();
    }
  }
  