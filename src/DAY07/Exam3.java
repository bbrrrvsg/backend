package DAY07;

public class Exam3 {
    public static void main(String[] args) {

        //[1]멤버변수가 private 이면 다른 클래스 접근 불가능
        User user = new User();
        //User.name = "유재석"; 불가능
        //setter 이용한 멤버변수 접근(저장)
        user.setName("유재석");
        // getter를 이용한 멤버 변수 접근
        System.out.println(user.getName());

        //[2] toString
        System.out.println(user); //User(name="유재석" age=0;)












    }
}
class User{
    // 멤버 변수
    private String name;
    private  int age;
    // 생성자

    // 메소드

    //**관례적으로 private 멤버변수에 대해 간접접근 메소드 ++
    // getter 메소드 : 호출용
    public String getName(){
        return this.name;
    }
    // setter 메소드 : 저장용
    public void setName(String name){
        this.name = name;
    }
    // 자동 : alt+insert


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // toString() 메소드
    // 필수
    // 모든클래스가 자동으로 갖고 있는 메소드를

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
