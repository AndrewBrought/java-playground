package grades;
import util.Input;
import java.util.HashMap;



public class GradesApplication {

    static HashMap<String, Student> students = new HashMap<>();
    Input input = new Input();




//    userName Method for getting and printing the username keyset
    public static void studentList(){
//  iterating through the hashmap named students for the keySet of the type String of usernames
        for(String username : students.keySet()){
//  this prints the keySet username
            System.out.println(username);
        }
        System.out.println();
    }

    public void viewIndividualStudent(){
        String studentKey = input.getString("Which student would you like more info on?");

        if(students.containsKey(studentKey)){
            System.out.println("Name " + students.get(studentKey).getName() + " -GitHub username: " + studentKey);
            System.out.printf("Current Average: %.2f\n", students.get(studentKey).getGradeAverage());
            System.out.println("All Grades: " + students.get(studentKey).getGrades());
        } else{
            System.out.println("Sorry, no student found with the GitHub username of \"" + studentKey + "\"");
        }

    }

    public static void viewAllGrades(){
        for(String username : students.keySet()){
            System.out.println(username + " : " + students.get(username).getGrades());
        }
    }

    public static void viewClassAverage(){
        double sumOfAverages = 0;
        for(String username : students.keySet()){
            sumOfAverages += students.get(username).getGradeAverage();
        }
        System.out.printf("%.2f\n",sumOfAverages / students.size());
    }

    public static void viewReport(){
        System.out.println("name,github,_username,average");
        for(String username : students.keySet()){
            System.out.printf("%s, %s, %.2f\n",students.get(username), username, students.get(username).getGradeAverage());
        }
    }




    public static void main(String[] args) {


        Student tina = new Student("Tina");
        tina.addGrade(98);
        tina.addGrade(86);
        tina.addGrade(92);
        tina.addGrade(92);


        Student mario = new Student("Mario");
        mario.addGrade(96);
        mario.addGrade(88);
        mario.addGrade(98);
        mario.addGrade(98);


        Student virginia = new Student("Virginia");
        virginia.addGrade(89);
        virginia.addGrade(86);
        virginia.addGrade(94);
        virginia.addGrade(94);

        Student clint = new Student("Clint");
        clint.addGrade(89);
        clint.addGrade(95);
        clint.addGrade(91);
        clint.addGrade(95);

        students.put("notaLlama2020", tina);
        students.put("itsaMeM88", mario);
        students.put("personNotaState21", virginia);
        students.put("feelinLuckyClint", clint);



    }
}
