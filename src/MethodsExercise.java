public class MethodsExercise {

//        public static long factorialRecursion(int x){
//            if(x <= 1){
//                System.out.println(1);
//                return 1;
//            }
//                System.out.println( x * (x - 1));
//            return x * factorialRecursion(x - 1);
//        }

    public static long factorial(int x){
        long fact = 1;
        for(int i =1; i <= x; i++){
            fact = fact * i;
            System.out.println(fact);
        }
        return fact;
    }

    public static void main(String[] args) {

//        System.out.println(factorialRecursion(5));
        System.out.println(factorial(5));

    }

}
