package DAY11;

public class Exam2 {

    // 메소드1 throws 예외클래스명  : 해당 메소드에서 예외 발생시 메소드 호출 헀던 곳으로 예외전달
    public static void method1() throws NullPointerException{
        String name =null;
        System.out.println(name.length()); // 예외
    }
    
    // 2
    public static void method2() throws ClassNotFoundException{
        Class.forName("java.lang.String3");
    }
    public static void main(String[] args) {

        // 예외처리 : try catch
        // 예외던지기 : throws
        // 1)
        try{
            method1();
        }catch (NullPointerException e){
            System.out.println("e = " + e);
        }

        try{
            method2();
        }catch (ClassNotFoundException e){
            System.out.println("e = " + e);
        }
    }
}
