package 콘솔기반도서관리시스템.controller;

import 콘솔기반도서관리시스템.model.dao.MemberDao;

public class MemberController {

    private MemberController(){}
    private static final MemberController instance = new MemberController();
    public static MemberController getInstance(){
        return instance;
    }

    //호출
    MemberDao md = MemberDao.getInstance();

    //회원가입
    public boolean signUp(String mid,String mpw, String mname , String mphone){
        boolean result = md.signUp(mid,mpw,mname,mphone);
        return result;
    }

    //로그인
    private int loginSession =0;
    public boolean login(String mid, String mpw){
        System.out.println("mid = " + mid + ", mpw = " + mpw);
        System.out.println("MemberController.login");
        int result = md.login(mid,mpw);
        if(result >0){
            loginSession=result;
            System.out.println("result = " + result);return true;
        }
        return false;
    }
    public boolean logout(){
        loginSession=0;
        System.out.println("loginSession = " + loginSession);
        return true;
    }

}
