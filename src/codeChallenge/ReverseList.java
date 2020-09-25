package codeChallenge;

import java.util.ArrayList;
import java.util.Stack;

public class ReverseList {


//    Reverse a string, I will solve this a couple similar ways
//    This doesn't make sense to solve in the same way as we did in python...I thought about setting up those conditions
//    here, but I honestly can't find a reason to justify it...so here's the STRING solution in java

    public static String reverseList(String str) {

        String reverse = "";

        for(int i = str.length() -1; i >= 0; i--){
            reverse += str.charAt(i);
        }

        return reverse;

    }

    public static void main(String[] args) {
         String backwards = "!dlroW olleH";

         String back2 = "...tekcop sih ni notgnihsaW tog eh ,gnihctaw lla erew ew elihW";

        System.out.println(reverseList(backwards));

        System.out.println(reverseList(back2));

    }

}
