/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reversesentence;

/**
 *
 * @author madhu
 */
public class ReverseSentence {

    public static void main(String[] args) {
        String input = "Think Twice";
        String reversed = reverseSentence(input);
        System.out.println("Reversed Sentence: " + reversed);
    }

    public static String reverseSentence(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder reversed = new StringBuilder();

        for (String word : words) {
            StringBuilder wordReversed = new StringBuilder(word);
            wordReversed.reverse();
            reversed.append(wordReversed).append(" ");
        }

        return reversed.toString().trim();
    }
}






