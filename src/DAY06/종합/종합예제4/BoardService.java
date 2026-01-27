package DAY06.종합.종합예제4;

import java.util.Scanner;

public class BoardService {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        BoardController bc = new BoardController();

        for(;;){
            System.out.println("===============my community==========");
            System.out.println("1. 글쓰기 2. 출력");
            System.out.println("=======================================");
            System.out.print("선택>"); int ch = scan.nextInt();
            scan.nextLine();
            if(ch==1){
                System.out.print("내용 : "); String content = scan.nextLine();
                System.out.print("작성자 : "); String writer = scan.nextLine();

                boolean result = bc.doPost(writer,content);
                if(result==true){
                    System.out.println("[안내]등록 성공");
                }
                else{
                    System.out.println("[경고]등록 실패");
                }
            }
            else if(ch==2){
                Board[] boards = bc.doGet();
                for(int i=0; i<boards.length; i++){
                    if(boards[i]!=null){
                        System.out.println("작성자 : "+boards[i].writer);
                        System.out.println("내용 : "+boards[i].content);
                    }

                }

            }
        }
    }
}
