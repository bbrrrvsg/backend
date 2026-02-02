package 콘솔기반도서관리시스템.model.dao;

import 콘솔기반도서관리시스템.model.dto.MemberDto;

import java.util.ArrayList;

public class MemberDao {

    private MemberDao(){}
    private static final MemberDao instance = new MemberDao();

    public static MemberDao getInstance(){
        return instance;
    }


    private ArrayList<MemberDto>members = new ArrayList<>();
    private int currentNo=1;

    // 회원가입
    public boolean signUp(String mid,String mpw,String mname,String mphone){
        MemberDto memberDto = new MemberDto(currentNo,mid,mpw,mname,mphone);
        boolean result = members.add(memberDto);
        if(result){
            currentNo++;
        }
        return result;
    }

    //로그인
    public int login(String mid ,String mpw){
        System.out.println("MemberDao.login");
        System.out.println("mid = " + mid + ", mpw = " + mpw);
        for(int i=0; i<members.size(); i++){
            MemberDto memberDto = members.get(i);
            if(memberDto.getMid().equals(mid)&&memberDto.getMpw().equals(mpw)){

                return memberDto.getMno(); // 로그인성공시 회원번호 반환
            }

        }
        return 0;
    }

    public String findMname(int mno){
        for(int i=0; i<members.size();i++){
            if(members.get(i).getMno()==mno){
                return members.get(i).getMname();
            }
        }
        return null;
    }







}
