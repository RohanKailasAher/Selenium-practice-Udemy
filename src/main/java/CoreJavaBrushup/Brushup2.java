package CoreJavaBrushup;

import java.util.ArrayList;

public class Brushup2 {
    public static void main(String[] args) {
        int[] arr3 = {2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 14, 15, 16};

        // Check if array has multiples of 2
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] % 2 == 0) {
                System.out.println(arr3[i] + ": is a multiple of 2");
            } else {
                System.out.println(arr3[i] + " is not a multiple of 2");
            }
        }

        // ArrayList operations
        ArrayList<String> a = new ArrayList<>();
        a.add("Rohan");
        a.add("Yash");
        a.add("Om");
        a.add("Ankita");

        // Remove the element at index 2 and print the removed element
        System.out.println("Removed: " + a.remove(2));

        // Print the element at index 2 (after removal)
        System.out.println("Element at index 2: " + a.get(2));

        for(int i =0;i<a.size();i++){
            System.out.println(a.get(i));
        }
        System.out.println("===================================");
        for (String val : a){
            System.out.println(val);
        }
        //item is present in arraylist
        System.out.println(a.contains("Rohan"));

        System.out.println("=======================================================");

        ArrayList<Integer> a2 = new ArrayList<>();
        a2.add(1);
        a2.add(2);
        a2.add(3);
        a2.add(4);
        System.out.println(a2.get(2));
        System.out.println(a2.remove(2));
        System.out.println(a2.get(2));

    }
}
