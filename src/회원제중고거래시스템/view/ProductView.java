package 회원제중고거래시스템.view;

import 회원제중고거래시스템.contoller.MemberController;
import 회원제중고거래시스템.contoller.ProductController;
import 회원제중고거래시스템.model.dto.ProductDto;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductView {


    //싱글톤
    private ProductView(){}

    private static final ProductView instance = new ProductView();

    public static ProductView getInstance(){
        return instance;
    }


    // view -> controller 호출
    ProductController pc = ProductController.getInstance();
    MemberController mc = MemberController.getInstance();

    Scanner scan = new Scanner(System.in);


    public void index(){
        for(;;){
            System.out.println("1.제품등록 2.제품전체조히 3. 로그아웃  선택>");
            int ch=scan.nextInt();
            if(ch==1){add();}
            else if(ch==2){findAll();}
            else if(ch==3){mc.logout(); break;}
        }
    }


    public void add(){
        System.out.print("제품명 : "); String pname = scan.next();
        System.out.print("제품가격 : "); int pprice = scan.nextInt();
        System.out.print("제품설명 : "); String pcommnet = scan.next();
        boolean result = pc.add(pname,pprice,pcommnet);
        if(result){
            System.out.println("제품 등록 성공");
        }
        else{
            System.out.println("제품 등록 실패");
        }
    }

    public void findAll(){
        ArrayList<ProductDto>productDtos = pc.findAll(); // 임시
        for(int i=0; i<productDtos.size(); i++){
            ProductDto productDto = productDtos.get(i);
            System.out.printf("제품번호 : %d | %s | %d | 판매자 : %s ",
                    productDto.getNo(),productDto.getPname(),productDto.getPrice(),productDto.getManme());
        }
    }


} // class end

