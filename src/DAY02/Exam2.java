package DAY02;

import java.util.Scanner;

public class Exam2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        //1
//        System.out.print("국어 점수 :"); int 국 = sc.nextInt();
//        System.out.print("국어 점수 :"); int 수 = sc.nextInt();
//        System.out.print("국어 점수 :"); int 영 = sc.nextInt();
//
//        int sum = 국+영+수;
//        System.out.println("총점 = " + sum);
//        double ave = sum/3.0;
//
//        System.out.println("평균 = " + ave);
//
//        //2.
//        System.out.print("반지름");double ra = sc.nextDouble();
//        System.out.println("원의 넓이 :" + (ra*ra*3.14));


//        //3.
//        double d1 = sc.nextDouble();
//        double d2 = sc.nextDouble();
//        double ps = (d1/d2)*100;
//        System.out.println(ps+"%");



//        //4.
//        System.out.print("정수");int n2 = sc.nextInt();
//        System.out.println(n2%2==0 ? false : true);

//        //5.
//        System.out.print("정수");int n3 = sc.nextInt();
//        System.out.println(n3%7==0 ? true : false);

        //6.
//        System.out.print("id : ");String id =sc.nextLine();
//        System.out.print("pw : ");String pw =sc.nextLine();
//
//        boolean result = id.equals("admin") && pw.equals("1234");
//        System.out.println(result);

//        //7.
//        System.out.print("정수 : ");int n4 = sc.nextInt();
//
//        System.out.println(n4%2==1 && n4%7==0 ? true : false);
//      //8.
//
//        System.out.print("1차 점수 :"); int s1 = sc.nextInt();
//        System.out.print("2차 점수 :");int s2 = sc.nextInt();
//        int sum8 = s1+s2;
//        System.out.println(sum8 >=150 ? "합격" : "불합격");

//        //9.
//        System.out.print("이름 :");String name1 = sc.nextLine();
//        System.out.println(name1.equals("유재석") ? name1+"(방장)" : name1);
//
//        //10.
//        double bot = sc.nextDouble();
//        double hei = sc.nextDouble();
//
//        double re1 = bot*hei/2.0;
//        System.out.println(re1);
//
//        //11.
//        double 섭씨 = sc.nextDouble();
//
//        double 화씨 = (섭씨*9.0/5.0)+32;
//        System.out.println("화씨 : "+ 화씨);

//        //12.
//        int year = sc.nextInt();
//        int age1 = 2025-year;
//        System.out.println(age1);
//

        //13.
//        System.out.print("키");double cm = sc.nextDouble();
//        System.out.print("몸무게");double kg = sc.nextDouble();
//
//        double bmi = kg/(cm/100.0*cm/100.0);
//
//        System.out.println("bmi 지수 : "+bmi);

//        //14.
//        System.out.print("id");String id1 = sc.next();
//        System.out.print("email");String em1 = sc.next();
//
//        System.out.println(id1.equals("admin")||em1.equals("admin@test.com") ? "관리자" : "일반사용자");

        //15.
        System.out.print("점수 : ");int s15 = sc.nextInt();

        System.out.println(s15 >=90 ? 'A' : s15 >=80 ? 'B' : 'C');


        //16.
        System.out.println("나이를 입력하세요 : "); int age = sc.nextInt();
        System.out.println(age == 20 && age == 29 ? "이벤트대상입ㄴ다" : "이벤트 대상이 아닙니다.");




    }
}
