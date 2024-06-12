public class ConditionalAnd {
    int guestCount;
    int restaurantCapacity;
    boolean isRestaurantOpen;
    boolean isConfirmed;
    
    public ConditionalAnd(int count, int capacity, boolean open) {
      guestCount = count;
          restaurantCapacity = capacity;
          isRestaurantOpen = open;
    }  
    
    public void confirmReservation() {
      /* 
         Write conditional
         ~~~~~~~~~~~~~~~~~
         if restaurantCapacity is greater
         or equal to guestCount
         AND
         the restaurant is open:
           print "Reservation confirmed"
           set isConfirmed to true
         else:
           print "Reservation denied"
           set isConfirmed to false
      */
      if ((restaurantCapacity >= guestCount) && (isRestaurantOpen)) {
        isConfirmed = true;
        System.out.println("Reservation confirmed");
      }
  
      else {
        isConfirmed = false;
        System.out.println("Reservation denied");
      }
    }
    
    public void informUser() {
      System.out.println("Please enjoy your meal!");
    }
    
    public static void main(String[] args) {
      ConditionalAnd partyOfThree = new ConditionalAnd(3, 12, true);
      ConditionalAnd partyOfFour = new ConditionalAnd(4, 3, true);
      partyOfThree.confirmReservation();
      partyOfThree.informUser();
      partyOfFour.confirmReservation();
      partyOfFour.informUser();
    }
  }