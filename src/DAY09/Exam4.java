package DAY09;

public class Exam4 {
    public static void main(String[] args) {
        //(1) Car 객체생성
        Car myCar = new Car(); //2 ro
        // myCar.run(); //오류 멤버변수 tire가 null
        myCar.tire = new Tire();//3
        myCar.run(); // null이 아니기 때문에 타이어1회전

        //(2) 타이어 교체
        myCar.tire = new HanKookTire();
        myCar.run(); // 한국타이어가 업그레이드

        myCar.tire = new KumhoTire();
        myCar.run(); // 금호타이어가 업그레이드

        System.out.println(myCar.tire instanceof Tire); // true
        System.out.println(myCar.tire instanceof KumhoTire); // true
        System.out.println(myCar.tire instanceof HanKookTire); // false



    }
}

class Car{
    Tire tire;
    void run(){
        this.tire.roll();
    }
}

class Tire{
    void roll(){
        System.out.println("타이어1 회전");
    }
}

class HanKookTire extends Tire{
    void roll(){ // 오버라이딩
        System.out.println("한국 타이어가 최전 업그레이드");
    }
}

class KumhoTire extends Tire{
    void roll(){ // 오버라이딩
        System.out.println("금호 타이어가 회전 업그레이드");
    }
}