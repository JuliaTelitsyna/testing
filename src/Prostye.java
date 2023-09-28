public class Prostye {
    public static void main(String[] args) {
        boolean estdel=false;
        for (int i=1;i<=40; i++)
        {
        //    System.out.println("i="+i);
        for (int j=2; j<i; j++)
          {
            //  System.out.println("j="+j);
              if (i%j==0) { estdel=true; break;}
             // System.out.println(estdel);
           }
        if (estdel==false) {
            System.out.println(i);
        }
        else { estdel=false;}

        }
    }
}
