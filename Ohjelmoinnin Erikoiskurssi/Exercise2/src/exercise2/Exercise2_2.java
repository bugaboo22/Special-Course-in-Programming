package exercise2;

import java.util.*;

public class Exercise2_2 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> substringCounts = new HashMap<>();

        while (true) {
            System.out.println("Enter a word: ");
            String word = scanner.nextLine();
            countSubstrings(word, substringCounts);

            System.out.println("You want to contunue? (y/n)");
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("n")) {
                break;
            }
        }
        
        System.out.print("Frequency of substring occurrences: ");
        for (Map.Entry<String, Integer> entry : substringCounts.entrySet()) {
            System.out.print(entry.getKey() + ": " + entry.getValue() + ", ");
        }
        System.out.println();
    }

    private static void countSubstrings(String word, Map<String, Integer> counts) {
        for (int i = 0; i < word.length(); i++) {
            for (int j = i + 1; j <= word.length(); j++) {
                String sub = word.substring(i, j);
                counts.put(sub, counts.getOrDefault(sub, 0) + 1);
            }
        }
    }
	
}
