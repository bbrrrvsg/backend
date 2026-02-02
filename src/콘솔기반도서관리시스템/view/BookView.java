package 콘솔기반도서관리시스템.view;

import 콘솔기반도서관리시스템.controller.BookContoller;
import 콘솔기반도서관리시스템.controller.MemberController;
import 콘솔기반도서관리시스템.model.dto.BookDto;

import java.util.ArrayList;
import java.util.Scanner;

public class BookView {

    private BookView(){}
    private static final BookView instance = new BookView();
    public static BookView getInstance(){
        return instance;
    }

    BookContoller bc = BookContoller.getInstance();
    MemberController mc = MemberController.getInstance();
    Scanner scan = new Scanner(System.in);
    // 책등록 메인 페이지
    public void index(){
        for(;;){System.out.print("1. 책 등록 2. 책 조회 선택 3. 로그아웃 4.책 대여 5. 대출 현황 6.책 반납 >"); int ch=scan.nextInt();

            if(ch==1){
                System.out.println("관리자가 아닙니다.");
            }
            else if(ch==2){
                printBook();
            }
            else if(ch==3){
                mc.logout(); break;
            }
            else if(ch==4){
                myBook();
            }
            else if(ch==5){

            }
            else if(ch==6){

            }
        }

    }
    public void index1(){
        for(;;){System.out.print("1. 책 등록 2. 책 조회 선택 3. 로그아웃 4.책 대여 5. 대출 현황 6.책 반납 >"); int ch=scan.nextInt();

            if(ch==1){
                addBook();
            }
            else if(ch==2){
                printBook();
            }
            else if(ch==3){
                mc.logout(); break;
            }
            else if(ch==4){
                myBook();
            }
            else if(ch==5){

            }
            else if(ch==6){

            }
        }

    }
    // 책 등록
    public void addBook(){
        System.out.print("책 이름 : "); String bname= scan.next();

        boolean result = bc.addBook(bname);

        if(result==true){
            System.out.println("등록 성공");
        }
        else{
            System.out.println("등록 실패 ");
        }
    }

    // 책 조회
    public void printBook(){
        ArrayList<BookDto>books = bc.printBook();
        for(int i=0; i<books.size(); i++){
            BookDto bookDto = books.get(i);
            System.out.println(bookDto);
            System.out.printf("%d|책 제목 : %s|",bookDto.getBno(),bookDto.getBname());
        }
    }

    // 대출
    public void myBook(){
        System.out.print("책 이름 : "); String bname = scan.next();
        boolean result = bc.myBook(bname);

        if(result==true){
            System.out.println("대출 성공");
        }
        else{
            System.out.println("대출 실패");
        }

    }

    // 대출현황



}
