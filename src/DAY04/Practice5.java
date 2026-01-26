package DAY04;

import java.util.Scanner;

public class Practice5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


//        //1
//        for(int i =1; i<=10; i++){
//            System.out.println(i);
//        }
//
//        //2
//        for(int i=10; i>=1; i--){
//            System.out.println(i);
//        }
//
//        //3
//        int sum =0;
//        for(int i=1; i<=50; i++){
//            sum+=i;
//        }
//        System.out.println(sum);
//
//        //4
//        for(int i=1; i<=20; i++){
//            if(i%2==0){
//                System.out.println(i);
//            }
//        }
//
//        //5
//        for(int i=1; i<=30; i++){
//            if(i%3==0){
//                continue;
//            }
//
//            System.out.println(i);
//        }

//        //6
//        int sum1 = 0;
//        int num1=1;
//        for (;;) {  // for(num1=1; num++) 이렇게 써도 무한
//            sum1 += num1;
//            if (sum1 > 100) {
//                break;
//            }
//            num1++;
//        }
//        System.out.printf("%d까지 더했을 떄 합계가 %d로 100을 넘습니다.",num1,sum1);

//
//        //7
//        for(int i=0; i<5;i++){
//            for(int j=0; j<i+1; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//        //8
//        for(int i=0; i<5; i++){
//            for(int j = 0; j<5-i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//
        //9
//        int count =0;
//        while(true){
//            String pm = sc.next();
//            count++;
//            System.out.printf("%d회 입력: %s\n",count,pm);
//            if(pm.equals("end")){
//                break;
//            }
//
//        }
//        System.out.printf("[안내]프로그램을 종료 합니다.[총 %d회 입력]\n",count-1);

        //10
//        int july1 = 3532100;
//        int july2 = 9123700;
//        int july3 = 5183400;
//        int july4 = 11738700;
//
//        System.out.println("------7월 매출액------");
//        System.out.print("1주차 : ");
//        int won = july1/10000;
//        int m = won/100;
//        for(int i=1; i<=m; i++){
//            System.out.print("■");
//        }
//        System.out.printf("%d만원\n",won);
//
//        System.out.print("2주차 : ");
//        won = july2/10000;
//        m = won/100;
//        for(int i=1; i<=m; i++){
//            System.out.print("■");
//        }
//        System.out.printf("%d만원\n",won);
//
//
//        System.out.print("3주차 : ");
//        won = july3/10000;
//        m = won/100;
//        for(int i=1; i<=m; i++){
//            System.out.print("■");
//        }
//        System.out.printf("%d만원\n",won);
//
//
//
//        System.out.print("4주차 : ");
//        won = july4/10000;
//        m = won/100;
//        for(int i=1; i<=m; i++){
//            System.out.print("■");
//        }
//        System.out.printf("%d만원\n",won);
//
        //11
//        int menu;
//        int bank = 0;
//        int money;
//        while(true){
//            System.out.println("-----------------------------------------");
//            System.out.println("1:입금|2:출금|3.잔고|4.종료");
//            System.out.println("-----------------------------------------");
//            System.out.printf("선택>"); menu=sc.nextInt();
//            switch (menu){
//                case 1:
//                    System.out.printf("입금액>"); bank+=sc.nextInt();
//                    break;
//                case 2:
//                    System.out.printf("출금액>");
//                    money=sc.nextInt();
//                    if(bank<money){
//                        System.out.println("no money");
//                    }
//                    else {
//                        bank-=money;
//                    }
//                    break;
//                case 3:
//                    System.out.printf("잔고>"); System.out.println(bank);
//                    break;
//                case 4:
//                    System.out.println("프로그램을 종료합니다.");
//                    return;
//                default:
//                    System.out.println("1~4번 입력해라");
//                    break;
//            }
//
//
//        }



    } //m end
}// c end
