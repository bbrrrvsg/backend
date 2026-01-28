package DAY07.Practice9;

public class Goods {
    String name;
    int price;

    Goods(){
        name="미정";
        price=0;
    }
    Goods(String name, int price){
        this.name=name;
        this.price=price;
    }
    void printGoods(){
        System.out.println("name = " + name);
        System.out.println("price = " + price);
    }


}
