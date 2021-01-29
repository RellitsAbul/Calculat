package Сalculator;
public class Main {
    public static void main(String[] args) {
        Input input = null;
        try {
            input = new Input();
        } catch (InputException e) {
            e.printStackTrace();
        }
        String[] words = input.getWords();
        String operations = input.getOparations();
        Translator trans = null;
        try {
            trans = new Translator(words);
        } catch (InputException e) {
            e.printStackTrace();
        }
        int[] operand = trans.getOperand();
        Arithmetic answer = null;
        try {
            answer = new Arithmetic(operand, operations);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        if( trans.getArabicOrRome() == 4  )
            System.out.println(answer.getAnswer());
        else if(trans.getArabicOrRome() == 6 && answer.getAnswer() != 0){
            System.out.println(trans.TransToRome(answer.getAnswer()));
        }
        else
            System.out.println(0);
    }
}