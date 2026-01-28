package DAY07.Exam1.Practice10;

public class TicketMachine {

    static int totalTickets =0;

    void issueTicket(){
        totalTickets++;
        System.out.println("티켓한장을 발권했습니다.");
    }

    static void printTotalTickets(){
        System.out.println("totalTickets = " + totalTickets);
    }


}
