public class Revision3rdOct {

    static int binarySearch(int []arr, int key){
        int start = 0;
        int end = arr.length -1;
        while(start <= end){
            int mid = (start + end )/2;
            if(arr[mid] == key){
                return mid;
            }else if(key > arr[mid]){
                start = mid +1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
    static void pairsOfArr(int []arrs) {
        for(int i = 0;i < arrs.length; i++){//0
            for(int j = i+1; j < arrs.length; j++){//1,2,3
                System.out.print("(");
                System.out.print(arrs[i] + "," + arrs[j]);
                System.out.print(")");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void subArrays(int []arr){
        for(int i = 0; i < arr.length; i++){ //start
            for(int j = arr.length - 1; j >=0; j--){ //end
                for(int k = i; k <= j; k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    static void maxSum(int []arr){
        int ms = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            for(int j = arr.length -1; j >= 0; j--){
                int cs = 0;
                for(int k = i; k <= j; k++){
                    cs+= arr[k];
                }
                if(cs > ms){
                    ms = cs;
                }
            }
        }
        System.out.println("max sum :"+ ms);
    }
    static void kadanesAlgo(int []arr){
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for(int i = 0; i < arr.length; i++){
            cs += arr[i];
        }
        if(cs < 0){
            cs = 0;
        }
        ms = Math.max(cs, ms);
        System.out.println(ms);
    }
    public static void bubbleSort(int []arr){
        for(int turn = 0; turn < arr.length -1; turn++){
            for(int j = 0; j < arr.length - 1 - turn; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static void selection(int []arr){
        for(int i =0; i < arr.length; i++){
            int minPos = i;
         for(int j = i +1; j < arr.length; j++){
             if(arr[minPos] > arr[j]){
                 minPos = j;
             }
         }
         int temp = arr[minPos];
         arr[minPos] = arr[i];
         arr[i] = temp;

        }
        for(int j = 0; j < arr.length; j++){
            System.out.print(arr[j] +" ");
        }

    }
     public static void main(String []args){
//       int marks [] = {12, 13, 15,16,89,100};
//       int index = binarySearch(marks, 89);
//        System.out.println(index);

//        pairsOfArr(marks);
//         subArrays(marks);
//         int []jari= {1, -2, 6, -1, 3};
//         maxSum(jari);
//         kadanesAlgo(jari);
//         int []marks = {5, 4, 3, 2, 1};
//         bubbleSort(marks);
//         selection(marks);



    }
}
