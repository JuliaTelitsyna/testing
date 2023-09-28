import java.util.Random;
import java.util.Scanner;

public class igra {


        public static <chis> void main(String[] args) {

            //Создаем экземпляр класса Random()
            Random rand = new Random();

            //Создаем переменную типа int
            int randInt;

            //Сохраняем случайное число в переменной randInt;
            randInt = rand.nextInt(10) + 1;
            System.out.println(randInt);
            Scanner scanner = new Scanner(System.in);
            boolean usl=false;
            do {
                int chis = scanner.nextInt();
                if (chis < randInt) {
                    System.out.println(" u vas menshe");
                } else if (chis > randInt) {
                    System.out.println(" u vas bolshe");
                } else {
                    System.out.println("угадал");
                    usl=true;
                }
            }
            while (usl==false);
        }
    }

