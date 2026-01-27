package DAY06.종합.종합과제1;

public class WaitingController {

    Waiting[] waitings = new Waiting[100];

    boolean addWaiting(String phone , int count){
        Waiting wait = new Waiting();
        wait.count=count;
        wait.phone=phone;

        for(int i=0; i<waitings.length; i++){
            if(waitings[i]==null){
                waitings[i]=wait;
                return true;
            }
        }
        return false;
    }

    Waiting[] getWaitingList(){
        return waitings;
    }
}
