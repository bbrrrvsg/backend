package 종합.예제3;

import java.util.Scanner;

public class BoardService {

    public static void main(String[] args) {
        Board[] boards = new Board[100];
        Scanner sc = new Scanner(System.in);

        for( ; ; ){
            System.out.println("\n=========My Community==========");
            System.out.println("1.쓰기 2.출력 3.종료");
            System.out.println("==============================");

            System.out.print("선택: ");
            int ch = sc.nextInt();
            sc.nextLine();

            if(ch == 1){
                System.out.print("내용 : "); String content = sc.nextLine();
                System.out.print("작성자 : "); String name = sc.nextLine();

                Board board = new Board();
                board.내용 = content;
                board.작성자 = name;

                boolean check = false;
                for(int index = 0; index < boards.length; index++){
                    if(boards[index] == null){
                        boards[index] = board;
                        check = true;
                        break;
                    }
                }

                if(check) System.out.println("글쓰기 성공!");
                else System.out.println("공간 부족!");

            } else if(ch == 2){
                System.out.println("--- 게시물 목록 ---");
                for(int i = 0; i < boards.length; i++){
                    // 게시물이 들어있는 칸만 골라서 출력
                    if(boards[i] != null){
                        System.out.printf("작성자 : %s , 내용 : %s \n", boards[i].작성자, boards[i].내용);
                    }
                }
            } else if(ch == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }
    }
}