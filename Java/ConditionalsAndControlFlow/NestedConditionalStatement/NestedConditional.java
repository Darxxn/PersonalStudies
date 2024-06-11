package Java.ConditionalsAndControlFlow.NestedConditionalStatement;

public class NestedConditional {
    boolean isFilled;
    double billAmount;
    String shipping;
    String couponCode;
    
    public NestedConditional(boolean filled, double cost, String shippingMethod, String coupon) {
          if (cost > 24.00) {
        System.out.println("High value item!");
      }
      isFilled = filled;
      billAmount = cost;
      shipping = shippingMethod;
      couponCode = coupon;
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
      if (shipping.equals("Regular")) {
        return 0;
      } else if (shipping.equals("Express")) {
        // Add your code here
        if (couponCode == "ship50") {
          return .85;
        }
  
        else {
          return 1.75;
        }
        
      } else {
        return .50;
      }
       }
    
    public static void main(String[] args) {
      NestedConditional book = new NestedConditional(true, 9.99, "Express", "ship50");
      NestedConditional chemistrySet = new NestedConditional(false, 72.50, "Regular", "freeShipping");
      
      book.ship();
      chemistrySet.ship();
    }
  }
