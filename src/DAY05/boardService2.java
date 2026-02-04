package DAY05;

import java.util.Scanner;

public class boardService2 {
    public static void main(String[] args) {


        //[1] 메모리 설계 , 1) 2개 정보를 가진 게시물이 3개이면 변수는 총 6개 갖는다.
        //2) 2개 정보를 가진 게시물이 100개이면 변수는 총 200개 갖는다 . --> 관리 어렵기 때문에 --> 배열사용

        String[] contents = new String[100];
        String[] writers = new String[100];

        //[2] 무한루프
        for( ; ; ){
            System.out.println("=========My Community==========");
            System.out.println("1.쓰기 2. 출력");
            System.out.println("==============================");
            Scanner sc = new Scanner(System.in);
            int ch = sc.nextInt();sc.nextLine();

            if(ch ==1 ){
                System.out.print("내용 : "); String content = sc.nextLine();
                System.out.print("작성자 : "); String writer = sc.nextLine();
                boolean save = false;
                for(int i=0; i<= contents.length-1; i++){
                    if(contents[i]==null&&writers[i]==null){
                        contents[i] = content; writers[i]=writer;
                        save=true; break;
                    }//if end

                }//for end
                if(save ==true){
                    System.out.println("글쓰기 성공");
                }
                else{
                    System.out.println("글쓰기 공간 부족");
                }
            }//if end
            else if(ch ==2 ){
                for(int i=0; i<contents.length; i++){
                    if(contents[i]!=null&&writers[i]!=null){
                        System.out.printf("작성자 : %s , 내용 : %s \n",contents[i],writers[i]);
                    }

                }// for end
            } // else if end
        }// for end

    } // main end
} // class end
