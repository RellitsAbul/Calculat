package Сalculator;

import java.util.Scanner;

public class Input {
     private String[] words;
     public Input() throws InputException {
        String input;
        Scanner in = new Scanner(System.in);
        input = in.nextLine();
        words = input.split("\\s");
         if(words.length != 3 && !(words[1].equals("+") || words[1].equals("-") || words[1].equals("*") || words[1].equals("/")) )
            throw new InputException("Input is incorrect");
    }
    public String[] getWords() {
        return words;
    }
}
