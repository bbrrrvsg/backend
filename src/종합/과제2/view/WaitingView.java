package 종합.과제2.view;

import 종합.과제2.controller.WaitingController;
import 종합.과제2.model.dao.WaitingDao;
import 종합.과제2.model.dto.WaitingDto;

import java.util.ArrayList;
import java.util.Scanner;

public class WaitingView {

    // 싱글톤 생성
    private WaitingView(){}

    public static final WaitingView instance = new WaitingView();

    public static WaitingView getInstance(){
        return instance;
    }


    // 컨트롤러 호출
    private WaitingController wc = WaitingController.getInstance();


    // 입력
    private Scanner scan = new Scanner(System.in);


    // 입출력 화면
    public void addView(){
        scan.nextLine();
        System.out.print("전화번호 : ");String phone = scan.nextLine();
        System.out.print("인원수 : "); int count = scan.nextInt();
        scan.nextLine();

        // 컨트롤러에게 전달
        boolean result = wc.addWaiting(phone,count);

        if(result){
            System.out.println("성공");
        }
        else{
            System.out.println("실패");
        }

    } // m end


    // 조회 입출력 화면
    public void printView(){
        ArrayList<WaitingDto>DB = wc.doGet();

        for(WaitingDto data : DB){
            System.out.printf("번호 : %d | 연락쳐 : %s | 인원수 : %d명 ",data.getNo(),data.getPhone(),data.getCount());
        }
    }

    // 메인화면
    public void indexView(){
        for(; ; ){
            System.out.println("==============my community===============");
            System.out.println("1.대기등록 2.대기명단");
            System.out.println("=========================================");
            System.out.print("선택>");
            int ch = scan.nextInt();
            if(ch==1){
                addView();
            }
            else if(ch==2){
                printView();
            }

        }
    }



}// class end
