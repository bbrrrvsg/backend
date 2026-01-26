package DAY03;

public class Exam1 {
    public static void main(String[] args) {


        //[1] 조건문 if , 만약에~ , 경우의 수
        //(1) if(조건문) 실행문;
        int 온도 = 5;
        if(온도 <= 10) System.out.println("외투 입니다.");

        //(2)
        int 나이 = 10;
        if(나이 >=19 ){
            System.out.println("성인 입니다.");
            System.out.println("19세입니다. ");
        }


        //(3)
        boolean 회원검사 = false;
        if(회원검사 ==true ){
            System.out.println("안녕하세요 회원님");
        }
        else{
            System.out.println("비회원 입니다.");
        }

        //(4)
        // 여러 조건의 하나의 실행문
        int 지갑돈 = 1000;
        if(지갑돈 >= 3000){
            System.out.println("택시를 탄다.");
        }
        else if (지갑돈 >=1000) {
            System.out.println("버스를 탄다.");
        }
        else if(지갑돈 >=500){
            System.out.println("자전거를 탄다.");
        }
        else{
            System.out.println("걸어간다");
        }


        //여러 조건에 따른 여러 실행문
        if(지갑돈 >= 3000){
            System.out.println("택시를 탄다.");
        }
        if (지갑돈 >=1000) {
            System.out.println("버스를 탄다.");
        }
        if(지갑돈 >=500){
            System.out.println("자전거를 탄다.");
        }
        if(지갑돈 < 500){
            System.out.println("걸어간다");
        }

        // if 중첩
        int age = 25;
        char gender = 'w';

        if(age == 19){
            System.out.println("성인");
            if (gender == 'w'){
                System.out.println("성인여자");
            }
            else {
                System.out.println("성인남자");
            }
        }

        // (5) switch : 논리 검사 보다 값에 따른 흐름 제어 사용
        char grade = 'b';
        // break 필수 : switch 탈출
        switch (grade){
            case 'A':
                System.out.println("우수 학생");
                break;

            case 'B':
                System.out.println("장려학생");
                break;
            default:
                System.out.println("학생");
        }

        int adult = 1;
        char gender2 ='w';

        switch (adult){
            case 1 :
                System.out.println("성인");
                switch (gender2){
                    case 'w':
                        System.out.println("성인 여자");
                        break;
                    case 'm' :
                        System.out.println("성인 남자");// 마지막 case에서는 break 생략가능
                }
                break;
            default:
                System.out.println("미성년자");
                break; // 마지막 case에서는 break 생략가능
        }





    }
}
