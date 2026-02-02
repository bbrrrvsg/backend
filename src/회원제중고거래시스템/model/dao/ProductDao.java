package 회원제중고거래시스템.model.dao;

import 회원제중고거래시스템.model.dto.ProductDto;

import java.util.ArrayList;

public class ProductDao {


    // 싱글톤
    private ProductDao(){}

    private static final ProductDao instance = new ProductDao();

    public static ProductDao getInstance(){
        return instance;
    }

    private int currentPno =1;
    // 임시 데이터베이스
    private final ArrayList<ProductDto> DB = new ArrayList<>();

    // 물품 등록 처리

    public boolean add(String pname ,int price , String pcomment,int loginMno){
        ProductDto productDto = new ProductDto(currentPno,pname,price,pcomment,loginMno);
        boolean result = DB.add(productDto);
        if(result){
            currentPno++;
        }
        return result;
    }

    public ArrayList<ProductDto>findAll(){
        return DB;
    }

} // class end
