package CoreJavaBrushup;

public class MethodsDemo {
    public static void main(String[] args) {

        // Why use methods?
        // If you have a set of lines of code that you want to reuse multiple times,
        // you can wrap the lines of code in a method. This method can be given a name
        // and called whenever needed.

        // Creating an object of MethodsDemo to call the non-static method getData
        MethodsDemo demo = new MethodsDemo();
        String name = demo.getData();
        System.out.println(name);

        // Creating an object of MethodsDemo2 to call its methods
        MethodsDemo2 demo2 = new MethodsDemo2();
        demo2.getUserData();

        // Accessing a static method without creating an object
        getData2();
    }

    // A non-static method that prints a message and returns a string
    public String getData() {
        System.out.println("Hello world");
        return "Rohan Aher";
    }

    // A static method that prints a message and returns a string
    // When you mark your method as static, it belongs to the class, not to any specific object
    public static String getData2() {
        System.out.println("Hello world");
        return "Rohan Aher";
    }
}


