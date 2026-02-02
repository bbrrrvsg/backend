package 콘솔기반도서관리시스템.model.dto;

public class BookDto {

    int bno;
    String bname;

    public BookDto(int bno, String bname) {
        this.bno = bno;
        this.bname = bname;
    }

    public int getBno() {
        return bno;
    }

    public void setBno(int bno) {
        this.bno = bno;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }
}

