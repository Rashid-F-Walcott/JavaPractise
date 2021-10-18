import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("jello world");

        /*
        String name = "Rashid";

        int age = 20;
        long age2 = 20L;

        double pi = 3.14;
        float pi2 = 3.14F;

        char letter = 'A';
                            */
//        String[] namesArray = {"Ali", "Adam"};
//        System.out.println(Arrays.toString(namesArray));

        Integer[] integerArray = {2, 4, 3, 7, 21, 9, 98, 76, 74};
        System.out.printf("integerArray elements: %s\n", Arrays.toString(integerArray));


        // Arrays.as list can be used to return a list backed by a given array.
        // In other words, both the list and array refer to the same location.
        // Arrays.sort() can be used to list the array in ascending numerical order

        List integerList = Arrays.asList(integerArray);
        Arrays.sort(integerArray);
        System.out.printf("integerList elements: %s\n", Arrays.asList(integerList));







        // In java , There are 'strings' & there are 'string objects'
        //String (created using string literal):
        String brandname = "Amigoscode";

        //String object (note the 'new' keyword):
        String youtubeChannelName = new String("Amigoscode");

        /* The difference is that when we create a 'String object' using the 'new' keyword, it always
    creates a new object in heap memory. And as we just saw, if we create an object using String
    Object method above, it may return an existing object from the String pool, if it already exists.
    Otherwise, it will create a new String object inside the String Pool */

        // String literal method doesnt create an object, just creates a string with
        // value = "whatevers inside the qoutes"


        //EXAMPLE(1)
        /*   ==         returns true if and only if both variables refer to the same object
           . equals()   returns true the "value" inside String is the same
      For this example == returns true because both brand and youtubeChannelName
      refer to the same object inside the String Pool
        */
        String brand = "Amigoscode";
        String youtubeChannelName = "Amigoscode";
        System.out.println(brand == youtubeChannelName); //  Expected True
        System.out.println(brand.equals(youtubeChannelName));  //  Expected True



        //EXAMPLE(2)
        /* For this example == returns false because both brand and youtubeChannelName
         refer to different objects inside the Heap. (Both 'new' string objects).
         */
        String brand = new String("Amigoscode");
        String youtubeChannelName = new String("Amigoscode");
        System.out.println(brand == youtubeChannelName); // False
        System.out.println(brand.equals(youtubeChannelName)); // True



    }

}
