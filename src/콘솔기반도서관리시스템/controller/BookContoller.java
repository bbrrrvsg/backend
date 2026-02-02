package 콘솔기반도서관리시스템.controller;

import 콘솔기반도서관리시스템.model.dao.BookDao;
import 콘솔기반도서관리시스템.model.dto.BookDto;

import java.util.ArrayList;

public class BookContoller {

    private BookContoller(){}
    private static final BookContoller instance = new BookContoller();
    public static BookContoller getInstance(){
        return instance;
    }

    //호출
    BookDao bd = BookDao.getInstance();

    //책등록
    public boolean addBook(String bname){
        boolean result = bd.addBook(bname);
        return result;
    }

    // 조회
    public ArrayList<BookDto>printBook(){
        ArrayList<BookDto>books = bd.printBook();
        return books;
    }

    //대출
    public boolean myBook(String bname){
        boolean result = bd.myBook(bname);
        return result;
    }
    // 대출현황
}
