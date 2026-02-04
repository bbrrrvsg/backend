package DAY09;

public class Practice12 {
    public static void main(String[] args) {

        //1
        Student s1 = new Student();
        System.out.println(s1.name);
        System.out.println(s1.studentId);

        //2
        Cat cat = new Cat();
        cat.makeSound();

        //3
        Computer c1 = new Computer(); // 부모 생성자 먼저 실행 됨

        //4
        Triangle t = new Triangle();
        Figure f = t; // 상속관계이고 피규어가 상위클래스 이기때문에

        //5
        Shape shape = new Circle();
        shape.draw(); // 자식객체를 부모타입에 넣었지만 오버라이딩 우선 실행하기 때문에 자식 메소드 실행 
        
        //6 
        Vehicle vehicle =new Bus();
        
        boolean result = vehicle instanceof Bus;
        System.out.println("result = " + result);

        if(result){
            Bus bus = (Bus)vehicle;
            bus.checkFare();
        }


        //7
        Beverage[] b = new Beverage[2];

        for(int i=0; i<b.length; i++){
            b[i] = new
        }


















    }
}
class Person{
    String name ="홍길동";


}
class Student extends Person{
    int studentId = 1;
}
class Animal{
    void makeSound(){
        System.out.println("동물이 소리를 냅니다");
    }
}
class Cat{
    void makeSound(){
        System.out.println("고양이가 야옹하고 웁니다");
    }
}
class Machine{
    Machine(){
        System.out.println("부모클래스 생성자 실행");
    }
}
class Computer extends Machine{
    Computer(){
        System.out.println("자식클래스 생성자 실행");
    }
}

class Figure{

}
class Triangle extends Figure{

}

class Shape{
    void draw(){
        System.out.println("도형을 그림");
    }
}

class Circle extends Shape{
    void draw(){
        System.out.println("원을 그림");
    }
}
class Vehicle{}
class Bus extends Vehicle{
    void checkFare(){
        System.out.println("요금을 확인합니다.");
    }
}

class Beverage{
    void drink(){
        System.out.println("음료");
    }
}
class coke extends Beverage{
    void drink(){
        System.out.println("콜라를 마십니다");
    }
}
class coffee extends Beverage{
    void drink(){
        System.out.println("커피를 마십니다");
    }
}