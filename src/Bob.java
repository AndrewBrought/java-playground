import java.util.Scanner;

public class Bob {

    public static void main(String[] args) {

        System.out.println("Welcome to the Bob application!");

        System.out.println("Bob is a lackadaisical teenager... In conversation, his responses are very limited.");

        Scanner input = new Scanner(System.in);

        String userInput;
        boolean answer;

            System.out.print("If you wish to leave, tell Bob 'bye'\nTalking to Bob...");
        do{
            userInput = input.nextLine();
            answer = !userInput.equalsIgnoreCase("bye");

           if(userInput.contains("?")){
               System.out.println("Sure...");
            } else if(userInput.contains("!")){
               System.out.println("Whoa, chill out!");
           } else if(userInput.equals("")){
               System.out.println("Fine. Be that way!");
           } else {
               System.out.println("Whatever...");
           }
        }while(answer);

    }
}
