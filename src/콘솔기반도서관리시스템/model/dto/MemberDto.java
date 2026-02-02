package 콘솔기반도서관리시스템.model.dto;

public class MemberDto {
    int mno;
    String mname;
    String mid;
    String mpw;
    String mphone;

    public MemberDto(int mno, String mname, String mid, String mpw,String mphone) {
        this.mno = mno;
        this.mname = mname;
        this.mid = mid;
        this.mpw = mpw;
        this.mphone=mphone;
    }

    public int getMno() {
        return mno;
    }

    public void setMno(int mno) {
        this.mno = mno;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public String getMpw() {
        return mpw;
    }

    public void setMpw(String mpw) {
        this.mpw = mpw;
    }

    public String getMphone() {
        return mphone;
    }

    public void setMphone(String mphone) {
        this.mphone = mphone;
    }
}
