package 종합.예제7.view;

import 종합.예제7.controller.BoardController;
import 종합.예제7.model.dto.BoardDto;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BoardView {
    private BoardView(){}
    private static final BoardView instance = new BoardView();
    public static BoardView getInstance(){return instance;}

    BoardController bc = BoardController.getInstance();

    private Scanner scan = new Scanner(System.in);

    public void index(){
        for(;;){
            try{
                System.out.println("===============my community==============================");
                System.out.println("1. 게시물등록 2. 게시물전체조회 3. 게시물 수정 4. 게시물 삭제" );
                System.out.println("=========================================================");
                System.out.print("선택>");
                int ch = scan.nextInt();
                if(ch==1){write();}
                else if(ch==2){findAll();}
                else if(ch==3){update();}
                else if(ch==4){delete();}
                else{
                    System.out.println("없는 번호");
                }

            }catch (InputMismatchException e){
                System.out.println("잘못된 입력방식 [재입력]");
                scan = new Scanner(System.in); //입력객체 초기화 (잘못된 입력값 제거)
            }catch (Exception e){ // Exception 예외 중 슈퍼클래스로 모든 예외처리 가능
                System.out.println("시스템 오류 관리자에게 문의 ");
            }
        }
    }// m end


    // 등록 뷰
    public void write(){
        scan.nextLine();
        System.out.print("내용 : "); String bcontent = scan.nextLine();
        System.out.print("작성자 : "); String bwriter = scan.nextLine();

        boolean result = bc.write(bcontent,bwriter);

        if (result){
            System.out.println("게시글 등록 완료 ");
        }
        else{
            System.out.println("게시글 등록 실패 ");
        }
    }


    // 삭제 뷰
    public void delete(){
        System.out.print("삭제할 게시물 번호 : "); int bno = scan.nextInt();
        boolean result = bc.delete(bno);
        if (result){
            System.out.println("게시글 삭제 완료 ");
        }
        else{
            System.out.println("게시글 삭제 실패 또는 없는 게시물 ");
        }

    }

    // 수정 뷰
    public void update(){
        System.out.print("수정할 게시물 번호 :"); int bno = scan.nextInt();scan.nextLine();
        System.out.print("수정할 내용 : "); String bcontent = scan.nextLine();
        boolean result = bc.update(bno,bcontent);
        if (result){
            System.out.println("게시글 수정 완료 ");
        }
        else{
            System.out.println("게시글 수정 실패 또는 없는 게시물 ");
        }
    }//m end

    // 게시물 전체조회 view
    public void findAll(){
        ArrayList<BoardDto> boards = bc.findAll();
        for(BoardDto boardDto : boards){
            System.out.printf("번호 : %d , 작성일 : %s , 내용 : %s\n",boardDto.getBno(),boardDto.getBdate(),boardDto.getBcontent());

        }
    }



}//class end
