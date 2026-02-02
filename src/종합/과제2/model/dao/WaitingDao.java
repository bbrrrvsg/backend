package 종합.과제2.model.dao;

import 종합.과제2.model.dto.WaitingDto;

import java.util.ArrayList;

public class WaitingDao {

    // 싱글톤 생성
    private WaitingDao(){}

    public static final WaitingDao instance = new WaitingDao();

    public static WaitingDao getInstance(){
        return instance;
    }


    // 데이터베이스
    private final ArrayList<WaitingDto>waitingDB = new ArrayList<>();





    // 식별키 초기값 = 1
    private static int currentNo =1;

    // 대기 명단 등록 처리
    public boolean addWaiting(String phone , int count){

        WaitingDto waitingDto = new WaitingDto(currentNo,phone,count);
        boolean result = waitingDB.add(waitingDto);
        currentNo++;
        return result; // 저장 성공 여부

    }

    // 조회 처리
    public ArrayList<WaitingDto> doGet(){
        return waitingDB;
    }

}
