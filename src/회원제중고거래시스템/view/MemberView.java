package 회원제중고거래시스템.view;

import 회원제중고거래시스템.contoller.MemberController;

import java.util.Scanner;

public class MemberView {
    //싱글톤
    private MemberView(){}
    private static final MemberView instance = new MemberView();
    public static MemberView getInstance(){
        return instance;
    }

    //호출
    private MemberController mc= MemberController.getInstance();

    private Scanner scan = new Scanner(System.in);

    public void index(){
        for( ;; ){
            System.out.print("1.회원가입 2.로그인 선택 > ");
            int ch = scan.nextInt();
            if(ch==1){
                signup();
            }
            else if(ch==2){
                login();
            }

        }// for end
    } // m end

    public void signup(){
        System.out.print("아이디 : "); String id = scan.next();
        System.out.print("비밀번호 : ");String pw = scan.next();
        System.out.print("닉네임 : ");String nickname = scan.next();
        System.out.print("연락쳐 : ");String phone = scan.next();

        boolean result = mc.signup(id,pw,nickname,phone);

        if(result == true){
            System.out.println("회원가입 성공 ");
        }
        else{
            System.out.println("회원가입 실패 ");
        }
    }

    private  ProductView pv = ProductView.getInstance();
    public void login(){
        System.out.print("아이디 : "); String mid = scan.next();
        System.out.print("비밀번호 : "); String mpw = scan.next();
        boolean result = mc.login(mid,mpw);
        if(result==true){
            System.out.println("로그인 성공");
            pv.index();//로그인 성공시 제품 index 페이지 실행
        }
        else{
            System.out.println("로그인 실패");
        }
    }


}
