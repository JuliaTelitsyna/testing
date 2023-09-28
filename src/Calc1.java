import java.util.Scanner;

public class Calc1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double operand1 = scanner.nextInt();
        char operation = scanner.next().charAt(0);
        double operand2 = scanner.nextInt();


       // System.out.println(operand1);
      //  System.out.println(operation);
       // System.out.println(operand2);
       double result=0.0d;
        switch (operation){
            case '+': result=plus(operand1,operand2);break;
            case '-': result=minus(operand1,operand2);break;
            case '*': result=umn(operand1,operand2);break;
            case '/': result=delen(operand1,operand2);break;



            default: System.out.println("net takoy operacii");
        }
        System.out.println(result);



    }

    public static double plus (double a, double b) {
       double res= a+b;
       return res;

    }
    public static double minus (double a, double b) {
        double res= a-b;
        return res;

    }
    public static double umn (double a, double b) {
        double res= a*b;
        return res;

    }
    public static double delen (double a, double b) {
        double res= a/b;
        return res;



    }
}
