import java.util.Arrays;

public class StringSorting {
    public static void main(String[] args) {
        String str = "ineuron";

        String sorted = sortString(str);

        System.out.println("Sorted String: " + sorted);
    }

    public static String sortString(String str) {
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }
}
