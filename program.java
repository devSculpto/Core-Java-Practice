public class program {
    
    public static void occurenceOfNum(int []arr, int key){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == key) {
                count++;
            }
        }
        System.out.println("Count of " + key + " is " + count);
    }
    public static void updateArr( int[] arr, int index, int newElement) {
        arr[index] = newElement;
        for(int i : arr) {
            System.out.println(i);
        }
    }
    public static void replaceArr(int arr[],int oldVal, int newVal){
        for(int i = 0; i < arr.length;i++){
             if(arr[i] == oldVal) {
                arr[i] = newVal;
             }
        }
    }

    public static void swapArrEle(int []arr, int oldIdx, int newIdx) {
           int temp = arr[oldIdx];
           arr[oldIdx] = arr[newIdx];
           arr[newIdx] = temp;
    }

    public static void secondLargest(int arr[]) {
         int firstLarge = Integer.MIN_VALUE;
         int secondLargest = Integer.MIN_VALUE;
         for(int i = 0; i < arr.length;  i++){
            if(arr[i] > firstLarge) {
                secondLargest =  firstLarge;
                firstLarge = arr[i];
            }else if( arr[i] > secondLargest && arr[i] < firstLarge) {
                secondLargest = arr[i];
            }
         }
         System.out.println("Second Largest : " + secondLargest);
    }

    public static void count(int []arr) {
        int post = 0;
        int neg = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > 0) {
                post++;
            } else if(arr[i] < 0 ){
                neg++;
            }
        }
        System.out.println("Positive occurence : " + post);
         System.out.println("Negative occurence : " + neg);
    }

    public static void frequencyOfEle(int []arr){ 
       boolean []visited = new  boolean[arr.length];
       for(int i =  0 ; i < arr.length; i++){
        if(visited[i]) continue;
        int co = 1; 
        for(int j = i+1; j < arr.length; j++){
            if(arr[j] == arr[i]) {
                co++;
                visited[j] = true;
            }
        }
         System.out.println(arr[i] + " repeated " + co + " times");
       }
    }
    public static void count(int []arr, int factor){
            int co = 0;
       for(int i = 0; i < arr.length;i++){
    
        if(arr[i] > factor){
            co++;
        }
        
       }
       System.out.println("There are "+ co + " element greater than " + factor);
    }
    public static void reverseArr(int []arr){
        for(int i = 0; i < arr.length/2; i++){
            int temp = arr[i];// first ele, second ele
            arr[i] = arr[arr.length - i - 1]; // last ele,2nd last
            arr[arr.length - i - 1] = temp; ///first ele, seconed
        }
    }

    public static void reverseArr2ptr(int []arr){
         int left = 0;
         int right = arr.length- 1;
         while(left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
         }
    }
    public static void main(String [] args){
        //Count occurrences of a number :
        // int arr[] ={8,-4,1,2,9,-1,2,2,0,2};
        // occurenceOfNum(arr, 2);

        //Update element at specific index

        // updateArr(arr,4, 10);

        // Replace all occurrences of value : 
        // replaceArr(arr,2,3);
        // for(int i : arr) {
        //     System.out.println(i);
        // }
        //Swap two elements :
        // swapArrEle(arr, 0,arr.length-1);
        // for(int i : arr) {
        //     System.out.println(i);
        // }

        // secondLargest(arr);

        // ===============================================================
        //  Count positive and negative numbers :
        //  count(arr);
        // ----------------------------------------------
        // frequency of each element : 
        // int arr[] ={8,4,1,2,9,1,2,2,0,2};
        // frequencyOfEle(arr);
        // Count elements greater than X :
        // count(arr, 2);
        // Reverse array  :
        // Two pointers --> 
        int []arr = {1,2,3,4,5};
        reverseArr2ptr(arr);
        for(int i : arr){
            System.out.println(i);
        }
        // reverseArr(arr);
        // for(int i : arr){
        //     System.out.println(i);
        // }

        

       


    }
}
