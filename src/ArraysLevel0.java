import java.util.Arrays;
import java.util.Collections;

public class ArraysLevel0 {

//    public static void printArr(int []arr) {
////        For loop :
//        for(int i = 0; i < arr.length; i++){
//            System.out.println(arr[i]);
//        }
//
////        while loop :
//        int i = 0;
//        do {
//            System.out.println(arr[i]);
//            i++;
//        } while( i < arr.length);
//
////        while loop :
////        int i = 0;
////        while (i < arr.length){
////            System.out.println(arr[i]);
////            i++;
////        }
//
////        for eachloop:
//        for(int e: arr){
//            System.out.println(e);
//        }
//
////        toString method :
//        System.out.println(Arrays.toString(arr));
//    }

    public static void maxEle(int []arr) {
        int max = Integer.MIN_VALUE; // - infinity
//        int max = arr[0]; //assumed max element
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Max Element of an Arrays : "+ max);
    } public static void minEle(int []arr) {
        int min = Integer.MAX_VALUE; // + infinity
//        int min = arr[0]; //assumed max element
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Min Element of an Arrays : "+ min);
    }
    public static void sumOfEle(int []arr) {
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum+= arr[i];
        }
        System.out.println("Sum of All elements of an Arrays :" + sum);
    }
    public static int linearSearch(int []arr, int key)  {
     for(int i = 0; i < arr.length; i++){
         if(arr[i] == key) {
             return i;
         }

     }
        return  -1;
    }
    public static void avg_of_Arr_Elements(int []arr) {
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum+= arr[i];
        }
        int avg = (sum)/(arr.length);
        System.out.println("Avg values of an Arrays :" + avg);
    }
    public static int binarySearch(int []arr,int key) {
        int start = 0;
        int end = arr.length -1;
        while(start <= end){
            int mid = (start + end)/2;
            if(key == arr[mid]) {
                return mid;
            } else if(key < arr[mid]){
                end = mid - 1;
            } else {
                start = mid +1;
            }
        }
        return -1;
    }

    public static void reverseArr(int []arr) {
        int revArr[] = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            revArr[i] = arr[arr.length - 1 - i];
        }
        System.out.println("Printing Reverse Elements of an Arrays : ");
        for(int e : revArr){
            System.out.println(e);
        }

    }
    // TC : O(n), SC :  O(n)
    // conclusion : Not changed the original Arrays

    public static void reverseArr1(int[] arr) {
        int start = 0;
        int end = arr.length -1;
        while(start < end){
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start]= temp;
            start++;
            end--;
        }

    }
    // TC : O(n), SC :  O(1)
    //changed the original Arrays

public static void reverseArr2(Integer[] arr) {
    Arrays.asList(arr);
    Collections.reverse(Arrays.asList(arr));
}






    public static void main(String [] args) {
        int []arr = {8,4,1,2,9,1,2,2,0,2};
//        printArr(arr);
//        maxEle(arr);
//        minEle(arr);
//        sumOfEle(arr);
//        int index = linearSearch(arr, 9);
//        System.out.println("The index of key element : "+ index);
//        avg_of_Arr_Elements(arr);
//        -------------------------------------------------------------------------------------------------------------------
//        int []arr = {0,1,1,2,2,2,2,4,8,9};
//        int index = binarySearch(arr, 8); // key = first occurence of key
//        if(index == -1) {
//            System.out.println("Element Not found!");
//        } else {
//            System.out.println("Index of the key :"+ index);
//        }
        //conclusion : It is correct for the distinct elements of an Arrays,but not for dupplicate elements
        //  i.e if duplicate element found at mid even the index of element of first occurence is less then mid
        // it will return mid index only.
//        ----------------------------------------------------------------------------------------------------------------
//        Reverse using a for loop and new array -->
//        reverseArr(arr);
//        Reverse using a for loop (two-pointer method) -->
//        reverseArr1(arr);
//        for(int e : arr){ // proof of reversed the Og arrays
//            System.out.println(e);
//        }
        Integer[] arr1 = {45,5676,8,99,8}; //use Interger
        reverseArr2(arr1);
        for(int e : arr1){
            System.out.println(e);
        }




    }

}
