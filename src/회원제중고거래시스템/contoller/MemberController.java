package 회원제중고거래시스템.contoller;

import 회원제중고거래시스템.model.dao.MemberDao;

public class MemberController {

    // 싱글톤
    private MemberController(){}
    private static final MemberController instance = new MemberController();
    public static MemberController getInstance(){
        return instance;
    }

    //싱글톤 호출
    private MemberDao md = MemberDao.getInstance();

    public boolean signup(String mid , String mpw ,String mname , String mphone){
        // [*] 유효성 검사 ( 중복 검사 , 데이터의 길이 검사 등등)
        System.out.println("MemberController.signup"); // soutm 중간검사(완성후제거)
        boolean result =md.signup(mid,mpw,mname,mphone);
        return  result;
    }

    private int loginSession = 0 ; //세션이란? 일정한 저장소 구역 ,
    // 로그인 성공한 회원번호 저장 , 0이면 비로그인 , 3이면 3번회원 로그인중
    public boolean login(String mid , String mpw ){
        System.out.println("MemberController.login");
        System.out.println("mid = " + mid + ", mpw = " + mpw);
        int result =md.login(mid,mpw);
        if(result>0){
            loginSession = result; return true;
        }
        return false;
    }

    public boolean logout(){
        loginSession=0; // 로그인 상태를 0(비로그인)으로 변셩
        return true;
    }

    public int getLoginSession(){return loginSession;}





}
