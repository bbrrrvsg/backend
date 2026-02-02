package 콘솔기반도서관리시스템.model.dao;

import 콘솔기반도서관리시스템.model.dto.BookDto;

import java.util.ArrayList;

public class BookDao {

    private BookDao(){}
    private static final BookDao instance = new BookDao();
    public static BookDao getInstance(){
        return instance;
    }

    private final ArrayList<BookDto>books = new ArrayList<>();
    private final ArrayList<BookDto>myBooks = new ArrayList<>();


    private int currentBno=1;
    // 책등록
    public boolean addBook(String bname){
        BookDto bookDto =new BookDto(currentBno,bname);
        boolean result = books.add(bookDto);
        if(result==true) {
            currentBno++;
        }
        return result;

    }

    // 책 조회
    public ArrayList<BookDto> printBook(){
        return books;
    }

    private int myNo=1;

    // 도서 대출
    public boolean myBook(String bname){
       for(int i=0; i<books.size();i++){
           if(books.get(i).getBname().equals(bname)){
               BookDto mybook= books.remove(i);
               boolean result = myBooks.add(mybook);
               return result;
           } // 리무브 말고 넣거나 겟으로 넣거나 해서 마이북을 반복문돌려서 중복 방지 ? 회원 정보도 필요

       }return false;

    }
    // 대출현황



}
