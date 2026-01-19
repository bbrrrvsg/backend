package DAY01;

import java.sql.SQLOutput;

public class Exam3 {
    public static void main(String[] args) {

        // m+ 엔터 : 코드의 흐름을 읽어주는 main 함수 선언

        //[1] System.out.println(); : 자료 출력후 줄바꿈포함 , sout자동완성

        //System : 클래스 이면서 시스템(현컴퓨터) 관련 기능/함수 제공한다.

        //out : 출력에 관련된 기능/함수 갖는 객체 반환

        //print : 출력함수

        //[2] System.out.print() : 자료출혁

        //[3] System.out.printf() : 자료출력 + 형식문자

        /*
        * format 형식
        *  %s : 문자열
        *  %d : 정수
        *  %c : 문자
        *  %f : 실수
        *
        * 자릿수
        *  %자릿수d : 자릿수 만큼 자리 차지 , 만일 비어있으면 공백 출력 , 오른쪽 정렬
        *  %-자릿수d : 자릿수 만큼 자리 차지 , 만일 비어있으면 공백 출력 , 왼쪽 정렬
        *  %0자릿수d : 주릿수 만큼 자리 차지 , 만일 비어있으면 0 으로 채룸
        * */
        String name ="유재석";
        int age = 10;
        System.out.printf("저는"+name+"이고 나이는 " + age+"입니다");
        System.out.printf("저는 %s 이고 나이는 %d 입니다.\n ", name , age);
        System.out.printf("저는 %s 이고 나이는 %6d 입니다.\n ", name , age);
        System.out.printf("저는 %s 이고 나이는 %-6d 입니다.\n ", name , age);
        System.out.printf("저는 %s 이고 나이는 %06d 입니다.\n ", name , age);
        System.out.printf("저는 %s 이고 키는 %5.2f 입니다.\n ", name , 177.123);


        //[5] 이스케이프/제어문자
        //"\n" : 줄바꿈 , "\t" : 들여쓰기 [tab]
        // "\"" : 큰따음표   "\'" : 작은 따음표  "\\" : 백슬래시 출력
        System.out.println("안녕\n안녕2");
        System.out.println("안녕\t안녕2");
        System.out.println("안녕\"안녕2");
        System.out.println("안녕\'안녕2");
        System.out.println("안녕\\안녕2");

    }
}
