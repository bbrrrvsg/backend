package DAY02;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*[문제 1] Scanner를 이용해 국어, 영어, 수학 점수를 각각 정수(int)로 입력받아, 총점과 평균을 계산하여 출력하시오. */
        System.out.print("국어 점수: ");
        int korean = sc.nextInt();
        System.out.print("영어 점수: ");
        int english = sc.nextInt();
        System.out.print("수학 점수: ");
        int math = sc.nextInt();
        int total1 = korean + english + math;
        double avg1 = total1 / 3.0;
        System.out.println("총점: " + total1);
        System.out.println("평균: " + avg1);

        /*[문제 2] Scanner를 이용해 원의 반지름(double)을 입력받아, 원의 넓이를 계산하여 출력하시오. */
        System.out.print("반지름을 입력하세요: ");
        double radius = sc.nextDouble();
        double circleArea = radius * radius * 3.14;
        System.out.println("원의 넓이: " + circleArea);

        /*[문제 3] Scanner를 이용해 두 개의 실수(double)를 입력받아, 첫 번째 실수가 두 번째 실수의 몇 퍼센트인지 계산하여 출력하시오. */
        System.out.print("첫 번째 실수: ");
        double num1 = sc.nextDouble();
        System.out.print("두 번째 실수: ");
        double num2 = sc.nextDouble();
        double ratio = (num1 / num2) * 100;
        System.out.println("비율: " + ratio + "%");

        /*[문제 4] Scanner를 이용해 정수 하나를 입력받아, 그 수가 홀수이면 true, 짝수이면 false를 출력하시오. */
        System.out.print("정수를 입력하세요: ");
        int num4 = sc.nextInt();
        boolean isOdd = (num4 % 2 != 0);
        System.out.println("결과: " + isOdd);

        /*[문제 5] Scanner를 이용해 정수 하나를 입력받아, 그 수가 7의 배수이면 true, 아니면 false를 출력하시오. */
        System.out.print("정수를 입력하세요: ");
        int num5 = sc.nextInt();
        boolean isMultipleOf7 = (num5 % 7 == 0);
        System.out.println("결과: " + isMultipleOf7);

        /*[문제 6] Scanner를 이용해 아이디와 비밀번호를 String으로 입력받아, 아이디가 "admin"이고 비밀번호가 "1234"와 모두 일치하면 true, 아니면 false를 출력하시오. */
        System.out.print("아이디: ");
        String id6 = sc.next();
        System.out.print("비밀번호: ");
        String pw6 = sc.next();
        boolean isLogin = id6.equals("admin") && pw6.equals("1234");
        System.out.println("결과: " + isLogin);

        /*[문제 7] Scanner를 이용해 정수 하나를 입력받아, 그 수가 홀수이면서 7의 배수이면 true, 아니면 false를 출력하시오. */
        System.out.print("정수를 입력하세요: ");
        int num7 = sc.nextInt();
        boolean isOddAndMultiple7 = (num7 % 2 != 0) && (num7 % 7 == 0);
        System.out.println("결과: " + isOddAndMultiple7);

        /*[문제 8] Scanner를 이용해 1차 점수와 2차 점수를 각각 int로 입력받아, 두 점수의 총점이 150점 이상이면 "합격", 아니면 "불합격"을 출력하시오. */
        System.out.print("1차 점수: ");
        int score1 = sc.nextInt();
        System.out.print("2차 점수: ");
        int score2 = sc.nextInt();
        String result8 = (score1 + score2 >= 150) ? "합격" : "불합격";
        System.out.println("결과: " + result8);

        /*[문제 9] Scanner를 이용해 이름을 String으로 입력받아, 만약 이름이 "유재석"과 일치하면 이름 뒤에 "(방장)"을 붙여서 출력하고, 아니면 입력받은 이름만 출력하시오. */
        System.out.print("이름을 입력하세요: ");
        String name9 = sc.next();
        if (name9.equals("유재석")) {
            System.out.println(name9 + "(방장)");
        } else {
            System.out.println(name9);
        }

        /*[문제 10] Scanner를 이용해 삼각형의 밑변과 높이를 각각 double로 입력받아, 삼각형의 넓이를 계산하여 출력하시오. */
        System.out.print("밑변: ");
        double base = sc.nextDouble();
        System.out.print("높이: ");
        double height = sc.nextDouble();
        double triangleArea = base * height / 2.0;
        System.out.println("삼각형의 넓이: " + triangleArea);

        /*[문제 11] Scanner를 이용해 섭씨 온도를 double로 입력받아, 화씨 온도로 변환하여 출력하시오. */
        System.out.print("섭씨 온도: ");
        double celsius = sc.nextDouble();
        double fahrenheit = (celsius * 9.0 / 5.0) + 32;
        System.out.println("화씨 온도: " + fahrenheit);

        /*[문제 12] Scanner를 이용해 태어난 년도(int)를 입력받아, 2025년 기준 현재 나이를 계산하여 출력하시오. */
        System.out.print("태어난 년도: ");
        int birthYear = sc.nextInt();
        int age = 2025 - birthYear;
        System.out.println("2025년 기준 나이: " + age + "세");

        /*[문제 13] Scanner를 이용해 키(cm)와 몸무게(kg)를 각각 double로 입력받아, BMI 지수를 계산하여 출력하시오. */
        System.out.print("키(cm): ");
        double heightCm = sc.nextDouble();
        System.out.print("몸무게(kg): ");
        double weight = sc.nextDouble();
        double heightM = heightCm / 100.0;
        double bmi = weight / (heightM * heightM);
        System.out.println("BMI 지수: " + bmi);

        /*[문제 14] Scanner를 이용해 아이디와 이메일을 String으로 입력받습니다. 아이디가 "admin"이거나 또는 이메일이 "admin@test.com"이면 "관리자", 그렇지 않으면 "일반 사용자"를 출력하시오. */
        System.out.print("아이디: ");
        String id14 = sc.next();
        System.out.print("이메일: ");
        String email14 = sc.next();
        String result14 = (id14.equals("admin") || email14.equals("admin@test.com")) ? "관리자" : "일반 사용자";
        System.out.println("결과: " + result14);

        /*[문제 15] Scanner를 이용해 100점 만점의 점수(int)를 입력받아, 점수에 따라 등급을 부여하고 출력하시오. */
        System.out.print("점수를 입력하세요: ");
        int score15 = sc.nextInt();
        char grade;
        if (score15 >= 90) {
            grade = 'A';
        } else if (score15 >= 80) {
            grade = 'B';
        } else {
            grade = 'C';
        }
        System.out.println("등급:" + grade);

        /*[문제 16] Scanner를 이용해 나이(int)를 입력받아, 20대(20세 이상 29세 이하)에 해당하는 경우 "이벤트 대상입니다."를, 그렇지 않으면 "이벤트 대상이 아닙니다."를 출력하시오. */
        System.out.print("나이를 입력하세요: ");
        int age16 = sc.nextInt();
        if (age16 >= 20 && age16 <= 29) {
            System.out.println("이벤트 대상입니다.");
        } else {
            System.out.println("이벤트 대상이 아닙니다.");
        }

        sc.close();
    }
}