package Сalculator;
public class Arithmetic {
    private int answer;
    public Arithmetic(int[] operand, String operation) throws ArithmeticException {
       // System.out.println(1);
     if (operation.equals("+"))
         answer = operand[0] + operand[1];
     else if (operation.equals("-"))
         answer = operand[0] - operand[1];
     else if (operation.equals("*"))
            answer = operand[0] * operand[1];
     else if (operation.equals("/") && operand[0]%operand[1] == 0)
            answer = operand[0] / operand[1];
     else
         throw new ArithmeticException("Unknown operation or remainder division");
    }
    public int getAnswer() {
        return answer;
    }
}