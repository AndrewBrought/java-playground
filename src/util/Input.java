package util;

import java.util.Scanner;

public class Input {

    private Scanner input;

    public Input(){
        this.input = new Scanner(System.in);
    }

//    String input
    public String getString(){
        return input.nextLine();
    }

//    True/False input
    public boolean yesNo(){
        String userInput = input.nextLine();
        if(userInput.equalsIgnoreCase("yes") || userInput.equalsIgnoreCase("y")){
            return true;
        } else if(userInput.equalsIgnoreCase("no") || userInput.equalsIgnoreCase("n")){
            return false;
        } else{
            System.out.println("I am sorry... please enter [Y / N]");
            return yesNo();
        }
    }

//  Number input between min and max
    public int getInt(int min, int max){
        int userInt = input.nextInt();
        if(userInt >= min || userInt <= max){
            return userInt;
        } else {
            System.out.println("Please enter a number between " + min + " and " + max);
            return getInt(min, max);
        }
    }

//    Number input
    public int getInt() {
        String s = getString();
        try {
            return Integer.valueOf(s);
        } catch (NumberFormatException e) {
            System.out.println("That's an invalid input.  Please enter an integer...");
            e.printStackTrace();
            return getInt();
        }
    }

//     Decimal input between min and max
        public double getDouble(double min, double max) {
            boolean state = false;
            double userInput;
            do {
                userInput = input.nextDouble();
                if (userInput <= max && userInput >= min) {
                    state = true;
                } else {
                    System.out.println("You entered an invalid input, please enter a decimal between " + min + " and " + max);
                }
            } while (!state);
            System.out.println("Thank you for a valid decimal!");
            return userInput;
        }

//        Decimal input
        public double getDouble() {
            String d = getString();
            try {
                return Double.valueOf(d);
            } catch (NumberFormatException e) {
                System.out.println("invalid input. Please enter a decimal...");
                e.printStackTrace();
                return getDouble();
            }
        }

}



