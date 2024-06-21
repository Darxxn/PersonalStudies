package Java.ArraysAndArraylists.ArrayLists.AddingAnItem;

import java.util.ArrayList;

class ToDos {
    
  public static void main(String[] args) {
    
    ArrayList<String> toDoList = new ArrayList<String>();
    String toDo1 = "Water plants";
    
    String toDo2 = "eat lunch";
    
    String toDo3 = "take a nap";

    toDoList.add(toDo1);
    toDoList.add(toDo2);
    toDoList.add(toDo3);

    System.out.println(toDoList);
  }
  
}
