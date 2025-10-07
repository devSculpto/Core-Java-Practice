public class Revision5Oct {
//    public static void kadensAlgo(int []arr){
//        int cs = 0;
//        int ms = Integer.MIN_VALUE;
//        for(int i = 0; i < arr.length; i++){ // cs before adding: cs = 0,0,4,4,3,1,2,7
//            cs += arr[i]; // cs after adding: -2,-3,4,4-1=3,3-2=1,1+1=2,2+5=7,7-3=4
//            if(cs < 0) {
//                cs = 0;    // cs = 0,0
//            }
//            ms = Math.max(cs, ms); // ms = 0,0,4,4,4,4,7,7
//        }
//        System.out.println(ms);
//    }


//    public  static void maxSumOfSubArr(int []arr){
//        int ms = Integer.MIN_VALUE;
//        for(int start = 0; start < arr.length; start++){// 0 1 2 3 4
//            for(int end = arr.length - 1; end >= start; end--){// 4 3 2 1 0
//
//                int cs = 0;
//                for(int i = start; i <= end; i++) {
//                    System.out.print(arr[i] + " ");
//                    cs += arr[i];
//                }
//                System.out.println();
//                if(cs > ms){
//                    ms = cs;
//                }
//            }
//            System.out.println();
//        }
//        System.out.println("Max Sum : " + ms);
//    }

//    public static int binaruSearch(int []arr, int key){
//        int start = 0;
//        int end = arr.length - 1;
//
//        while(start <= end){
//            int mid = (start + end) / 2;
//            if(arr[mid] == key){
//                return mid;
//            }else if(key < arr[mid]){
//                end = mid -1;
//            } else {
//                start = mid +1;
//            }
//        }
//
//        return -1;
//    }

//    public static void bubbleSort(int []arr){
//        for(int turn = 1; turn < arr.length; turn++){
//            for(int i = 0; i < arr.length - turn; i++){
//                if(arr[i] > arr[i+1]){
//                    int temp = arr[i];
//                    arr[i] = arr[i+1];
//                    arr[i+1] = temp;
//                }
//            }
//        }
//        for(int e: arr){
//            System.out.println(e);
//        }
//    }

//    public static void selectionSort (int []arr){
//           for(int i = 0; i < arr.length -1; i++){
//               int minPos = i;//0 1 2 3
//               for(int j = i+1; j < arr.length; j++){
//                   if(arr[minPos] > arr[j]){
//                       minPos = j;
//                   }
//               }
//               int temp = arr[minPos];
//               arr[minPos] = arr[i];
//               arr[i] = temp;
//           }
//           for( int e: arr){
//               System.out.println(e);
//           }
//    }

    public static void maxSumOfSubArr(int []arr){
        int []pArr = new int[arr.length];
        pArr[0] = arr[0];//1
        for(int i = 1; i < pArr.length; i++){
               pArr[i] = pArr[i-1] + arr[i];
        }

        int ms = Integer.MIN_VALUE;

        for(int start = 0; start < pArr.length; start++){
           for(int end = start; end < pArr.length; end++){
               int cs = start == 0 ? pArr[end] : pArr[end] - pArr[start - 1];
               if(cs > ms) {
                   ms = cs;
               }
           }

        }
        System.out.println(ms);
    }
    public static void main(String[] args){
//        int [] arr = {-2,-3,4,-1,-2,1,5,-3};
//        int []arr = {1,2,6,11,3};
//        int []arr2 = {2,4,6,8,10};
//        kadensAlgo(arr);
//        maxSumOfSubArr(arr);
//        int index = binaruSearch(arr, 11);
//        System.out.println("Index of key : " + index);
//        int []arr = {45,67,43,23,20};
//        bubbleSort(arr);
//        selectionSort(arr);
        //prefix sum:
        int []arr = {1, -2, 6, -1, 3};
        maxSumOfSubArr(arr);


    }
}
