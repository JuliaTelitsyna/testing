import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double operand1 = scanner.nextInt();
        char operation = scanner.next().charAt(0);
        double operand2 = scanner.nextInt();
  //      Scanner scanner2 = new Scanner(System.in);
    //    int operand2 = scanner2.nextInt();
        System.out.println(operand1);
        System.out.println(operation);
        System.out.println(operand2);
        double result=0.0d;
        switch (operation){
            case '+': result=operand2+operand1; System.out.println(result);break;
            case '-': result=operand1-operand2; System.out.println(result);break;
            case '*': result=operand2*operand1; System.out.println(result);break;
            case '/': result=operand1/operand2; System.out.println(result);break;



            default: System.out.println("net takoy operacii");
        }
    }
}
