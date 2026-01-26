package DAY02;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //1
        byte a = 10; int b = 200;
        long sum1 = a+b;
        System.out.println(sum1);

        //2
        double d1 = 3.141592;
        int i1 = (int)d1;
        System.out.println(i1);

        //3
        System.out.print("실수 입력 : ");
        double h1 = sc.nextDouble();
        int i2 = (int)h1;
        System.out.println(i2);

        //4
        System.out.print("정수 입력 : ");
        int n1 = sc.nextInt();
        System.out.print("정수 입력 : ");
        int n2 = sc.nextInt();
        System.out.print("정수 입력 : ");
        int n3 = sc.nextInt();

        double sum = (n1+n2+n3)/3.0; // 연산은 가장 큰 타입을 따라간다 3.0 = double
        System.out.println(sum);

        // soutv = 자동으로 가장 가까운 변수 출력 함수
    }
}
