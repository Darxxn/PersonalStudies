package Java.ConditionalsAndControlFlow.Review;

public class Review {
    boolean isFilled;
    double billAmount;
    String shipping;
    
    public Review(boolean filled, double cost, String shippingMethod) {
          if (cost > 24.00) {
        System.out.println("High value item!");
      } else {
        System.out.println("Low value item!");
      }
      isFilled = filled;
      billAmount = cost;
      shipping = shippingMethod;
    }
    
    public void ship() {
      if (isFilled) {
        System.out.println("Shipping");
      } else {
        System.out.println("Order not ready");
      }
      
      double shippingCost = calculateShipping();
      
      System.out.println("Shipping cost: " + shippingCost);
    }
    
    public double calculateShipping() {
      double shippingCost;
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
      // create instances and call methods here!
      System.out.println("International");
      Review international = new Review(false, 36.99, "international");
      international.ship();
      System.out.println();
      System.out.println("Neighbor");
      Review neighbor = new Review(true, 16.50, "Express");
      neighbor.ship();
    }
  }
  