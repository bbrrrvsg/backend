package DAY11;

import com.mysql.cj.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Exam3 {
    public static void main(String[] args) {
        // [JDBC] : 자바 데이터베이스 연동 라이브러리
        // jar 파일 준비
        // jar파일 폴더내에 넣어줌
        // jar파일 오른쪽클릭 하단에 라이브러리추가 프로젝트마다 1번

        // [연동1] Class.forName("패키지명.JDBC클래스명"); sql 회사마다 다르다 *일반예외 발생
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // 동적 할당  해당클래스가 존재하면 동적으로 객체생성
            //[연동2]
            String url ="jdbc:mysql://localhost:3306/mydb0205";
            String user="root";
            String password="1234";

            //[연동3] Connection(I) java.sql 패키지
            // DriverManager.getConnection(C) 구현(객)체 , *일반예외
            Connection connection = DriverManager.getConnection(url,user,password);
            System.out.println("연동 성공!!!!!!!!!!!!!!!!!!!!!!!!!!");
            
            //[연동 이후 DML(select insert update delete) 실행하기 
            String sql="insert into buy values(null,'BLK','지갑','가죽',30,10)";// 실행할 sql문법 문자열로 작성
            PreparedStatement ps =connection.prepareStatement(sql); //sql기재 
            int count = ps.executeUpdate(); // 실행후 반영된 레코드수 반환 
            System.out.println("count = " + count);
            
            
        }catch (ClassNotFoundException e){
            System.out.println("JDBC 클래스 호출 실패"); // 드라이버 클래스 연동 실패
        }catch (SQLException e){
            System.out.println("등록된 DB 서버로 연동 실패");
        }
    }
}
