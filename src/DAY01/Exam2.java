package DAY01;

public class Exam2 {

    public static void main(String[] args) {
        // 1.
        // 2.
        // 3.
        // 4.
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



        boolean bool1 = true;
        boolean bool2 = false;
        // boolean bool3 = 3; [오류] boolean은 3 저장 할 수 없다.

        System.out.println(bool1);
        System.out.println(bool2);

    }



}
