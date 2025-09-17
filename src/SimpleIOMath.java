import java.util.Scanner;

/**
 * Asks the user questions, does some stuff
 * The Jackson Five were bangin' in their heyday
 * @version 09.17.2025
 * @author ryanxue
 */

public class SimpleIOMath {
    private String name;
    private int age;
    private int favNumber;

    /**
     * Ask the user some questions using Scanner
     */
    public void promptUser()    {
        Scanner in = new Scanner(System.in);
        System.out.print("Question 1: What is your name? ");
        name = in.nextLine();
        // TODO: Fix this so JC won't break my program
        while (true) {
            System.out.print("Question 2: How old are you? ");
            try {
                age = Integer.parseInt(in.nextLine());
                if (age > 1) break;
                System.out.println("That's.. not true.");
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please try again.");
            }
        }
        while (true) {
            System.out.print("Question 3: What is your favorite number? ");
            try {
                favNumber = Integer.parseInt(in.nextLine());
                if (favNumber == 67) {
                    System.out.println("SIX SEEVEEEEENNN!!!!"); // extra
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please try again.");
            }
        }
    }

    private boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n)+1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    private int firstPrimeFactor() {
        for (int i = 2; i <= Math.sqrt(age); i++) {
            if (isPrime(i) && age % i == 0) {
                return i;
            }
        }
        return age;
    }


    /**
     * Summarize the conversation
     */
    public void printInfo() {
        System.out.println("I'm gonna teach you how to sing it out\n" +
                "Come on, come on, come on\n" +
                "Let me tell you what it's all about\n" +
                "Reading, writing, arithmetic\n" +
                "Are the branches of the learning tree");
        System.out.println("Your name is: " + name);
        System.out.println("Your age is: " + age);
        System.out.println("At your next birthday, you will turn " + (age+1));
        System.out.println("The first prime factor of " + age + " is " + firstPrimeFactor());
        System.out.println("Your favorite number is: " + favNumber);
        System.out.println("Your favorite number squared is: " + (int)(Math.pow(favNumber, 2)));
    }

    /**
     * Main method for class SimpleIOMath
     * @param args command line arguments, if needed
     */
    public static void main(String[] args) {
        SimpleIOMath app = new SimpleIOMath();
        System.out.println("* Sit yourself down, take a seat *\n" +
                "* All you gotta do is repeat after me *");
        app.promptUser();
        app.printInfo();
        System.out.println("* end of program *");
    }
}
