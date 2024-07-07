/**
 * Take a look at the for loop in the code editor. It starts its iteration at 0 and continues to iterate until i < 100 is false.
 * Inside the loop, create a condition that checks if i is not divisible by 5.
 * If the condition is true, skip the iteration. Outside the condition statement, print i.
 * The final solution should not contain an else statement.
 * The only numbers that should be printed are those that are divisible by 5!
 */
class Numbers {
    public static void main(String[] args) {
      for (int i = 0; i < 100; i++) {
        if (i % 5 != 0) {
          continue;
        }
        System.out.println(i); 
      }
    }
  }
      