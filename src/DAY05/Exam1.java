package DAY05;

import java.util.Arrays;

public class Exam1 {

    public static void main(String[] args) {
        //[1] 배열이란? *동일한타입*의 여러 자료들을 순서대로 저장하는 자료타입
        //[2] 선언 : 타입[] 변수명 = new 타입[총 개수];
        //[3] 특징 : (1) 동일한타입끼리 (2) 고정길이 (3) 요소의 초기값 존재
        //[4[ 인덱스이란? 배열내 요소(값)들이 저장된 순서 번호 , 0번 시작
        int[] arr1 = new int[3]; // {0,0,0}

        String[] arr2 = {"봄","여름","겨울","가을"};

        //[5] 배열변수명의 출력
        System.out.println(arr1);//[I@4c873330 : 배열의 주소(메모리위치)출력 * 주소값은 개발자가 제어 불가능
        System.out.println(arr2);//[Ljava.lang.String;@119d7047

        //[6] 배열변수의 요소/값 전체 출력 , Arrays.toString(배열변수명)
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

    //[*] 배열의 메모리 주소 상태 간단 구조
    /*
    * 1. new int[3] 선언하면 int[4바이트] , int[4바이트] , int[4바이트]
    * 2. 총 4바이트 * 3 => 12바이트 생성한다,
    * 3. 컴퓨터는 최소의 (윈도우)저장단위를 바이트(위치/주소값)
    *       -> 12개의 주소값 생성
    * 4. 배열의 변수는 총 12 개의 주소값을 가진게 아니고 가장 첫번째의 주소값을 가진다.
    *   int arr1 = new int[3];
    *   arr1 = 101번지 : 첫번째 요소의 주소값이 들어 있다.
    *   하나를 알면 동일한 타입이면 만약 int면 4바이트 이니까 4칸씩 점프하면 다음 인덱스를 알수 잇음
    *   -> 그래서 무조건 동일한 타입이여야 점프가능
    *
    * 5. 실행중에 개발자가 배열내 주소값 삭제할 수 없다. vs js는 delete대신 splice
    * 6. 주소값의 초기값이 생략되면 임의의 초기값을 자동으로 들어간다. < gc:가비지컬렉터 > 비어있는 메모리 삭제하기때문
    *   정수 : 0 , 실수 : 0.0 , 문자열/객체 : null , 논리 : false  // 0 vs null vs  초기값없는(undfined)
    * */

        // [7]  배열 사용
        System.out.println(arr1.length);

        // [8] 배열내 요소값 수정
        arr1[0]=10;
        System.out.println(arr1[0]); // 배열변수명[인덱스]

        //[9] 배열의 요소 추가/삭제 없다.
        arr1[4] = 40; // java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 3

        //[10] 반복문 활용
        for(int index =0; index<= arr1.length; index++){
            System.out.println(arr1[index]);
        }//for end

        //[11] 향상된 for문 : 위와 같이 많이 사용 되므로 추가된 반복문
//        for( 타입 반복변수 : 배열변수명)  , iterator(이터레이터/반복자/순회자) 가 가능한 배열/객체 만 사용 가능
        for(int value : arr1){
            System.out.println(value);
        }

    }
}
