package DAY14;

public class Practice16 {
    public static void main(String[] args) {

        DeliveryTask deliveryTask = new DeliveryTask();
        Thread thread1 = new Thread(deliveryTask);
        thread1.start();

        // main
            for (int i = 1; i <= 3; i++) {
                System.out.println("[메인]주문 화면 갱신" + i);
            }
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }


    }
}
class DeliveryTask implements Runnable{
    @Override
    public void run() {

            for (int i = 1; i <= 3; i++) {
                System.out.println("[배달기사]이동중" + i);
            }
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }

    }
}