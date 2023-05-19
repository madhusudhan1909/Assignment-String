package specialcharactercount;

public class SpecialCharacterCount {
    public static void main(String[] args) {
        String str = "Hello! @#$%^& World.";

        int specialCharCount = countSpecialCharacters(str);

        System.out.println("Number of special characters: " + specialCharCount);
    }

    public static int countSpecialCharacters(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch)) {
                count++;
            }
        }

        return count;
    }
}
