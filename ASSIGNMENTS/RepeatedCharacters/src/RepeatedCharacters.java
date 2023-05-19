import java.util.HashMap;
import java.util.Map;

public class RepeatedCharacters {
    public static void main(String[] args) {
        String str = "Hello World";

        System.out.println("Repeated characters:");
        printRepeatedCharacters(str);
    }

    public static void printRepeatedCharacters(String str) {
        str = str.replaceAll("\\s", "").toLowerCase();
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Count the occurrence of each character
        for (char ch : str.toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        // Print the characters with count greater than 1
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " - Count: " + entry.getValue());
            }
        }
    }
}
