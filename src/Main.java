import codekata.Multiply;
import codekata.Subtract;

public class Main extends Subtract {
    public static void main(String[] args) {
        Subtract subtract = new Subtract();
        Multiply multiply = new Multiply();

        subtract.solution(1,2);
        multiply.solution(3,4);
    }
}