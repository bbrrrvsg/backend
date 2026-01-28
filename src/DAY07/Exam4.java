package DAY07;

public class Exam4 {
    void 멤버메소드() {
    } // 1) 멤버함수

    static void 정적메소드() {
    } //2) 정적메소드

    public static void main(String[] args) {
        //[1] final , 고정
        //[2[ 사용법 :  final 타입 변수명 = 초기값
        // -> final 변수는 초기값이 무조건 필수이다. <수정 못하기 때문 >


        //클래스명.정적(static)변수
        System.out.println(D.point); // ok
        System.out.println(D.name); // ok

        // 객체변수명.고정(final)변수 : 객체 필요함
        D d = new D();
        System.out.println(d.PI);

        //
        // D.method1(); error
        d.method1(); // ok

        D.method2(); // ok




        //[3] static , 정적인
        //[2] 사용법 : static 다입 변수명 , static void 메소드명(){}
        //-> static 변수/메소드는 프로그램 실행시 우선(메모리)할당 되고 프로그램 종료시 까지 유지
        //-> 메모리 할당된 변수/메소드 이므로 객체가 필요없다. <과도한 사용은 좋지 않다>
        //-> 프로그램내 공유 변수, 공유 메소드에 대해서 사용 , 즉) 프로그램내 1개만 존재해야하는 변수/메소드
        //-> static 갖는 메소드는 실행문에서 일반메소드 호출이 불가능하다. <객체 필요>


        // 멤버메소드(); //error // static 갖는 변수/메소드(main)는 우선할당이므로 객체가 아닌 멤멤버메소드 모른다
        Exam4 exam4 = new Exam4(); // 객체 만들어서 멤버메소드 호출하자
        exam4.멤버메소드();
        정적메소드(); // main메소드가 static 갖고 정적메소드도 static갖기 때문에 서로 알고 있는 상태 (객체 필요 없음)

    }
}

class D{
    //final 키워드 는 초기값 필수
    final double PI = 3.14159;

    //static 키워드는 공유변수 (객체들간)
    static int point ;

    // 상수
    public static final char name = 'A';

    // final 메소드 : 오버라이딩/재정의 금지
    public final void method1(){}
    // static 메소드 : 객체 유무없이 호출 가능한 메서드
    public static void method2(){}

}
