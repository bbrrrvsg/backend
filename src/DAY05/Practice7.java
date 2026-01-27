package DAY05;

import java.util.Scanner;

public class Practice7 {
    public static void main(String[] args) {
        //1
        Book book1 = new Book();
        book1.bookName = "이것이 자바다.";
        book1.price = 30000;
        book1.writer = "신용권";
        System.out.println("book1.bookName = " + book1.bookName);
        System.out.println("book1.writer = " + book1.writer);
        System.out.println("book1.price = " + book1.price);

        Book book2 = new Book();
        book2.writer = "남궁성";
        book2.price = 28000;
        book2.bookName = "자바의 정석";
        System.out.println("book2.bookName = " + book2.bookName);
        System.out.println("book2.price = " + book2.price);
        System.out.println("book2.writer = " + book2.writer);

        //2
        Pet pet1 = new Pet();
        pet1.age =3;
        pet1.name = "초코";
        pet1.breed = "푸들";
        System.out.printf("이름: %s , 종류 : %s , 나이 : %d\n",pet1.name,pet1.breed,pet1.age);

        Pet pet2 = new Pet();
        pet2.age =5;
        pet2.name = "나비";
        pet2.breed = "코리안숏헤어";
        System.out.printf("이름: %s , 종류 : %s , 나이 : %d \n",pet2.name,pet2.breed,pet2.age);

        //3
        Rectangle r1 = new Rectangle();
        r1.height= 5;
        r1.width = 10;
        int rr = r1.height*r1.width;
        System.out.println("사각형의 넓이 : "+rr);

        //4
        BankAccount bk = new BankAccount();

        bk.accountNumber="111-222-3333";
        bk.ownerName="유재석";
        bk.balance =10000;

        bk.balance+=5000;
        System.out.println("bk.balance = " + bk.balance);
        bk.balance-=3000;
        System.out.println("bk.balance = " + bk.balance);


        //5
        Product product1 = new Product();
        Product product2 = new Product();
        product1.name="새우깡";
        product1.price=1500;
        product2.name="콜라";
        product2.price=2000;
        if(product1.price<product2.price){
            System.out.println("product2.name = " + product2.name);
        }
        else{
            System.out.println("product1.name = " + product1.name);
        }

        //6
        Member m1 = new Member();

        m1.id="admin";
        m1.isLogin = false;

        System.out.println("로그인 전 상태 : "+m1.isLogin);
        m1.isLogin = true;
        System.out.println("로그인 후 상태 : "+m1.isLogin);


        //7
        Television tv = new Television();
        tv.channel = 7; tv.valume=20;
        tv.channel = 11; tv.valume-=2;
        System.out.println("tv = " + tv.valume);
        System.out.println("tv = " + tv.channel);

        //8

        // 객체(속성과기능 갖는 대상 - 추상 , 아직 컴퓨터 살재로 존재하기전)
        // 인스턴스( 클래스 기반르오 (메모리) 물리적 생성
        new Player();// -생성된 객체는 변수에 저장하지 않으면 일정시간이 지나면 gc가 삭제한다.
        Player p1 = new Player(); // new (인스턴스화 키워드 ,메모리 생성되면서 주소값 갖는다.)
        Player p2 = new Player();

        p1.name="손흥민"; p1.power=90; p1.speed=95;
        p2.name="이강인"; p1.power=85; p1.speed=92;
        int p1_sum = p1.power+p1.speed;
        int p2_sum = p2.power+p2.speed;
        if(p1_sum<p2_sum){
            System.out.printf("%s : %d : %d",p2.name,p2.speed,p2.power);
        }
        else{
            System.out.printf("%s : %d : %d",p1.name,p1.speed,p1.power);
        }

        //9
        MenuItem menu1 = new MenuItem();
        MenuItem menu2 = new MenuItem();
        MenuItem menu3 = new MenuItem();

        menu1.name="김치찌개"; menu1.price=8000; menu1.isSignature=true;
        menu2.name="된장찌개"; menu2.price=8000; menu2.isSignature=false;
        menu3.name="계란찜"; menu3.price=3000; menu3.isSignature=false;

        if(menu1.isSignature==true);
        System.out.println("menu1 = " + menu1.name);

        if(menu2.isSignature==true);
        System.out.println("menu2 = " + menu2.name);
        if(menu3.isSignature==true);
        System.out.println("menu3 = " + menu3.name);


        //10
        UserProfile up = new UserProfile();
        Scanner sc = new Scanner(System.in);

        String name = sc.next();
        int age = sc.nextInt();
        String mbti = sc.next();

        up.name = name; up.age=age; up.mbti=mbti;

        System.out.printf("%s %d %s ",up.name,up.age,up.mbti);








    } // m end
}
class Book{

    public String bookName;
    String writer;
    int price;
}
class Pet{
    String name;
    String breed;
    int age;
}