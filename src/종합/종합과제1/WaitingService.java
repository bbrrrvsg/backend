package 종합.종합과제1;

import java.util.Scanner;

public class WaitingService {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        WaitingController controller = new WaitingController();

        for(;;){
            System.out.println("=========맛집 대기 시스템==========");
            System.out.println("1.대기등록 | 2. 대기현황");
            System.out.println("================================");
            System.out.print("선택>"); int ch = scan.nextInt();
            scan.nextLine();

            if(ch ==1 ){
                System.out.print("전화번호 : ");String phone=scan.nextLine();
                System.out.print("인원수 : "); int count=scan.nextInt();

               boolean result = controller.addWaiting(phone,count);
               if(result==true){
                   System.out.println("[안내]대기 등록이 완료되었습니다.");
               }
               else{
                   System.out.println("[경고]더 이상 대기 등록을 할 수 없습니다.");
               }
            }
            else if(ch==2){
                Waiting[] waitings = controller.getWaitingList();
                for(int i=0; i<waitings.length; i++){
                    if(waitings[i]!=null){
                        System.out.print("전화번호 : ");
                        System.out.println(waitings[i].phone);
                        System.out.print("인원수 : ");
                        System.out.println(waitings[i].count);
                    }
                }
            }
        }
    }


}
