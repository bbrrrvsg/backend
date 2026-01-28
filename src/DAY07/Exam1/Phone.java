package DAY07.Exam1;

import javax.swing.*;

public class Phone {

    //1. 멤버변수 -> 속성
    String model;
    String color;
    int price;
    //2. 생성자
    Phone(){} // 1. 클래스명과 동일하게 작성한다.

    Phone(String model , String color){
        this.model=model;
        this.color=color;
    }
    // 2. ( ) 안에 매개 변수 정의 한다.
    // 3. 반환 타입 없다.
    //3. 멤버함수 -> 메소드

    Phone(String model , String color , int price){
        this.model=model;
        this.color=color;
        this.price=price;
    }

    Phone(String a, String b , String c){

    }
//    Phone(String a, String b , String c){
//
//    }
    Phone(int a, String b , String c){

    }
    Phone(String c , int a , String b ){

    }
    // int 위치 에 따라 여러개 정의가능 하다. 즉 순서 를 다르개 -> 매개변수명은 해당 안됨
}
