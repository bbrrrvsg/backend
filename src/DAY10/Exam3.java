package DAY10;

public class Exam3 {
    public static void main(String[] args) {
        //[1]구현체
        Buy buy =new Customer();
        buy.method1();// 추상메소드 호출 가능
        // buy.method6();// 불가능
        // Sell sell = buy; // 불가능

        Customer customer = (Customer)buy;
        Sell sell = customer;
        sell.method6();

        //[2] 디폴트 메소드 실행 가능
        buy.method2(2);

        //[3] static(정적)메소드 실행 가능
        Buy.method3();

        //[4] private 메소드 호출 불가능
        // Buy.method4();
        // Buy.method5();
    }
}

interface Buy{
    //*. 상수
    //1. 추상메소드 : 선언부만 있고 구현부가 없는 메소드 , 구현할 대상
    public abstract void method1();
    //2. 디폴트 메소드 : 인터페이스가 구현한 메소드
    public default int method2(int x){return x;};
    //3. 정적메소드 : 인터페이스내 정적 구현 메소드
    public static void method3(){
        System.out.println("정적 구현 메소드 ");
    }
    //4. private 메소드 : 현제 인터페이스내에서 사용하느 메소드( 오버라이딩 안됨 )
    private void method4(){}
    private static void method5(){}
} // inter end

interface Sell{
    void method6();
} // inter end

class Customer extends Object implements Buy,Sell{ // 상속은 1개의 클래스 , 구현은 여러번
    // extends 은 오버라이딩 선택 , implements 는 필수


    @Override
    public void method1() {
        System.out.println("판매");
    }

    @Override
    public void method6() {
        System.out.println("구메");
    }
}