import java.util.ArrayList;

//define a method that will return the second largest integer from a list

public class SecondLargest {


    public static int secondLargest(ArrayList<Integer> list) {

        int largest = 0;
        int secondLargest = 0;

        for (int i = 0; i < list.size(); i++) {
            if (i == 0) {
                largest = list.get(i);
            } else if (list.get(1) > largest) {
                largest = list.get(1);
                secondLargest = list.get(0);
            } else if (list.get(i) > largest) {
                secondLargest = largest;
                largest = list.get(i);
            } else if (list.get(i) > secondLargest && list.get(i) < largest) {
                secondLargest = list.get(i);
            }
        }
            return secondLargest;
    }


        public static void main (String[]args){

            ArrayList<Integer> list = new ArrayList<>();
            list.add(33);
            list.add(6);
            list.add(372);
            list.add(5);
            list.add(219);
            list.add(5);

            ArrayList<Integer> list_a = new ArrayList<>();
            list_a.add(1);
            list_a.add(2);
            list_a.add(2);
            list_a.add(9999);
            list_a.add(9999);
            list_a.add(999);
            list_a.add(77);

            ArrayList<Integer> list_b = new ArrayList<>();
            list_b.add(0);
            list_b.add(1);
            list_b.add(0);
            list_b.add(1);
            list_b.add(1);
            list_b.add(2);
            list_b.add(2);

            System.out.println(secondLargest(list));

            System.out.println(secondLargest(list_a));

            System.out.println(secondLargest(list_b));
        }

    }