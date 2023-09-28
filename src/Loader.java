public class Loader {
    public static void main(String[] args) {
   // char ch1 = 'h';
    //char ch2 = 'i';
    //char ch3 = 'b';

    //System.out.println(decode(ch1) + " " + decode(ch2) + " " + decode(ch3));
        int variable = 7;
        if (variable > 10) {
            variable = variable - 10;
        } else {
            variable = variable + 10;
        }
        System.out.println(variable);
        if (variable > 10) {
            System.out.println("hren");
        } else {
            System.out.println("redka");
        }
        int i = 10;

        do {i=i-1;
            System.out.println("i="+i);}
        while (i>0);

        }


    }

  /*  public static String decode(char ch) {
        String result = "";
    switch (ch){
            case 'h':
                result = " eto h"; break;
            case 'i':
                result = " eto i";  break;
            case 'b':
                result = " eto b"; break;
        }
        return result;

        //Писать код здесь
    }
}
*/