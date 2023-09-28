import java.util.Scanner;

import java.util.Scanner;
public class Cyracuse {
    public static void main(String[] args) {
        System.out.println( "vvedite chislo");
        Scanner scanner= new Scanner(System.in);
        int operand1 = scanner.nextInt();
        siracus(operand1);


    }

    public static void siracus (int number) {
        System.out.print(number + " ");
        String stroka=number + "";
        while (number > 1) {
            if (number % 2 == 0) {

                number = number / 2;
                System.out.print(number+" ");

            } else {

                number = 3 * number + 1;
                System.out.print(number+" ");
            }
           stroka = stroka +" "+ number;
        }
        System.out.println();
        System.out.println(stroka);
    }


}
