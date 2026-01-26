package DAY04;

public class Exam1 {
    public static void main(String[] args) {


        //구구단 자동반사적으로 하기
        for(int i=2; i<=9; i++){
            for(int j=1; j<=9; j++){
                System.out.printf("%dx%d=%d\n",i,j,i*j);
            }
        }

        // for(;;){} : 무한 반복, 조건 종료는 필요
    }
}
