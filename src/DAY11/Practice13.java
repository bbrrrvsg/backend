package DAY11;

public class Practice13 {

    public static void main(String[] args) {
        //1
        Soundable cat = new cat();
        Soundable dog = new dog();
        cat.makesound();
        dog.makesound();

        //2
        System.out.println(RemoteControl.max);
        System.out.println(RemoteControl.min);

        //3
        Runnable runner = new person();
        runner.run();
        runner=new Car();
        runner.run();

        //4
        Attackable at = new Gun();
        Chracter a = new Chracter();

        a.useWeapon(at);
        at = new Sword();
        a.useWeapon(at);

        //5


    }


}

interface Soundable{
    void makesound();
}
class cat implements Soundable{
    @Override
    public void makesound() {
        System.out.println("야옹");
    }
}
class dog implements Soundable{
    @Override
    public void makesound() {
        System.out.println("멍멍");
    }
}

interface RemoteControl{
    public static final int max =10;
    public static final int min =0;
}

interface Runnable{
    void run();
}
class person implements Runnable{
    @Override
    public void run() {
        System.out.println("사람 런");
    }
}
class Car implements Runnable{
    @Override
    public void run() {
        System.out.println("자동차 런");
    }
}

interface Attackable{
    void attak();
}

class Gun implements Attackable{
    @Override
    public void attak() {
        System.out.println("총");
    }
}
class Sword implements Attackable{
    @Override
    public void attak() {
        System.out.println("검");
    }
}
class Chracter{
    void useWeapon(Attackable weapon){
        weapon.attak();
    }

}




