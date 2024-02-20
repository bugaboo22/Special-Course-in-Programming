package exercise2;

import java.util.*;


public class Exercise2_1 {

	// Method that prints all the values of a list in order of magnitude
    public static <T extends Comparable<T>> void printAllElementsSorted(List<T> list) {
        Set<T> sortedElements = new TreeSet<>(list);
        System.out.println("All values " + sortedElements);
    }

    // Method that prints unique numbers in order of magnitude and their frequencies
    public static <T extends Comparable<T>> void printUniqueElementsSortedAndCounts(List<T> list) {
        Map<T, Integer> elementCounts = new TreeMap<>(); 

        // Calculate the frequency of each element
        for (T element : list) {
            elementCounts.put(element, elementCounts.getOrDefault(element, 0) + 1);
        }

        // Print unique values and their frequencies
        System.out.print("Unique values in order of magnitude and their frequencies: ");
        for (Map.Entry<T, Integer> entry : elementCounts.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.print(entry.getKey() + "(1 times) ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Testing 1: A list containing 50 random integers ranging from 1 to 30
        List<Integer> randomNumbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 50; i++) {
            randomNumbers.add(random.nextInt(30) + 1);
        }

        printAllElementsSorted(randomNumbers);
        printUniqueElementsSortedAndCounts(randomNumbers);

        // Testing 2: A list containing duplicate strings
        List<String> strings = Arrays.asList("apple", "banana", "banana", "kiwi", "apple", "mango");
        printAllElementsSorted(strings);
        printUniqueElementsSortedAndCounts(strings);
    }
	
}
