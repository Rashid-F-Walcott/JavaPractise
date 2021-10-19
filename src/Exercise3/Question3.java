package Exercise3;

// Write a program that takes an input from the user. Either yes or no.
// If yes it displays a random joke and asks the same question. If no exit the program..

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {

        while (true) {
            Scanner Input = new Scanner(System.in);
            System.out.println("Want to here a joke?...yes or no");
            String answer = Input.nextLine();

             switch(answer) {
                 case "yes":
                     System.out.println("Police arrested two kids yesterday, one was drinking battery acid, the other was eating fireworks.\n" +
                             "\n" + "They charged one and let the other one off.");
                     continue;

                 case  "no":
                     System.out.println("Ok Bye");
                     break;

                 default:
                     System.out.println("It was a yes or no question....");
                   break;
             }
            System.out.println("That's all folks");
                 break ;

             }
    }
}
