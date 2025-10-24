import java.util.*;
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

    public static void rotationRight(int []arr, int k){
        int n = arr.length;
        int []newArr = new int[n];
        int j = 0;
        for(int i = n - k; i < n; i++){
            newArr[j] = arr[i];  // 0 1 2 filled,3 4 5 6 empty  
            j++; 
        }
        for(int i = 0; i < n - k; i++){
            newArr[j] = arr[i];
            j++;
        }
    } 
    public static void rotationLeft(int []arr, int k){
        int n = arr.length;
        int []newArr = new int[n];
        int j = 0;
        for(int i = k; i < arr.length; i++){
            newArr[j] = arr[i];
            j++;
        }

        for(int i = 0 ; i < k; i++){
            newArr[j] = arr[i];
            j++;
        }

        for(int e : newArr) {
            System.out.println(e);
        }
    }
    public static void zeroToEnd(int []arr) {
        int []newArr = new int[arr.length]; //8,4,0,1,1,0,0,5,3
        int j = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0) continue;
            newArr[j] = arr[i];//8,4,1,1,5,3    0 0 0
            j++; // j = 6
        }
        for(int k = j; k < newArr.length; k++){
                newArr[k] = 0;
        }
        for(int e : newArr) {
            System.out.println(e);
        }

    }

    public static void separation(int []arr){

        int []newArr = new int[arr.length];
        int j = 0;
        for(int i = 0 ; i < arr.length; i++){
            if(arr[i] > 0) {
             newArr[j] = arr[i];
             j++;
            }
        }
        for(int i = 0 ; i < arr.length; i++){
            if(arr[i] < 0) {
             newArr[j] = arr[i];
             j++;
            }
        }
        for(int e : newArr) {
            System.out.println(e);
        }
    }

    // public static void isSorted(int []arr){
    //     boolean isSort = true;
    //     for(int i = 0; i < arr.length - 1; i++){
    //         if(arr[i] > arr[i+1]) {
    //             isSort = false;
    //             break;
    //         }
    //     }
    //     if(isSort) {
    //         System.out.println("Sorted");
    //     } else {
    //         System.out.println("Not Sorted");
    //     }
    // }

    //more better version : 
    public static boolean isSorted(int []arr) {
        for(int i =  0; i < arr.length-1; i++){
            if(arr[i] > arr[i+1]) return false;
        }
        return true;
    }
    public static void missinNum(int []arr) {
        int currSum = 0;
        int N = arr[arr.length - 1];
        int totalSum = (N * (N + 1)) / 2;
        for(int i = 0; i < arr.length; i++){
            currSum += arr[i];
        }

        int missing = totalSum - currSum;
        System.out.println("Missing Number is :" + missing);
    }

        public static void rmvDuplicate(int []arr) { //1,2,3,3,4
            boolean []isDuplicate = new boolean[arr.length];
            for( int i = 0; i < arr.length; i++){
                for(int j = i+1; j < arr.length; j++){
                    if(arr[i] == arr[j]) isDuplicate[j] = true;
                }
            } 
            for(int i = 0; i < arr.length; i++){
                if(isDuplicate[i]) continue;
                System.out.println(arr[i]);
            }
            
        }
        // TC : O(n2)
        // SC : O(n)
        //In-eficient since it will iterate all element even though they are 
        // unique,since i am practicing with some challenge i.e solving only 
        // loop and if else 

        public static void mergeSortedArr(int []arr1, int []arr2) {
            int []newArr = new int[arr1.length + arr2.length];
            int i = 0;
            int j = 0;
            int small = Integer.MAX_VALUE;
            for(int k = 0; k < newArr.length; k++){
                 if(arr1[i] < small || arr2[i] < small){

                 }
            }

            
        }

        public static void pairofNum(int []arr, int target) {
            for(int i = 0; i < arr.length; i++){
                for(int j = i+1; j < arr.length; j++){
                    if(arr[i] + arr[j] == target) {
                        System.out.println("index of numbers :"+ i + " and "+ j);
                        return; // it will exit whole funtion after 
                        // got first pairs 
                    }
                }
            }
        }
        //TC : O(n2) (loops inside a loop)
        //SC : 0(1) constant space 

        // public static void pairsofNumMaxSum(int []arr){ //1,-4,7,8,10
        //     int maxSum = Integer.MIN_VALUE;
        //     for(int i = 0; i < arr.length; i++){//1
        //         int currSum = 0;
        //         for(int j = i+1; j < arr.length; j++){ //-4
        //               currSum+= (arr[i] + arr[j]); //-3,
        //               System.out.println(currSum);
        //           }
        //              if(currSum > maxSum) {
        //                 maxSum = currSum;//-3
        //               }
        //     }
        //     System.out.println("Max sum of two numbers :"+ maxSum);
        // }

        //remaining 

        public static void kadanesAlgo(int []arr){
            int cs = 0;
            int ms = Integer.MIN_VALUE;
            for(int i = 0; i < arr.length; i++){
                cs+= arr[i]; //-2,-3, 4, 4-1=3,3-2=1,1+1=2,2+5=7,7-3=4
                if(cs < 0) {
                    cs = 0; 
                }
                  ms = Math.max(cs, ms);
            }
            System.out.println("max :"+ ms);
    }

    public static void maxSumArrSum(int []arr) {
        int ms = Integer.MIN_VALUE;
        int x = 0;
        int y = 0;
        for(int i = 0; i < arr.length; i++){// 2
            for(int j = i; j < arr.length; j++){ //2 4 6 8 10
                int cs = 0;
                for(int k = i; k <=j; k++){
                    System.out.print(arr[k]+" ");
                    cs+= arr[k];
                }
                // System.out.println("--> cs :"+ cs);
                if(cs > ms ) {
                    x = i;
                    y = j;
                    ms = cs;
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Max sum of a subarray :" + ms);
        System.out.println("Subarray :");
        for(int i = x; i <= y; i++){
            System.out.print(arr[i]+ " ");
        }
    }


    public static void printSubArr(int []arr) {
           for(int i = 0; i < arr.length; i++) {
            for(int j = i; j < arr.length; j++){
                for(int k= i; k <= j; k++){
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
           }
    }

    public static void pairsOfArrays(int []arr){
            for(int i = 0; i < arr.length; i++){
                for(int j = i+1; j < arr.length; j++){
                    System.out.println(arr[i]+ " " + arr[j]);
                }
                System.out.println();
            }
    }  
    public static void pairSum(int []arr, int target){
         for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] + arr[j] == target) {
                    System.out.println(arr[i] + " " + arr[j]);
                    return;
                }
            }
        }
    }

    // public static void isPalindromArr(int []arr) {
    //     boolean isPalin = true;
    //    for(int i = 0; i < arr.length/2; i++){
    //     if(arr[i] != arr[arr.length - 1 - i]) {
    //                isPalin = false;
    //                break;
    //     }
    //    }
    //    if(isPalin) {
    //     System.out.println("Arr is Palindrom!");
    //    } else {
    //      System.out.println("Arr is not a Palindrom!");
    //    }
    // }

        public static void linearSearch(int []arr, int target) {
        int j = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target) {
                j = i;
                break;
            }
        }
        System.out.println("Target found at "+ j + " index");
    }
    public static void secondLargest1(int []arr) {
        int firstLarge = Integer.MIN_VALUE;
        int secondLarge = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > firstLarge) {
                firstLarge = arr[i];
            }
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > secondLarge && arr[i] != firstLarge) {
                secondLarge = arr[i];
            }
        }
        System.out.println("First large "+ firstLarge);
        System.out.println("Second large "+ secondLarge);
    } 
    // not the best but good for beginners
    //Conclusion : TC : O(2n) since only 1 loop has used
    // SC: O(1) since no extra space/memory used 
    public static void secondLargest2(int []arr) {
        int firstLarge = Integer.MIN_VALUE;
        int secondLarge = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > firstLarge) {
                secondLarge = firstLarge;
                firstLarge = arr[i];
            } else if(arr[i] > secondLarge && arr[i] < firstLarge) {
                secondLarge = arr[i];
            }
        }
        System.out.println("First large "+ firstLarge);
        System.out.println("Second large "+ secondLarge);
    }
    //More better version 
    //Conclusion : TC : O(2n) since, 2 loop has used
    // SC: O(1) since no extra space/memory used 

    // public static void reverseArr(int []arr) {
    //     int left = 0; 
    //     int right = arr.length-1;
    //     while(left < right) {
    //         int temp = arr[left];
    //         arr[left] = arr[right];
    //         arr[right] =temp;
    //         left++;
    //         right--;

    //     }
    // }
    // public static void rotateArr(int []nums,int k){
    //     int n = nums.length;
    //     k = k % n; //normalize k
    //     for(int m = 1; m <= k; m++){
    //         int temp = nums[n-1];//kept last ele stored
    //         for(int i = 0; i < n-1; i++){//shift to position right 
    //         nums[ (n-1) - i] = nums[ (n -1)  - (i+1)];
    //         }
    //         nums[0] = temp;
    //     }
        
    // }
    //conclusion : it tool almost 30 minutes but finally
    // i have made ,even though it is worst algo,
    //i am gratefull that alteast i did it by my self

    public static void rotateArr(int []nums, int k){
        int n = nums.length;
        int []newArr = new int[n];
        k = k % n;
        int j = 0;
        for(int i = n - k; i < n; i++) {
            newArr[j]= nums[i];//0 1 = 4 5
            j++;
        }

        for(int i = 0; i < n - k; i++) {
            newArr[j]= nums[i];// 2 3 4 =  1 2 3
            j++;
        }
        for(int b= 0; b < newArr.length; b++){
            nums[b] = newArr[b];
        }
        for( int b : nums) {
            System.out.println(b);
        } 
}

