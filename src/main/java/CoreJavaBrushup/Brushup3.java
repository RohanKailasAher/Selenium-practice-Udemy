package CoreJavaBrushup;

public class Brushup3 {
    public static void main(String[] args) {
        // A String is an object in Java that represents a sequence of characters.
        // Q: How many ways can you define a String?
        // A:
        // 1. Using String literal
        // 2. Using the 'new' memory allocator

        // Q: What is the difference between declaring a String literal and creating it with the 'new' keyword?
        // A:
        // - String literal: If you have multiple values with the same name, it won't create a new object. It will refer to the existing one.
        // - Creating with the 'new' keyword: No matter if you have the same values, it will still explicitly create a new object in memory space.
        // Using a String literal does not create a new object every time; if the value is the same, it refers to the same object in the string pool.

        // Creating Strings with literals - may refer to the same object if the value is identical
        String s = "Rohan Aher";
        String s1 = "Rohan Aher";
        String s4 = "Yash";

        // Creating Strings with the 'new' keyword - always creates a new object
        String s2 = new String("Welcome");
        String s3 = new String("Welcome");

        System.out.println("=======================================================");

        // Splitting a string and trimming the resulting parts
        String s6 = "Rohan Kailas Aher";
        String[] splitedString = s6.split("Kailas");
        System.out.println(splitedString[0]);    // Output: "Rohan "
        System.out.println(splitedString[1]);    // Output: " Aher"
        System.out.println(splitedString[1].trim()); // Output: "Aher"

        System.out.println("=======================================================");

        // Printing characters of a string in forward order
        System.out.println("Forward order:");
        for (int i = 0; i < s6.length(); i++) {
            System.out.println(s6.charAt(i));
        }

        // Printing characters of a string in reverse order
        System.out.println("Reverse order:");
        for (int i = s6.length() - 1; i >= 0; i--) {
            System.out.println(s6.charAt(i));
        }
    }
}
