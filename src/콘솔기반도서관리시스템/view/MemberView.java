package 콘솔기반도서관리시스템.view;

import 콘솔기반도서관리시스템.controller.MemberController;

import java.util.Scanner;

public class MemberView {

    private MemberView(){}
    private static final MemberView instance = new MemberView();
    public static MemberView getInstance(){
        return instance;
    }

    //호출
    MemberController mc = MemberController.getInstance();


    private Scanner scan = new Scanner(System.in);
    //메인
    public void index(){
        for(;;){
            System.out.println("1.회원가입 2. 로그인  선택 > ");
            int ch = scan.nextInt();
            if(ch==1){
                signUp();//회원가입 화면
            }
            else if(ch==2){
                login();//로그인 화면
            }
        }
    }


    // 회원가입 화면
    public void signUp(){
        System.out.print("아이디 : "); String id = scan.next();
        System.out.print("비밀번호 : ");String pw = scan.next();
        System.out.print("닉네임 : ");String name = scan.next();
        System.out.print("연락쳐 : ");String phone = scan.next();
        boolean result = mc.signUp(id,pw,name,phone); // 임시
        System.out.println("result = " + result);
        if(result==true){
            System.out.println("회원가입 성공 ");
        }
        else{
            System.out.println("회원가입 실패");
        }
    }

    //로그인 화면
    private BookView bv = BookView.getInstance();
    public void login(){
        System.out.print("아이디 : ");String mid=scan.next();
        System.out.print("비밀번호 : ");String mpw=scan.next();
        if(mid.equals("admin")&&mpw.equals("1234")){
            bv.index1(); return;
        }


        boolean result = mc.login(mid,mpw);
        if(result==true){
            System.out.println("로그인 성공");
            bv.index();
        }
        else{
            System.out.println("로그인 실패");
        }
    }


}
