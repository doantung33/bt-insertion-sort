public class InsertionSort {
    void sort(int[]arr){
        for (int i = 1; i < arr.length; i++) {
            int key= arr[i];
            int j=i-1;
            while (j>=0&& arr[j]>key ){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;

        }
    }
    static void printArr(int[]arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        InsertionSort insertionSort= new InsertionSort();
        int []arr={3,5,1,8,4};
        System.out.println("mảng ban đầu");
        printArr(arr);
        insertionSort.sort(arr);
        System.out.println("mảng sau khi sắp xếp");
        printArr(arr);
    }
}
