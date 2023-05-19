package vowelconsonantcount;

public class VowelConsonantCount {
    public static void main(String[] args) {
        String str = "Ineuron";

        int vowelCount = countVowels(str);
        int consonantCount = countConsonants(str);

        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);
    }

    public static int countVowels(String str) {
        str = str.toLowerCase();
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        return count;
    }

    public static int countConsonants(String str) {
        str = str.toLowerCase();
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z' && !(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')) {
                count++;
            }
        }

        return count;
    }
}
