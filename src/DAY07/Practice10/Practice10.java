package DAY07.Practice10;

public class Practice10 {
    public static void main(String[] args) {


        //1
        Member m = new Member();

        m.setId("admin");
        System.out.println(m.getId());

        //2
        Score s = new Score();
        s.setScore(65);
        System.out.println(s.getScore());
        s.setScore(165);
        System.out.println(s.getScore());

        //3
        BankAccount bk = new BankAccount("111-222");
        System.out.println("bk.getAccountNumber() = " + bk.getAccountNumber());

        //4
        CircleCalculator c = new CircleCalculator();
        System.out.println("c.printCircleArea(5) = " + c.printCircleArea(5));

        //5
        TicketMachine machine1 = new TicketMachine();
        machine1.issueTicket();
        machine1.issueTicket();
        TicketMachine machine2 = new TicketMachine();
        machine2.issueTicket();
        TicketMachine machine3 = new TicketMachine();

        TicketMachine.printTotalTickets();

        //6
        System.out.println("GameConfig.Max_Hp = " + GameConfig.Max_Hp);
        System.out.println("GameConfig.Max_Level = " + GameConfig.Max_Level);
        System.out.println("GameConfig.title = " + GameConfig.title);
    }
}
