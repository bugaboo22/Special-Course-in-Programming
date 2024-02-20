package exercise3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exercise3_3 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> substringCounts = new HashMap<>();

        while (true) {
            System.out.println("Syötä sana: ");
            String word = scanner.nextLine();
            countSubstrings(word, substringCounts);

            System.out.println("Jatketaanko? (k/e)");
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("e")) {
                break;
            }
        }
        
        // T.1 Tulostetaan alkuperäisen HashMapin sisältö
        System.out.println("Osamerkkijonojen esiintymiskerrat:");
        substringCounts.entrySet().stream()
            .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));

        // T.2 Suodatetaan ja tulostetaan osamerkkijonot, joiden määrä on suurempi kuin 2
        Map<String, Integer> filteredSubstrings = substringCounts.entrySet().stream()
                .filter(entry -> entry.getValue() > 2)
                .collect(Collectors.toMap(entry -> entry.getKey(), entry -> entry.getValue()));

        System.out.println("Osamerkkijonot, joita esiintyy yli kaksi kertaa:");
        filteredSubstrings.forEach((key, value) -> System.out.println(key + ": " + value));
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
