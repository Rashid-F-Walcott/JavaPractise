package Exercise1;

// Write a program that reverses an array of Strings
//Given ["you", "are", "how", "Hello"]
//Print "hello how are you?""


public class Question1 {
    public static void main(String[] args) {

        String[] WelcomeArray = {"you", "are", "how", "Hello"};
        System.out.println("Reversed Array:");
        for(int i=WelcomeArray.length-1; i>=0; i--)
            System.out.print(WelcomeArray[i] + "  ");

    }
}
