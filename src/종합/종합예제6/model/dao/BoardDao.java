package 종합.종합예제6.model.dao;

import 종합.종합예제6.model.dto.BoardDto;

import java.util.ArrayList;

public class BoardDao {

    private BoardDao(){}

    public static final BoardDao instance = new BoardDao();

    public static BoardDao getInstance(){
        return instance;
    }

    // [*] 데이터베이스 역할 하는 ArrayList < 추후에 삭제 예정 >
    private static final ArrayList<BoardDto>boardDB = new ArrayList<>();
    // [*] 전역변수에 최신 게시물 번호 저장 < 식별키 생성 목적 : 추후에 삭제 예정 >
    private static int currentNo = 1;


    //1) 등록 처리
    public boolean doPost(String content,String writer){

        //1. 매개변수에 따른 객체를 만든다. + 게시물번호 자동생성
        BoardDto boardDto = new BoardDto(currentNo,content,writer);
        //2. .add(새로운값) : 추가하면 true 실패하면 false 반환하는 기능/함수/메소드
        boolean saveResult = boardDB.add(boardDto);
        currentNo++; // 다음 저장할 게시물의 번호를 1증가 한다.
        //3. 저장 성공여부를 컨트롤러 에게 반환한다.
        return  saveResult;

    } // m end

    //2) 전체 조회 처리 : controller가 dao 에게 모든 게시물 요청한다.
    // 개별 조회 1개 반환 타입 : BoardDto vs 전체조회 N개 반환타입 ArrayList<BoardDto>
    public ArrayList<BoardDto> doGet(){
        return boardDB;
    }

} // class end
