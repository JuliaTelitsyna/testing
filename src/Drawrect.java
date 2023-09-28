import java.util.Scanner;

public class Drawrect {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int dlina = scanner.nextInt();
        int shir= scanner.nextInt();
        char simvol = scanner.next().charAt(0);
        for (int i=1; i<=dlina;i++)
        {
            System.out.print(simvol);
        }
        System.out.println();
        for (int i=2;i<shir;i++)
        {
            System.out.print(simvol);
            for (int j=2; j<dlina;j++)
            {
                System.out.print(" ");
            }
            System.out.println(simvol);

        }
        for (int i=1; i<=dlina;i++)
        {
            System.out.print(simvol);
        }

    }

}
