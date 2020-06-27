package movies;
import util.Input;

import java.util.Scanner;

public class MoviesApplication {

      public static Movie[] movies = MoviesArray.findAll();

    public static void viewAllMovies(){
        for(Movie movie : movies){
            System.out.println(movie.getName() + " -- " + movie.getCategory());
        }
    }

    public static void animatedMovies(){
        for(Movie movie : movies){
            if(movie.getCategory().equalsIgnoreCase("animated")){
                System.out.println(movie.getName() + " -- " + movie.getCategory());
            }
        }
    }

    public static void dramaMovies(){
        for(Movie movie : movies){
            if(movie.getCategory().equalsIgnoreCase("drama")){
                System.out.println(movie.getName() + " -- " + movie.getCategory());
            }
        }
    }

    public static void horrorMovies(){
        for(Movie movie : movies){
            if(movie.getCategory().equalsIgnoreCase("horror")){
                System.out.println(movie.getName() + " -- " + movie.getCategory());
            }
        }
    }

    public static void scifiMovies(){
        for(Movie movie : movies){
            if(movie.getCategory().equalsIgnoreCase("scifi")){
                System.out.println(movie.getName() + " -- " + movie.getCategory());
            }
        }
    }

    public static void main(String[] args) {
//      Scanner
        Input userInput = new Input();
//      Boolean control group
        boolean response;


//        Start of the app
        System.out.println("Welcome to the movies app");

        do{
            System.out.printf("What would you like to do?\n" +
                    "\n" +
                    "0 - exit\n" +
                    "1 - view all movies\n" +
                    "2 - view movies in the animated category\n" +
                    "3 - view movies in the drama category\n" +
                    "4 - view movies in the horror category\n" +
                    "5 - view movies in the scifi category\n" +
                    "\n" +
                    "Enter your choice: \n");

//              User response and list of possible outcomes
                int userResp = userInput.getInt(0,5);

                if(userResp == 0){
                    System.out.println("Thanks for using the movies app!");
                    break;
                }
                if(userResp == 1){
                    System.out.println("Here is a list of all of our movies: ");
                    viewAllMovies();
                }
                if(userResp == 2){
                    System.out.println("Here is a list of our collection of animated movies: ");
                    animatedMovies();
                }
                if(userResp == 3){
                    System.out.println("Here is a list of our collection of drama movies: ");
                    dramaMovies();
                }
                if(userResp == 4){
                    System.out.println("Here is a list of our collection of horror movies: ");
                    horrorMovies();
                }
                if(userResp == 5){
                    System.out.println("Here is a list of our collection of sciFi movies: ");
                    scifiMovies();
                }
//          Boolean question and user response check
            System.out.println("Would you like to continue?");

                response = userInput.yesNo();


        }while(response);

        System.out.println("Bye!"); //End of app




    }



}
