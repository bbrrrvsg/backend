package DAY06.Practice8;

public class ParkingLot {

    int calculateorFee(int x ){

        int fee;

        if(x>30){
            fee = 1000+(((x-30)/10)*500);
        }
        else{
            fee =1000;
        }
        if(fee>20000){
            fee =20000;
            return fee;
        }
        else{
            return fee;
        }
    }

}
