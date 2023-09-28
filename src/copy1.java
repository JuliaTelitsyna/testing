public class copy1 {
    public static void main(String[] args) {
        String str="sometimes";
        System.out.println( str.charAt(2));
        String name1="иван иванов ";
        String name2="Иван иоанов";
        boolean b= name1.equalsIgnoreCase(name2);
        if  (b==true)
        {
            System.out.println("выберите другое имя");
        }
        else
        {
            System.out.println("отличное имя");
        }
proverka( name1,name2);
        String [] name3=name1.split(" ");
        if (name3.length==3)
        {
            System.out.println("три слоава");
        }
        else
        {
            System.out.println(name3.length+ " слова");
        }
    }

    public static void proverka(String a,String b) {
        boolean c= a.equalsIgnoreCase(b);
        if  (c==true)
        {
            System.out.println("выберите другое имя");
        }
        else
        {
            System.out.println("отличное имя его длина"+ b.length());
            b=b.replaceAll(" ","");
            System.out.println(b);
            System.out.println(" а без проблелов длина "+ b.length());

        }


    }
}
