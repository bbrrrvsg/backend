package On;

public class Sort {
    public static void main(String[] args) {
        int arr[]= {1,4,6,2,3,5};


        // 버블 정렬 : 옆에 있는 두 값을 비교
        // O(n^2)
        for(int i = 0; i<arr.length;i++){
            for(int j=0;j<arr.length-i;j++){ // 정렬 후 제일 큰 값이 마지막에 와서 마지막인덱스 버림
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        // 선택정렬 : 가장 작은 값을 선택해서 앞에 둠
        // o(n^2)

    }
}
