import java.util.Arrays;

public class Massiv1 {
    public static void main(String[] args) {
        int [] array= new int [11];
        for (int i=0; i< array.length;i++)
        {
            array[i]=5+i;
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Sometimes".charAt(2));
        String user1="иванеско Иванов петро трутень";
        String user2="ивана Иванов";
        System.out.println(user1.equalsIgnoreCase(user2));
        if (user1.equalsIgnoreCase(user2)) {
            System.out.println( "выберите другое имя");
        }
        else {
            System.out.println("отличное имя");}
        proverka(user1,user2);
    }

    public static void proverka(String a, String b) {
        if (a.equalsIgnoreCase(b)) {
            System.out.println("выберите другое имя");
        } else {
            System.out.println("отличное имя");
            System.out.println("дляна вашего имени " + a.length());

            String ce = a.replace(" ", "");
            System.out.println(" а без проблелов длина" + ce.length());
            String[] razdslov = a.split(" ");
            for (String slovo : razdslov) {
                System.out.println(slovo);
            }
            int dl = razdslov.length - 1;
            for (int dr = 0; dr < dl; dr++) {
                for (int drt = 0; drt < dl; drt++) {
                    if (razdslov[drt].length() > razdslov[drt + 1].length()) {
                        String vr = razdslov[drt];
                        razdslov[drt] = razdslov[drt + 1];
                        razdslov[drt + 1] = vr;

                    }
                }
            }
            for (String slovo : razdslov) {
                System.out.println(slovo);
            }
            for (int qw = 0; qw < razdslov.length ; qw++)
            {char firstChar = razdslov[qw].charAt(0);
                if (! Character.isUpperCase(firstChar))
                { razdslov [qw]= Character.toUpperCase(firstChar)+ razdslov [qw].substring(1);

                }

            }
                for (String slovo : razdslov) {
                    System.out.println(slovo);
                }


        }
    }
}
