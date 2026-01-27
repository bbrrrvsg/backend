package DAY06;

public class Calculater {

    //1] 속성 = 멤버변수

    //2[ 기능 = 메소드 = 멤버함수

        //(1)매개변수 x 반환값 o
    double getPi(){

        // double : 리턴값의 타입
        // getPI : 메소드명 아무거나 ( 카멜 표기법 권장)
        return 3.141592; // double 타입
    }
        //(2) 매개변수 x 반환값 x  = void
    void powerOn(){
        System.out.println("전원을 켭니다.");
        return; // 생략 가능
    }
        //(3) 매개변수 o 반환값 x
    void printSum(int x , int y ){
        System.out.println("x = " + x + ", y = " + y);
        System.out.println(x+y);
    }

        //(4) 매개변수 o 반환값 o
    int add(int x , int y ){
        System.out.println("더하기");
        return x+y;
    }

        //*) 동일한 클래스내 메소드 호출
    void print(){
        printSum(10,2);
    }

}// c end
