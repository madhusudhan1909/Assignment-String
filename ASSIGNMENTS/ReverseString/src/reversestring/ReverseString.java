/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reversestring;

/**
 *
 * @author madhu
 */
public class ReverseString {

    public static void main(String[] args) {
        String input = "iNeuron";
        String reversed = reverseString(input);
        System.out.println("Reversed String: " + reversed);
    }

    public static String reverseString(String str) {
        int length = str.length();
        StringBuilder reversed = new StringBuilder();

        for (int i = length - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }

        return reversed.toString();
    }
}
