package DAY06.Practice8;

import java.util.Scanner;

public class Practice8 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //1
//        Printer pr = new Printer();
//
//        pr.printMessage();
//
//        //2
//        Greeter gt = new Greeter();
//        gt.greet("유재석");
//
//        //3
//        SimpleCalculator sc = new SimpleCalculator();
//        int add = sc.add(10 , 10);
//        System.out.println(add);
//
//        //4
//        Checker ch = new Checker();
//        int num = scan.nextInt();
//        if(ch.isEven(num)==true){
//            System.out.println("짝수입니다.");
//        }
//        else{
//            System.out.println("홀수입니다.");
//        }
//
//        //5
//        Lamp lp = new Lamp();
//        lp.turnOn();
//        lp.printIs();
//        lp.turnOff();
//        lp.printIs();
//        lp.turnOn();
//        lp.printIs();
//
//        //6
//        Product pd = new Product();
//        pd.stock = 10;
//        int 구매수량 = scan.nextInt();
//        pd.sell(구매수량);


        //7
        Visuallizer vs = new Visuallizer();
        String star = vs.getStars(5);
        System.out.println(star);


        //8
        ParkingLot pk = new ParkingLot();
        int result = pk.calculateorFee(65);
        System.out.println(result);

    }
}
