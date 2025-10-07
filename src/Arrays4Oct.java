import java.util.Arrays;
import java.util.Collections;
public class Arrays4Oct {
public static void bubbleSort(int []arr){
    for(int turn = 0; turn < arr.length- 1; turn++){
        for(int i = 0; i < arr.length - 1 - turn; i++){
            if(arr[i +1] < arr[i]) {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i + 1] = temp;
            }
        }
    }
    for(int ele : arr){
        System.out.printf(ele + " ");
    }
}
    public static void main(String []args){
        int []arr = {5,1,3,2,4};
//        Integer []arr = {5,1,3,2,4};
        bubbleSort(arr);
//        selectionSort(arr);
//        Arrays.sort(arr);
//        Arrays.sort(arr,Collections.reverseOrder());
//        for(int ele : arr){
//            System.out.print(ele + " ");
//        }

    }
}