//conclusion : stills better version of previos since change take place 
// in og arrays , and accepted submisison on leetcode
    
// -------------------------------------------------------------------------------------------
  public static boolean isPalindromeNum(int num) {
        int reverseHalf = 0;
        if(num < 0 ||(num != 0 && num % 10 == 0)) return false;
             while(reverseHalf < num) {
                int lastDigit = num % 10;
                num = num / 10;
                reverseHalf = (reverseHalf * 10) + lastDigit;
             }
        return reverseHalf == num || (num == reverseHalf / 10);
    }



    public static int removeUniqueEle(int []arr, int target) {
        int j = 0;
            for(int i = 0; i < arr.length; i++){
                if(arr[i] != target) {
                    arr[j] = arr[i];
                    j++;
                }
            }
        return j;
    }


    public static String longestCommonPrefix(String[] strs) { // String []strs = {"flow  er","flow","flig  ht"};
        int minLen = Integer.MAX_VALUE;
        for(int i = 0; i < strs.length; i++){
            if(strs[i].length() < minLen) {
                minLen = strs[i].length();
            }
        }
    
        String commonStr = "";

        //correct til here 
        for(int k = 1; k <strs.length; k++){
            boolean allMatch = false; 
            int l = 0;
             for(l = 0; l < minLen; l++){
                if(strs[0].charAt(l) == strs[k].charAt(l)){
                allMatch = true;

                }
                
             }
             if(allMatch) {
                      commonStr += strs[0].charAt(l);
                }
            }
        System.out.println(commonStr);
        return commonStr;
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
        // ----------------------------------------------
        // Count elements greater than X :
        // count(arr, 2);
        // ----------------------------------------------
        // Reverse array  :
        // Two pointers --> 
        // int []arr = {1,2,3,4,5};
        // reverseArr2ptr(arr);
        // for(int i : arr){
        //     System.out.println(i);
        // }
        // reverseArr(arr);
        // for(int i : arr){
        //     System.out.println(i);
        // }

        // ===============================================================
                // 17 october 2025 :
        // ===============================================================

        // Rotation of array to the right by k position :
        // int []arr = {1,2,3,4,5,6,7};
        // rotationRight(arr, 2);
        // Rotation of array to the left by k position :
        // rotationLeft(arr,2);
        // ----------------------------------------------
        // Move all zeros to end :
        // int []arr = {8,4,0,1,1,0,0,5,3};
        // zeroToEnd(arr);
        //----------------------------------------------------
        // Separate positive and negative :
        // int arr[] = {8,-4,-1,2,9,1,0,0,-2,-2,0,2};
        // separation(arr);
        //----------------------------------------------------
        // Check if array is sorted :
        // int []arr = {1,3,4,5};
        // boolean res = isSorted(arr);
        //  if(res) {
        //     System.out.println("Sorted");
        // } else {
        //     System.out.println("Not Sorted");
        // }
        //----------------------------------------------------
        //  Find missing number (1 to N):
        // int arr[] = {1,2,4,5,6,7};
        // missinNum(arr); 
        // ===============================================================
            // 18 october 2025 :
        // ===============================================================
        // Remove duplicate elements :
        //  int []arr = {1,2,2,2,2,3,4};
        //  rmvDuplicate(arr);
        //  --------------------------------------
        // Merge Two Sorted Arrays :

        // int []arr1 = {4,5,6,7,8,9};
        // int []arr2= {11,13,18};
        // mergeSortedArr(arr1,arr2);                     //remaining 

        // Two Sum (find pair with sum) : 

        // int []nums = {1, 3, 11, 15,10,2,45,7};
        // int target = 9;
        // pairofNum(nums, target);

        // Find pair with maximum sum  :
        // int [] arr = {1,-4,7,8,10};
        // pairsofNumMaxSum(arr);                         //remaining
        // ==================================================
        // 19 October 25
        // ==================================================
        //Revison(Learnt it before)
        // Max Subarrays Sum (Kadens Aldo) :
        // int []arr = {-2, -3, 4, -1, -2,1,5,-3};
        // kadanesAlgo(arr);
        // maxSumArrSum(arr);
        
        // int [] arr = {2, 4, 6, 8,10};
        // printSubArr(arr);
        // pairsOfArrays(arr);

        // Two Sum (Find Pair with Given Sum) :
        // int []arr ={-3, 1, 4, 7, 10};
        // pairSum(arr, 7);
        // ==================================================
        // 20 October 25
        // ==================================================
        // Check if array is palindrome :
        // int []arr = {1,6,3,6,1}; //even numners
        // isPalindromArr(arr);

        //conclusion : This is 20th october changed, i forgot to push it
        //on github
// =======================================================
        // 21 October 2025 :
// =======================================================
        //Q1 : 
    //  int []marks = {45,60,20,55,70,10};
    //  for(int i =0; i < marks.length; i++){
    //     if(marks[i] < 35) {
    //         System.out.println("at index : "+ i + " the marks is less than 35");
    //     }
    //  }

    // Q5 : 
    // int arr[] = {1,2,3,4,5};
    // linearSearch(arr, 10);

    // secondLargest1(arr);
    // secondLargest2(arr);
    // reverseArr(arr); //Two Pointer approach 
    // System.out.println("After calling reverse Arrays methods: ");
    // for(int i : arr) {
    //     System.out.println(i);
    // }

// =======================================================
        // 22 October 2025 :
// =======================================================
    // rotateArr(arr, 7);
    // System.out.println("After methods called");
    //     for(int i : arr) {
    //     System.out.println(i);
    // }

    // boolean  result = isPalindromeNum(1221);
    // System.out.println(result);
// =======================================================
        // 23 October 2025 :
// =======================================================
    // int []cgpa = {3, 2, 2, 3};
    // int result =removeUniqueEle(cgpa, 3);
    // System.out.println("Non-val elements : "+ result);
    String []strs = {"flower","flow","flight"};
    longestCommonPrefix(strs);

    

 
















//----------------------------------------------------
//----------------------------------------------------
//----------------------------------------------------
//----------------------------------------------------                
//----------------------------------------------------

        

       


    }
}
