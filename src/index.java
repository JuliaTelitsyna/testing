import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        System.out.println("massa kg");
        Scanner scanner = new Scanner(System.in);
        double massa = scanner.nextInt();
        System.out.println("rost m");
        double rost ;
        rost= scanner.nextDouble();
        double ind=massa/(rost*rost);
        System.out.println("индекс = "+ind);
        if(ind<18.5){
            System.out.println("distrof");
        } else if (ind>=18.5 && ind<25) {
            System.out.println("норма");

        }
        else {
            System.out.println("жирный");
        }
    }
}
