package DAY02;

public class Exam1 {
    public static void main(String[] args) {

        // [1] 타입 = 자료형 = 분류 = 자료들을 분류 / 나누는 방법
        // (1) 자동 타입변환 (묵시적 : 개발자가 따로 할게 없다
        // byte -> short -> int -> long -> float -> double (작은상자 -> 큰상자 )
        byte byteValue = 10;
        short shortValue = byteValue;
        int intValue = shortValue;
        long longValue = intValue;
        float floatValue = longValue;
        double doubleValue = floatValue;

        // (2) 연산중(자동) 타입변환 ,
        // byte + byte = int , byte + short = int , int + int = int
        // int 이하의 피연산자들은 연산하면 int 로 결과
        // long / float / double 들은 피연산 중에 더큰 타입으로 결과
        byte b1 = 10; byte b2 = 20; short s1 = 30; int i1 = 40;
        long l1 = 50l; float f1 = 3.13f; double d1 = 41.21d;
        int result1 = b1 + b2; // byte + byte = int
        int result2 = b1+s1 ; // byte + short = int
        int result3 = i1+i1; // int + int = int
        long result4 = i1+l1; // int + long = long
        float result5 = f1+i1;// int+float = float
        double result6 = d1+ i1;// int + double = double

        // 캐스팅 하는이유 다형성

        //(3) 강제 타입 변환 /캐스팅 (명시적 : 개발자가 변환할 타입을 작성) ,손실 있다
        // double -> float -> long -> int -> short -> byte -> (큰상자 -> 작은상자)
        double dValue = 3.12;
        float fValue = (float)dValue; // (새로운타입)기존값
        long lValue = (long)fValue;
        int iValue = (int)lValue;
        short sValue = (short)iValue;
        byte bValue = (byte)sValue; // byte 에는 3자료가 들어있다. 손실발생







    } //main end
}// class end
