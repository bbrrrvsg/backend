package DAY10;

public class Tool implements TEST{

    // 해당 인터페이스를 구현한다. <- 오버라이딩[필수] 한다.
    @Override
    public void method(){
        System.out.println("해당 메소드 구현");
    }

    @Override
    public void method2(int x){
        System.out.println("해당 메소드 구련"+x);
    }

}
