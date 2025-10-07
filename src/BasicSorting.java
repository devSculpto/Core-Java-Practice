import java.util.Arrays;
import java.util.Collections;
public class BasicSorting {

    public static void bubbleSort(int arr[]){
        int n = arr.length;
        for(int turn = 0; turn < n; turn++){// 0 1 2 3
            for(int j = 0; j < n -1- turn; j++){//0 1 2 3,0 1 2, 0 1, 0
                if(arr[j] > arr[j + 1]){
                    //swap  :
                  int temp = arr[j];
                  arr[j] = arr[j + 1];
                  arr[j + 1] = temp;
                }
            }
        }
        //printing arrays :
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }
    public static void selectionSort(int []arr){

        for(int i = 0; i < arr.length -1; i++){

            int minPos = i;
            for(int j = i+1; j < arr.length; j++){
                if(arr[minPos] > arr[j]) {
                    minPos = j;
                }
            }
            //swap :
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i]= temp;
        }
//        System.out.println(min);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    //conclusion : Need revision
//    --------------3 October 2025 ---------------------
    static void insertionSort(int []arr){
        for(int i = 0; i < arr.length- 1; i++){
            int curr = arr[i] ;
            int prev = i - 1;
            //finding out correct position to insert :
            while(prev >= 0 && arr[prev] > curr){
                arr[prev + 1] = arr[prev];
                prev--;
            }
            //insertion :
            arr[prev + 1] = curr;

        }
        for(int  i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    //conclusion : TC O(n2)
//    ---------------------------------
    public static void countingSort(int arr[]){
        int largest = Integer.MIN_VALUE;

        // 1. find largest element
        for(int i = 0; i < arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }

        // 2. create count array of size (largest + 1)
        int []count = new int[largest + 1];

        // 3. store frequency of each element
        for(int i = 0; i < arr.length; i++){
            count[arr[i]]++;
        }

        // 4. sort
        int j = 0;
        for(int i = 0; i < count.length; i++){
            while(count[i] > 0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }

        // 5. print sorted array
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String []args) {

//        int marks[] = {5, 4, 1, 3, 2};
//        bubbleSort(marks);
//          selectionSort(marks);
//        ---------------3 October 2025 ---------------------->
//        int []arr = {100, 4,5,89, 45,3,2,1};
//        Integer []arr = {1, 4,5,89, 45,3,100,1};//an object of an Integer class
//        insertionSort(arr);
//        Arrays.sort(arr, 1,arr.length -1);

//        Arrays.sort(arr,1,arr.length - 1,Collections.reverseOrder());
//        for(int  i = 0; i < arr.length; i++){
//            System.out.println(arr[i]);
//        }
//        ------------Counting sort -------->
        int []arr = {100, 4,5,89, 45,3,2,1};
        countingSort(arr);

    }
}
