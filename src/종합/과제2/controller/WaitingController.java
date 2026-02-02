package 종합.과제2.controller;

import 종합.과제2.model.dao.WaitingDao;
import 종합.과제2.model.dto.WaitingDto;

import java.util.ArrayList;

public class WaitingController {

    //싱글톤 생성
    private WaitingController(){}

    public static final WaitingController instance = new WaitingController();

    public static WaitingController getInstance(){
        return instance;
    }

    // dao 호출
    private WaitingDao wd = WaitingDao.getInstance();


    //대기 명단 등록 제어
    public boolean addWaiting(String phone , int count){

        boolean result = wd.addWaiting(phone,count);

        return result;

    } // m end


    // view에게 요청 받아 dao에게 재요청하여 결과를 view에게 전달
    public ArrayList<WaitingDto> doGet(){
        ArrayList<WaitingDto>result =wd.doGet();
        return result;
    }



}// class end
