package 종합.종합예제5;

import java.util.Scanner;

public class BoardService5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        for (; ; ) {
            System.out.println("===============my community==========");
            System.out.println("1. 글쓰기 2. 출력");
            System.out.println("=======================================");
            System.out.print("선택>");
            int ch = scan.nextInt();

            if (ch == 1) {
                System.out.print("내용 : ");
                String content = scan.nextLine();
                System.out.print("작성자 : ");
                String writer = scan.nextLine();

                //BoardController.doPost() : static메소드(클래스명.메소드명()) vs bc.dopost() : 일반메소드 객체명.메소드
                //함수 호출 후 반환(결과)에 따른 흐름제어 하기 위해 boolean result 변수에 결과값 저장
                boolean result = BoardController.doPost(content,writer);

                if(result){
                    System.out.println("성공");
                }
                else{
                    System.out.println("실패");
                }



            } else if (ch == 2) {
                Board[] boards = BoardController.doget();
                for(Board board : boards){ // board.writer 직접접근  vs board.getWriter() 간접접근
                    if(board != null )System.out.printf("작성자 : %s , 내용 : %s \n",board.getWriter(),board.getContent());
                }
            }



        } // for end



    } // main end
}//class end