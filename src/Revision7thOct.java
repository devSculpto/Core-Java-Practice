public class Revision7thOct {
//    Normal Code :
//public static void bubbleSort(int []arr) {
//    int pass = 0;
//    int swapped = 0;
//        for(int turn = 0; turn < arr.length - 1; turn++){//0 1 2 3
//            for(int i = 0; i < arr.length -1-turn; i++){
//                if(arr[i] > arr[i+1]){
//                    int temp = arr[i];
//                    arr[i] = arr[i+1];
//                    arr[i+1] = temp;
//                    swapped++;
//                }
//            }
//            pass++;
//        }
//        for(int e : arr){
//            System.out.println(e);
//        }
//
//    System.out.println("Total pass : "+ pass + " Total Swapped : "+ swapped);
//
//    }

public static void bubbleSort(int []arr) {
       int pass = 0; int swapCount=0;
       for(int turn = 0; turn < arr.length - 1; turn++){//0 1 2 3
           boolean swapped = false;
           for(int i = 0; i < arr.length -1-turn; i++){
               if(arr[i] > arr[i+1]){
                   int temp = arr[i];
                   arr[i] = arr[i+1];
                   arr[i+1] = temp;
                   swapped = true;
                   swapCount++;
               }
           }
           if(swapped == false){
               break;
           }
           pass++;
           System.out.println("passed happed for "+turn);
       }
       for(int e : arr){
           System.out.println(e);
       }
       System.out.println("Total pass : "+ pass + " Total Swapped : "+ swapCount);

   }

   public static void selectionSort(int []arr) {
       for(int turn = 0; turn < arr.length - 1; turn++){
           int minPos = turn; // 0 ;
           for(int i = turn+1; i < arr.length; i++){
               if(arr[minPos] > arr[i]){
                   minPos = i;
               }
           }
           int temp = arr[turn];
           arr[turn] = arr[minPos];
           arr[minPos] = temp;
           System.out.println("Swapped "+arr[turn] + " and " + arr[minPos]);
       }
       for(int e : arr){
           System.out.println(e);
       }

   }

   public static void insertionSort(int []arr) {
       for(int turn = 0; turn < arr.length; turn++){// turn = 0
               int i = turn + 1;// i = 1 2
               int temp;
               int sortIdx = turn;// 0 1
               temp = arr[i]; // temp = 4,3
               if(arr[sortIdx] > temp){// 5 > 4 (Y), 5 > 3(Y),
                   while(i < arr.length) {
//                       arr[i-1] = temp;// arr[0] = 4,arr[1] = 3
                       arr[sortIdx+1] = arr[sortIdx]; // arr[1] = 5,arr[2] = 4
                       i++;
                       sortIdx--;
                   }
           }
           for(int e : arr){
               System.out.println(e);
           }
       }
   }

   public static void reverseArr(int []arr) {
    int temp = arr[0];
    int len = arr.length;
    for(int i = 0; i < len; i++){//even arrays , i = 0 1
        arr[i] = arr[len - i - 1]; // 0 = 0
    }
   }

 public static void main(String [] args) {
        int [] arr = {5,4,3,2,1,0};


        reverseArr(arr);
//        insertionSort(arr);
        //5       4  3 2 1
        //4 5     3 2 1
        //4 5     3  2 1







//      8,5,7,1,4 -- Og
        //5 7 1 4 8 // pass = 0
        //5 1 4 7 8 // pass = 1
        //1 4 5 7 8 // pass = 2
//        bubbleSort(arr);

//        selectionSort(arr);
//        8,5,7,1,4 -- Og
//        1 5 7 8 4
//        1 4 7 8 5
//        1 4 5 8 7
//        1 4 5 7 8



    }
}
