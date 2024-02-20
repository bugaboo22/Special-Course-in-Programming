package exercise1;

import java.util.ArrayList;
import java.util.Collections;

public class Exercise1_3 {

	public static <T> void swapFirstAndLast(ArrayList<T> list) {
        if (list != null && list.size() > 1) {
            Collections.swap(list, 0, list.size() - 1);
        }
    }

    public static void main(String[] args) {
        // Test with a list of integers
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        System.out.println("Original integer list: " + intList);
        swapFirstAndLast(intList);
        System.out.println("Modified integer list: " + intList);

        // Test with a list of strings
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Cherry");
        System.out.println("Original string list: " + stringList);
        swapFirstAndLast(stringList);
        System.out.println("Modified string list: " + stringList);
    }
	
}
