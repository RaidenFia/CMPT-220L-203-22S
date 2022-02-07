package base;

public class Main {
    /**
     * # Lab Three
     *
     * Ok for this lab we're going to reiterate a lot of the things that we went over in class.
     *
     * Our Goals are:
     * - Conditionals
     *     - If
     *     - Else
     *     - Else If
     */
    public static void main(String[] args) {
        // Make an if statement that triggers a print or println statement
       int x = 100;
       int y = 200;
        if (x<y) {
            System.out.println("100 is less than 200");
        }
        // Make an if, else statement where the else statement triggers a print or println statement
        int time = 20;
        if (time < 20) {
            System.out.println("It's so bright out.");
        } else {
            System.out.println("Where the sun go?");
        }

        
        // Make an if, else if, else statement where the else if statement triggers a print or println statement
        boolean cyndaquill = false;
        boolean oshawatt = true;
        boolean rowlett = false;
        if (cyndaquill == true){
            System.out.println("I see you want that Hitsuian Typhlosion. Great Fire/Ghost type");
        } else if (oshawatt == true){
            System.out.println("I see you want that Hitsuian Samurott. Great Water/Dark type");
        } else {
            System.out.println("I see you want the worst Hitsuian Starter. Decidueye has terrible typing as a Grass/Fighting.");
        }
        // Make 2 variables and use them in an if else conditional print from one of the sections
        int age = 20;
        int height = 6;
        if(age > 20 && height > 6){
            System.out.println("You are older and taller than me");
        } else if (age == 20 && height == 6){
            System.out.println("We are the exact same height and age! Are you my twin?");
        } else {
            System.out.println("Im both taller and older than you!");
        }

        // Make an if statement using 2 variables and an AND(&&) statement that triggers a print or println statement
        int birthdaymonth = 11;
        int birthdayday = 21;
        if(birthdaymonth == 11 && birthdayday == 21){
            System.out.println("You share the same birthday as me!");
        }

        // Make an if statement using 2 variables and an OR(||) statement that triggers a print or println statement
        boolean Samoan = true;
        boolean Japanese = true;
        if(Samoan == true || Japanese == true){
            System.out.println("We share the same ethnicity!");
        }
    }
}