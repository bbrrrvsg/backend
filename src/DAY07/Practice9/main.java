package DAY07.Practice9;

public class main {
    public static void main(String[] args) {

        //1
        Book b1 = new Book("이것이 자바다","신용권",30000);
        b1.printBook();;
        Book b2 = new Book("자바의 정석","남궁성",28000);
        b2.printBook();;

        //2
        Rectangle rt = new Rectangle(10,5);
        int result1 = rt.getArea();
        System.out.println("사각형 넓이= " + result1);

        //3
        BookAccount ba = new BookAccount("111-222-3333","유재석",10000);
        ba.deposit(5000);
        ba.withdraw(3000);
        ba.printBalance();

        //4
        Goods goods1 =new Goods();
        goods1.printGoods();
        Goods goods2 =new Goods("콜라",2000);
        goods2.printGoods();

        //5
        Member member = new Member();
        System.out.println(member.isLogin);
        System.out.println(member.id);



    }
}
