public class Droid {
    int batteryLevel;
    String name; 
  
    public static void main(String[] args) {
      Droid Codey = new Droid("Codey");
      System.out.println(Codey);
      Codey.performTask("running");
      Codey.performTask("sleeping");
      Codey.energyReport();
  
      Droid Casper = new Droid("Casper");
      System.out.println(Casper);
  
      Casper.energyTransfer(Codey, Casper);
    }
  
    public Droid(String droidName) {
      name = droidName;
      batteryLevel = 100;
    }
  
    public void performTask(String task) {
       System.out.println(name + " is performing task: " + task);
       batteryLevel -= 10;
    }
  
    public void energyReport() {
      System.out.println("Current battery level is: " + batteryLevel);
    }
  
    public void energyTransfer(Droid one, Droid two) {
      int holder = one.batteryLevel;
      one.batteryLevel = two.batteryLevel;
      two.batteryLevel = holder;
      System.out.println(one.batteryLevel);
    }
  
    public String toString() {
      return "Hello, I'm the droid: " + name;
    }
  }
