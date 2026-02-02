package 회원제중고거래시스템.contoller;

import 회원제중고거래시스템.model.dao.MemberDao;
import 회원제중고거래시스템.model.dao.ProductDao;
import 회원제중고거래시스템.model.dto.ProductDto;

import java.util.ArrayList;

public class ProductController {


    //싱글톤
    private ProductController(){}

    private static final ProductController instance = new ProductController();

    public static ProductController getInstance(){
        return instance;
    }

    // Controller -> Product Dao 호출
    ProductDao pd = ProductDao.getInstance();



    // 상품등록 view에게서 받은 매개변수 를 dao한테 넘겨주고 dao가 반환한 result값을 변수에 저장후 반환
    public boolean add(String pname , int pprice , String pcomment){
        int loginMno = MemberController.getInstance().getLoginSession();
        boolean result =pd.add(pname,pprice,pcomment,loginMno);
        return result;
    }

    public ArrayList<ProductDto>findAll(){
        ArrayList<ProductDto>result =pd.findAll();
        for(int i=0; i<result.size(); i++){
            ProductDto productDto = result.get(i);

            String mname = MemberDao.getInstance().findMname(productDto.getNumber());
            productDto.setManme(mname);
        }

        return result;
    }







}
