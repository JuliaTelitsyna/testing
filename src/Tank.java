public class Tank {
    int PositionX;
    int PositionY;
    int dir;
    int fuel;


    public Tank(int PositionX, int PositionY, int fuel) {
        this.PositionX =PositionX;
        this.PositionY=PositionY;
        this.fuel=fuel;
        dir=1;
    }
    public Tank(int PositionX, int PositionY) {
        this(PositionX,PositionY,100);
    }
    public Tank() {
        this(0,0,100);
    }

    void goForward (int a)
            //
{
    if (fuel>=Math.abs(a)) {
        switch (dir) { //
            case 0:
                PositionY = PositionY - a;
                fuel=fuel-Math.abs(a);
                break;
            case 1:
                PositionX = PositionX + a;
                fuel=fuel-Math.abs(a);
                break;
            case 2:
                PositionY = PositionY + a;
                fuel=fuel-Math.abs(a);
                break;
            case 3:
                PositionX = PositionX - a;
                fuel=fuel-Math.abs(a);
                break;
        }
    }
    else {
        switch (dir) {
            case 0:
                PositionY = PositionY - fuel;
                fuel=0;
                break;
            case 1:
                PositionX = PositionX + fuel;
                fuel=0;
                break;
            case 2:
                PositionY = PositionY + fuel;
                fuel=0;
                break;
            case 3:
                PositionX = PositionX - fuel;
                fuel=0;
                break;
        }
        System.out.println("топливо ghghghgggggggggggзакончилось");
    }

}
    void turnLeft ()
    {
        dir=dir-1;
        if (dir==-1)
        {dir=3;}
    }
    void turnRight ()
    {
        dir=dir+1;
        if (dir==4)
        {dir=0;}
    }
    void goBackward (int a)
    {goForward(-a);



    }
    void printPosition ()
    {
        System.out.println("The tank is at "+ PositionX + " ,"+ PositionY+" now, fuel"+ fuel);
    }

    public static void main(String[] args) {
        Tank tank = new Tank();
        tank.goForward(10);
        tank.printPosition();
        tank.turnRight();
        tank.goForward(50);
        tank.printPosition();
        tank.turnLeft();
        tank.goBackward(100);
        tank.printPosition();

        System.out.println("The code for this exercise is КОД ИЗ БОЛЬШИХ АНГЛИЙСКИХ БУКВ");
    }


}



