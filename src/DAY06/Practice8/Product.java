package DAY06.Practice8;

public class Product {
    String name;
    int stock;

    boolean sell(int pay){
        if(stock>=pay){
            stock-=pay;
            return true;
        }
        else{
            System.out.println("재고부족");
            return false;
        }

    }
}
