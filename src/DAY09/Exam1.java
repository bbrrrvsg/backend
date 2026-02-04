package DAY09;

public class Exam1 {
    public static void main(String[] args) {

        // [1] 상속 : A클래스로 부터 B클래스에게 (멤버변수/메소드)물려주는 행위
        // [2] 목적 : 빠른클래스설계 , 한번 만들어둔 클래스를 재사용/활용한다.
        // [3] 키워드 : extends(확장 , 뻗다 뜻)
        // [4] 장점 : 유지보수 , 계층관계표현 , 재사용 , *다형성*
        동물 a1 = new 동물();
        a1.name = "강아지";
        a1.show();

        조류 b1 = new 조류();
        b1.name ="비둘기"; // 조류클래스 에는 없지만 물려받음
        b1.show(); // 메소드도 가능

        참새 s1 = new 참새();
        s1.name="참새1";
        s1.show();

        닭 k1 = new 닭();
        k1.name ="닭1";
        k1.show();

        //[5] 주의할점
        // 1. 상속은 무조건 하나의 클래스로부터 상속받는다.
        // 2. 하위클래스가 상위클래스를 선택 구조

        //[6] 다형성 : 다(양한) 형(태/모양) 성(질)
        //* 본질은 그대로이다.
        // (1) 참새가 조류로 타입 변환
        조류 bird2 = s1; // 자동타입변환 , 업캐스팅 , 묵시적타입변환
        // (2) 조류(참새) 가 동물로 타입변환
        동물 animal1 = bird2;
        animal1.show(); // 참새1 : 객체 본질은 그대로 유지
        // (3) 동물(참새) 가 참새로 타입 변환
        참새 sparrow3 = (참새)animal1; // 강제타입변환 , 다운캐스팅 , 명시적타입변환(부모는 자식을 모른다)
        sparrow3.show();
        System.out.println(sparrow3);
        // (4) 동물이 닭으로 타입변환
        닭 chiken = (닭)a1; // 태생이 동물이므로 조류 또는 닭/참새로 타입변환 불가능
        chiken.show(); // 오류발생

        // 참새 객체 -> 조류 -> 동물 , 동물 -> 조류 -> 참새
        // 조류 객체 -> 동물 , 동물 -> 조류
        // 형제 관계도 타입변환 불가능

        //[7] 상속활용처 : 1. 웹/앱 라이브러리 2.클래스설계(개발 경험 필요)



    } //main end
}// class end

class 동물{
    String name;
    void show(){
        System.out.println("동물.show");
        System.out.println(name);
    }
}

class 조류 extends 동물{
    // 조류 클래스는 동물 클래스로부터 상속 받는다.
}

class 참새 extends 조류{}
class 닭 extends 조류{}
/*
*       가계도/상속 구조
*           동물
*       조류      포유류
*      참새 닭   고래  박쥐
* */