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
        int arr1[]= {1,4,6,2,3,5};

        for(int i=0; i<arr1.length; i++){
            int min=i;

            for(int j=i+1; j<arr1.length; j++){
                if(arr1[j]<arr1[min]){
                    min = j;
                }
            }

            if(min != i){
                int temp = arr1[i];
                arr1[i] = arr1[min];
                arr1[min] = temp;

            }
        }



    }
}
