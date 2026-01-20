package DAY01;

public class Exam2 {
    // public class : 공개용 클래스 선언 뜻 갖는 키워드
    // Exam2 : 임의의 클래스명 정의한다. 첫글자 대문자!
    // [1] m + 엔터 : main함수
    // 자바에서 최초의 실행 흐름(스레드)를 갖는 (미리만들어진)함수

    public static void main(String[] args) {


        // [2] 리터럴 : 상수 이면서 키보드로 입력가능한 자료들
        // 3 , 3.14 , 'a' , true , false
        System.out.println( 3 );         // JS의 console.log() 동일한 기능의 함수
        System.out.println( 3.14 );      // sout + 엔터 : System.out.println( 출력자료 );
        System.out.println( "유" );      // 선언 또는 함수실행 뒤에 ;세미콜론 작성한다.
        System.out.println( "유재석" );   // 문자열 처리할때는 "큰따옴표 사용









        // [3] 자료형/타입(분류) : 자료들을 *효율*적으로 사용하기 위한 분류 방법
        // 효율이란? 내가 시계 선물하기 위해서 다이소에서 시계 크기 맞는 적당(효율)한 상자를 고른다.
        // 바이트란? bit(0 혹은 1) ---> 01010101(8bit/bit 8개)1바이트 -> 1024byte
        // 정수 : byte(1 , -128 ~ 127 )           , short( 2 , +-3만정도 ) ,
        //        int( 4 , +-21억정도 , *정수기본* ) , long(8 , +-21억이상 )
        // 실수 : float( 4 , 소수점8자리 표현 ) , double( 8, 소수점17자리 표현 , *실수기본*)
        // 문자 : char( 2 , ''작은따옴표 감싼 ) , 문자열 : String( 문자열클래스 , " " 큰따옴표 감싼 )
        // 논리 : boolean( 1 , true/false )
        // ========================> 8가지  + String











        // 1. boolean : true 또는 false 저장하는 타입
        boolean bool1 = true; //[JAVA] 자료형 변수명 = 값;  [JS] let bool1 = true;
        boolean bool2 = false; // 변수명은 카멜표기법 권장, 숫자시작/일부특수/띄어쓰기 안됨
        //boolean bool3 = 3 ; // [오류] boolean은 3 저장 할 수 없다.
        System.out.println( bool1 );
        System.out.println( bool2 );



        // 2. char : ''작은따옴표로 감싼 문자 1개 저장하는 타입
        char ch1 = 'A';
        // char ch2 = 'ABC'; // [오류] 문자 여러개 저장 불가능
        // char ch3 = "ABC"; // [오류] " " 저장 불가능.
        System.out.println( ch1 );



        // 3. String : " " 큰따옴표로 감싼 문자 여러개 저장하는 (클래스)타입
        String str1 = "ABC";
        System.out.println( str1 );



        // 4. byte : -128 ~ +127
        byte b1 = 100;       System.out.println( b1 );
        // byte b2 = 300; // [오류]



        // 5. short : +- 3만 정도
        short sl = 32000;
        System.out.println(sl);
        // short sl = 40000 에러
        // Java는 연산하면 무조건 int로 승격
        // short c = a + b; ❌ 에러



        // 6. int : -+21억정도 , 정수의 리터럴 기본타입 , 즉] 키보드로부터 입력받은 값들은 int타입이다.
        int il = 2100000000;
        //int il = 30000000000; [오류]


        // 7. long : +- 21억 이상 , 리터럴 뒤에 L/l 붙인다.
        long li = 3000000000L;
        System.out.println("li = " + li);


        // 8. double : 소수점 포함한 17자리 까지 표현 , 실수의 리터럴 기본타입
        double dl = 0.123456789123456789;
        System.out.println(dl);


        // 9. float : 소수점 포함한 8자리 까지 표현 , 리터럴 뒤에 F/f 붙인다.
        float fl = 0.123456789123456789F;
        System.out.println(fl);



        boolean bool12 = true;
        boolean bool21 = false;
        // boolean bool3 = 3; [오류] boolean은 3 저장 할 수 없다.

        System.out.println(bool12);
        System.out.println(bool21);

    }



}
