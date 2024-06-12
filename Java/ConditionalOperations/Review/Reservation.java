package Java.ConditionalOperations.Review;

public class Reservation {
    int guestCount;
    int restaurantCapacity;
    boolean isRestaurantOpen;
    boolean isConfirmed;
    
    public Reservation(int count, int capacity, boolean open) {
      if (count < 1 || count > 8) {
        System.out.println("Invalid reservation!");
      }
      guestCount = count;
          restaurantCapacity = capacity;
          isRestaurantOpen = open;
    }  
    
    public void confirmReservation() {
      if (restaurantCapacity >= guestCount && isRestaurantOpen) {
        System.out.println("Reservation confirmed");
        isConfirmed = true;
      } else {
        System.out.println("Reservation denied");
              isConfirmed = false;
      }
    }
    
    public void informUser() {
      if (!isConfirmed) {
        System.out.println("Unable to confirm reservation, please contact restaurant.");
      } else {
        System.out.println("Please enjoy your meal!");
      }
    }
    
    public static void main(String[] args) {
      // Create instances here
        Reservation tooManyPeople = new Reservation(9, 8, true);
        tooManyPeople.confirmReservation();
        tooManyPeople.informUser();

        System.out.println();
        Reservation justEnoughPeople = new Reservation(8, 8, true);
        justEnoughPeople.confirmReservation();
        justEnoughPeople.informUser();

        System.out.println();
        Reservation closedRestaurant = new Reservation(3, 4, false);
        closedRestaurant.confirmReservation();
        closedRestaurant.informUser();
    }
  }