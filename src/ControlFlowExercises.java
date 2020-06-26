import java.util.Scanner;

public class ControlFlowExercises {

    public static void main(String[] args) {

//        int i = 0;
//        while (i < 10) {
//            System.out.println("i is " + i);
//            i++;
//        }

//        int i = 5;
//        while(i <= 15){
//            System.out.println(i);
//            i += 5;
//        }

//        int x = 0;
//        do{
//            System.out.println(x);
//           x += 2;
//        }while(x <= 100);

//        long i = 2;
//        do{
//            System.out.println(i);
//            i *= i;
//        }while (i < 1000000000);

//    for(int i = 1; i <= 100; i++){
//        if(i % 15 == 0){
//            System.out.println("FizzBuzz");
//        }else if(i % 3 == 0){
//            System.out.println("Fizz");
//        } else if(i % 5 == 0){
//            System.out.println("Buzz");
//        } else{
//            System.out.println(i);
//        }
//    }

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome");
        System.out.println("What number would you like to go up to?");
        int userInput = sc.nextInt();
        System.out.println("Here is your table!");
        System.out.println("number | squared | cubed");
        System.out.println("------ | ------- | ------");
        for(int i = 1; i <= userInput; i++){
            System.out.println(i + "      | " + i * i + "       | " + i * i * i);
        }

    }

}
