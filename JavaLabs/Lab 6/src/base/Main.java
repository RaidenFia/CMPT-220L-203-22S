package base;
import java.util.LinkedList;

public class Main {
    /**
     * # Lab Six
     * ---
     *
     * For this lab we're going to be messing around with our Linear Data Types,
     * as well as creating a plant Object!
     *
     * Our Goals are:
     * - Creating an Array
     * - Creating an ArrayList
     * - Creating an LinkedList
     * - Creating an Queue
     * - Creating an Stack
     * - Create a Plant
     *
     * Please show the ability to:
     * - Create these data types
     * - Populate the data types
     * - Print out the Linear Data Types
     */
    public static void main(String[] args) {

        // Create an Array, Populate it, and Print it out
         int[] numbers = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};

        System.out.println("Printing Number array:");
        for (int number: numbers) {
             System.out.println(number);
        }
        
        // Create an ArrayList, Populate it, and Print it out
        ArrayList<Integer> numbers2 = new ArrayList<Integer>();
        numbers2.add(20);
        numbers2.add(62);
        
        System.out.println("Printing Number arraylist:");
        for (int number: numbers2) {
            System.out.println(number);
        }
        
                // Create an LinkedList, Populate it, and Print it out
        System.out.println("Printing Burger linkedlist:");
        LinkedList<String> burger = new LinkedList<String>();
        
        burger.add("Bottom Bun");
        burger.add("Hamburger patty");
        burger.add("Lettuce");
        burger.add("Tomato");
        burger.add("Mayonase");
        burger.add("Top Bun");
        
        System.out.println(bagel);
        
                // Create an Queue, Populate it, and Print it out
        System.out.println("Queue List:");
        Queue<String> nextInLine = new LinkedList<String>();
        nextInLine.add("Aiden");
        nextInLine.add("Serena");
        nextInLine.add("Nicole");
        nextInLine.add("Ryan");
        
        System.out.println(nextInLine);
        
        // Create an Stack, Populate it, and Print it out
        System.out.println("Printing Number stack:");
        Stack<String> tower = new Stack<String>();
        tower.push("1");
        tower.push("12");
        tower.push("123");
        tower.push("1234");
        tower.push("12345");

        // Using the information in the Lab 6 Jupyter Notebook create an instance of plant here.
        plant plant1 = new plant(true, "flower", "carrot");
        // Linked List
        plant1.addLinkedInstruction("Pour water on a daily basis");
        plant1.addLinkedInstruction("wait for the water to be absorbed by the plant's roots");
        //Array List
        plant1.addArrayList("Hibiscus");
        plant1.addArrayList("Rose");
        plant1.addArrayList("Tulip");
        // Queue
        plant1.addQueue("Make a hole inside the dirt/soil");
        plant1.addQueue("place your seed in the dirt/soil");
        plant1.addQueue("cover the seed in the dirt/soil");
        plant1.addQueue("water seed regulary so the seed wont die");
        // Stack
        plant1.addStack("Bottom of the pot");
        plant1.addStack("Soil");
        plant1.addStack("Top of the pot where the plant can photosythesize");
        plant1.addArray(1);
        // plant1
        System.out.println(plant1.soilStack);

    }
}
        