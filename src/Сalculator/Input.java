package Сalculator;
import java.util.Scanner;
public class Input {
    private String[] words;
    private String operations = "";
     public Input() throws InputException {
        String input;
        String inputWithoutSpace = "";
        Scanner in = new Scanner(System.in);
        input = in.nextLine();
        int proof = 0;
        input +=" ";
        int[] numOrOpr = new int[input.length()+1];
            for(int i = 0; i < input.length(); i++) {
                if(input.charAt(i)=='+' || input.charAt(i)=='-' || input.charAt(i)=='*' || input.charAt(i)=='/') {numOrOpr[i]=2;
                operations += input.charAt(i);
                }
                else if (input.charAt(i)==' ')
                    numOrOpr[i]=0;
                else if (input.charAt(i)!=' ' && (input.charAt(i+1)=='+' || input.charAt(i+1)=='-' || input.charAt(i+1)=='*' || input.charAt(i+1)=='/' || input.charAt(i+1)==' '))
                    numOrOpr[i]=1;
        }
         for(int i = 0; i < input.length(); i++)
            proof += numOrOpr[i];
         if (proof != 4)
             throw new InputException("Input is incorrect");
         for(int i = 0; i < input.length(); i++) {
             if (input.charAt(i) != ' ')
                 inputWithoutSpace = inputWithoutSpace + input.charAt(i);
         }
         if (operations.equals("+"))
            words = inputWithoutSpace.split("\\+");
         else if (operations.equals("*"))
             words = inputWithoutSpace.split("\\*");
         else words = inputWithoutSpace.split(operations);
         if(words.length != 2)
            throw new InputException("Input is incorrect");
    }
    public String[] getWords() {
        return words;
    }
    public String getOparations() {
        return operations;
    }
}
