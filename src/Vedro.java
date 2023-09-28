public class Vedro {
    public static void main(String[] args) {
        int v1=30;
        int v2=0;
        for (;v1>0;) {
            v1=v1-1;
            if ((v1+1)%10>0) {

            v2=v2+1;
            }
            System.out.println("pervoe"+v1+"    vtoroe " + v2);
        }
    }
}
