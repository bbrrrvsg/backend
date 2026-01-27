package DAY06.종합.종합예제4;

public class BoardController {

    Board[] boards = new Board[100];

    boolean doPost(String writer , String content){
        Board board = new Board();
        board.writer=writer;
        board.content=content;

        for(int i=0; i<boards.length; i++){
            if(boards[i]==null){
                boards[i]=board;
                return true;
            }
        }
        return false;
    }

    Board[] doGet(){
        return boards;
    }

}
