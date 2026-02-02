package 회원제중고거래시스템.model.dto;

public class ProductDto {

    private int no;
    private int price;
    private String content;
    private String pname;
    private int number;
    private String manme; // 닉네임 , 조회시 출력할 내용

    public String getManme() {
        return manme;
    }

    public void setManme(String manme) {
        this.manme = manme;
    }

    public ProductDto(){}
    public ProductDto(int no, String pname,int price,String content,int number){

        this.no=no;
        this.content=content;
        this.pname=pname;
        this.price=price;
        this.number=number;

    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    @Override
    public String toString() {
        return "ProductDto{" +
                "price=" + price +
                ", content='" + content + '\'' +
                ", pname='" + pname + '\'' +
                '}';
    }
}
