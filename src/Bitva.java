public class Bitva {
    public static void main(String[] args) {
        System.out.println("ЗДРАСЧЬТЕ");
        Chel odin= new Chel ();
        System.out.println(odin.health);
        Chel dva= new Chel ();
        dva.health=80;
        dva.udar=15;
        System.out.println(dva.health);
        System.out.println(dva.udar);
        while ((odin.health>0)&& (dva.health>0))
        {dva.health=dva.health-odin.udar;
                odin.health=odin.health-dva.udar;
            System.out.println(odin.health+"  "+ dva.health);


        }
       if (odin.health<=0) {
            if (dva.health <= 0) {
                System.out.println("оба убиты");
            } else {
                System.out.println("первый убит");
            }
        }
        else {
            System.out.println("второй убит");

        }

    }
}
class Chel{
    int health=100;
    int udar = 10;
    boolean isAlive = true;
}

