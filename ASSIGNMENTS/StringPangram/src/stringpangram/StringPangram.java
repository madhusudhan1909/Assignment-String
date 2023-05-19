/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringpangram;

/**
 *
 * @author madhu
 */
public class StringPangram {

    
     public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog";

        boolean isPangram = checkPangram(str);

        if (isPangram) {
            System.out.println("The string is a pangram.");
        } else {
            System.out.println("The string is not a pangram.");
        }
    }

    public static boolean checkPangram(String str) {
        // Remove whitespace and convert string to lowercase
        str = str.replaceAll("\\s", "").toLowerCase();

        // Create a boolean array to track the occurrence of each letter
        boolean[] letters = new boolean[26];

        // Iterate over each character in the string
        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                int index = ch - 'a';
                letters[index] = true;
            }
        }

        // Check if all letters from 'a' to 'z' are present
        for (boolean letter : letters) {
            if (!letter) {
                return false;
            }
        }

        return true;
    }
}