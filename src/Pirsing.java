import java.util.Scanner;

public class Pirsing {
    public static void main(String[] args) {
        System.out.println("ыыедите ваш возраст");
        Scanner voz= new Scanner(System.in);
 int vozr= voz.nextInt();
 if (vozr < 14) {
     System.out.println( "s rodytelyami");
 }
 else if (vozr<18){
     System.out.println("pupok s rodytel");
 }
 else {
     System.out.println("bez ogran");
 }
    }
}
