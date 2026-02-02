package 회원제중고거래시스템.model.dao;

import 회원제중고거래시스템.contoller.MemberController;
import 회원제중고거래시스템.model.dto.MemberDto;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberDao {
    private MemberDao(){}
    private static final MemberDao instance = new MemberDao();
    public static MemberDao getInstance(){
        return instance;
    }

    private ArrayList<MemberDto>members = new ArrayList<>();


    //자동회원번호
    private int currentNo =1;

    // 회원가입
    public boolean signup(String mid, String mpw, String mname, String mphone ){
        MemberDto memberDto = new MemberDto(currentNo,mid,mpw,mname,mphone);// 객체생성
        boolean result = members.add(memberDto);
        if(result){
            currentNo++; // 저장성공시 회원번호 1증가
        }
        return result;
    }

    // 로그인
    public int login(String mid , String mpw ){
        System.out.println("MemberDao.login");
        System.out.println("mid = " + mid + ", mpw = " + mpw);
        for(int i=0; i<members.size(); i++){
            MemberDto memberDto = members.get(i);
            if(memberDto.getMid().equals(mid)&&memberDto.getMpw().equals(mpw)){
                return memberDto.getMno(); // 인가처리
            }
        }
        return 0; // 로그인실패 0 은 회원번호에 없기 떄문에
    }

    //[3] 회원번호로 닉네임 조회하기
    public String findMname(int mno){
        for(int i=0; i<members.size(); i++){
            if(members.get(i).getMno()==mno){
                return members.get(i).getMname();
            }
        }
        return null;
    }

} //class end

