package 종합.종합예제5;

public class BoardController {

    //[1] private : 외부접근 차단 , static : 우선할당(객체없이) , final(수정금지) :  board = x , boards[o]= ok
    private static final Board[] boards = new Board[100];


    //[2] 기능1 : 저장 기능
    public static boolean doPost(String content,String writer){

        Board board = new Board(content,writer);// 1. 생성자를 이용한 객체생성

        //2.
        for(int i=0; i<boards.length; i++){
            if(boards[i]==null){
                boards[i]=board;
                return true;
            }
        }//for end
        return false; // 실패시 false

    }

    //[3] 기능2 : 조회 기능 , boards 리턴 하므로 반환타입은 boards의 타입인 Board[]
    public static Board[] doget(){
        return boards;
    }








}//class end
