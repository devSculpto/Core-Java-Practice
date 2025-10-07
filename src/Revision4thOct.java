import java.util.Arrays;
import java.util.Collections;
public class Revision4thOct {
    static int binarySearch(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;  // middle index

            if (arr[mid] == key) {
                return mid; // element found
            } else if (key > arr[mid]) {
                start = mid + 1; // search right half
            } else {
                end = mid - 1; // search left half
            }
        }
        return -1; // element not found
    }
    //only for sorted Arrays
    static void subArr(int []arr){
        for(int i = 0; i < arr.length; i++){
            for(int j =i; j < arr.length; j++){
                for(int k = i; k <=j; k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    static void maxSumOfSubbArr(int []arr){

        int ms = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length;j++){
                int cs = 0;
                for(int k =i; k <= j; k++){
                    cs+= arr[k];
                }
                if(cs > ms){
                    ms = cs;
                }
            }
        }
        System.out.println(ms);
    }
    static void pairsOfArr(int []arr){
        for(int i = 0;  i < arr.length; i++){

            for(int j = i+1; j <arr.length; j++){
                System.out.print("(");
                System.out.print(arr[i] +" "+ arr[j]);
                System.out.print(")");
            }
            System.out.println();

        }
        System.out.println();
    }

    static void kadanesAlgo(int []arr){
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            cs += arr[i];//cs = 1,1-2=-1,6-1=5,5-1=4,3+4=7
        }
        if(cs < 0){
            cs = 0; //
        }
        ms = Math.max(cs, ms); // ms = 1,1,5,5,7

        System.out.println(ms);


    }
//------------------ Sorting ----------------------
    static void bubbleSort(int []arr){
        int n = arr.length;
        for(int turn = 0; turn < n - 1; turn++){ // turnMax = 0 to n - 1 times
           for(int i = 0; i < n - 1; i++){ // 0 to n - 2 times
                   if(arr[i] > arr[i+1]){
                       //Swap :
                       int temp =  arr[i+1];
                       arr[i+1] = arr[i];
                       arr[i] = temp;
               }
           }
        }
       for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    static void selectionSort(int []arr){
        for(int i = 0; i < arr.length - 1; i++){
            int minPos = i;
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    minPos = j;
                }
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }

//static void insertionSort(int []arr){
//        for(int i = 0; i < arr.length; i++){
//            int curr = arr[i];
//            int prev = i - 1;
//            while( prev >= 0 && ){
//
//            }
//        }
//}
    public static void main(String []args){
        //        ----------------- Sorting -----------------------
        int [] arr = {1, 4, 3 , 2, 5};
//        Integer [] arr = {1, 4, 3 , 2, 5};
//        bubbleSort(arr);
//        selectionSort(arr);
//        insertionSort(arr);

//        Arrays.sort(arr,Collections.reverseOrder());
//        for(int i =0; i < arr.length; i++){
//            System.out.print(arr[i]+ " ");
//        }
//
















//        int []marks = {2,4,6,8,10};
//        int key = 232;
//        int idx = binarySearch(marks, key);
//        System.out.println(idx);

//        subArr(marks);
//        int []reading  = {1, -2, 6, -1, 3};
//        maxSumOfSubbArr(reading);

//        pairsOfArr(marks);
//        kadanesAlgo(reading);
//        -----------------


    }
}
