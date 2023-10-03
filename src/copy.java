import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class copy {
    public static void main(String[] args) {
        int [] chis=new int [10];
        for (int i=0; i<chis.length;i++)
        {
            chis[i]=i+5;
        }
        System.out.println(Arrays.toString(chis));
        String user1="иванов иван ива";
        String user2="Иванов Иван Иваyнович";
        System.out.println(user1.equalsIgnoreCase(user2));
        if ((user1.equalsIgnoreCase(user2))==true)
        {
            System.out.println("выберите другое имя");
        }
        else
        {
            System.out.println("отличное имя");
        }

proverka(user1,user2);
    }

    public static void proverka (String am, String b) {
        System.out.println("длина вашего имаени "+am.length());
        String bezpr=am.replace(" ","");
        System.out.println("ваше имя без проюелов "+bezpr);
        System.out.println("длина имени без пробелов"+bezpr.length());
        String [] razdslov = am.split(" ");
        for (String slovo: razdslov)
        {
            System.out.println(slovo);
        }
        for (int i=0;i<(razdslov.length-1);i++)
        {
            for (int j=0;j<(razdslov.length-1);j++)
            {
                if (razdslov[j].length()>razdslov[j+1].length())
                {
                    String vrem= razdslov[j+1];
                    razdslov[j+1]=razdslov[j];
                    razdslov[j]=vrem;
                }
            }
        }
        for (String slovo: razdslov)
        {
            System.out.println(slovo);
        }
        for (int i=0;i<(razdslov.length);i++)
        {
            if (! Character.isUpperCase(razdslov[i].charAt(0)))
            {
                razdslov [i]= Character.toUpperCase(razdslov[i].charAt(0))+razdslov[i].substring(1);
            }
        }
        for (String slovo: razdslov)
        {
            System.out.println(slovo);
        }
    }

}


