package grades;

import java.util.ArrayList;

public class Student {

    private String name;
    ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    // returns the student's name
    public String getName(){
        return name;
    }
    // adds the given grade to the grades property
    public void addGrade(int grade){
        grades.add(grade);
    }
    // returns the average of the students grades
    public double getGradeAverage(){
        double sum = 0;
        for(Integer grade : grades){
            sum += grade;
        }
        double average = (double) sum / grades.size();
        return average;
    }

    public String getGrades(){
        StringBuilder str = new StringBuilder();
        for(int grade : grades){
            str.append(grade + ",");
        }
        return str.toString();
    }

    public static void main(String[] args) {
//        Student jane = new Student("Jane");
//        jane.addGrade(100);
//        jane.addGrade(75);
//        jane.addGrade(50);
//        System.out.println(jane.getGradeAverage());
    }

}
