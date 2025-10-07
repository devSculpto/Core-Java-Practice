import java.util.*;
public class CoreRevision {


//    static void reverseName(String oldStr){
//        String newStr = "";
//        for(int i = oldStr.length() - 1; i >= 0; i--){
//            newStr += oldStr.charAt(i);
//        }
//        System.out.println(newStr);
//    }
//    static int isPalindrome(String Str){
//         String reverseStr = "";
//         for(int i = Str.length() -1; i >= 0; i--){
//             reverseStr += Str.charAt(i);
//         }
//         if(Str.equals(reverseStr)){
//             System.out.println("Palindrome");
//         } else {
//             System.out.println("Not a Palindrome");
//         }
//         return 0;
//    }
    // 2 pointer Approach ---->
//    static boolean isPalindrome(String Str){
//        int left = 0;
//        int right = Str.length() - 1;
//        while(left < right){
//            if(Str.charAt(left) != Str.charAt(right)){
//                return false;
//            }
//            left++;
//            right--;
//        }
//         return true;
//    }
//    sum of Arrays --------------->
//    static void sumOfArr(int []Arr){
//        int sum = 0;
//        for(int i = 0; i < Arr.length;i++){
//            sum+= Arr[i];
//        }
//        System.out.printf("Sum of Elements of an Arrays : %d", sum);
//    }
//    max Ele of an Arr ---->
    static void maxEleArr(int []Arr){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
//        int max = 0;
        for(int i = 0; i < Arr.length; i++){ // 12, 13 ,99, 14, 15, 16
            if(Arr[i] > max ){
                max = Arr[i];
            }
            if(Arr[i] < min){
                min = Arr[i];
            }

        }
        System.out.printf("max : %d ", max);
        System.out.printf("\nmin : %d ", min);
    }
    //fibonacchi Series ----->
//    static void fiboSeries(int n){
//        // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
//        int t1 = 0;
//        int t2 = 1;
//        System.out.printf("%d %d",t1,t2);
//        for(int i = 3; i <= n; i++){
//            int nextT ;
//            nextT = t2 + t1;
//            t1 = t2;
//            t2 = nextT;
//            System.out.printf(" %d", nextT);
//        }
//    }
    //fibo series using recursion ---->
    static int fiboSeries(int n){
        //base case:
        if(n <= 1) {
            return n;
        } else {
            return fiboSeries(n - 1) + fiboSeries(n - 2);
        }
    }
    //prime numbers :
    static void primeNum(int num){
        boolean isPrime = true;
        for(int i = 2; i <= (Math.sqrt(num)); i++){
            if(num % i == 0){
                isPrime = false;
            }
        }
        if(isPrime) {
            System.out.println("Prime number");
        } else {
            System.out.println("Not a Prime number");
        }
    }
//    Count Vowels in a String -------------->
    static void noOfVowels(String OgStr){
        int vowelCount = 0;
        String Str = OgStr.toLowerCase();
        for(int i = 0; i < Str.length(); i++){
            if(Str.charAt(i) == 'a' || Str.charAt(i) == 'e' || Str.charAt(i) == 'i' || Str.charAt(i) == 'o' || Str.charAt(i) == 'u'){
                vowelCount++;
            }

        }
        System.out.println("Total Vowels : "+ vowelCount);
    }
//star patterns :------------>
    static void star(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.printf("* ");
            }
            System.out.println();
        }
    }
    //binary to Decimal :------------>
    static void binToDec(int num){
        int power = 0; // 0 1 2 3
        int Decimal = 0;//
        while (num > 0) {
            int lastDig = num % 10;
            Decimal += (int) (lastDig * (Math.pow(2, power)));
            num/=10;
            power++;
        }
        System.out.println(Decimal);
    }

    //dec to binn  --------------->
    static void deciToBin(int decNum){
        int rem;
        int ans = 0;
        int power = 0;
        int test = decNum;
        while(test > 0){
            rem = test % 2; // rem = 0 1 0 1 0 1
            test /= 2;// deciNum = 21 10 5 2 1 0
            ans += (int)((rem * Math.pow(10, power)));
            power++;
        }
        System.out.println(ans);
    }
    //Leap Year ---------------->
    static void leapYear(int year){
        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
            System.out.println("Leap Year");
        } else {
            System.out.println("Not a Leap Year");
        }
    }
    //second max Element ---------------->
    static void secondMaxEle(int []num){
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for(int i = 0;i < num.length; i++){
            if(num[i] > firstMax){
                secondMax = firstMax;
                firstMax = num[i]; //firstMax = 94
            } else if( num[i] > secondMax && num[i] < firstMax){
                secondMax = num[i];
            }
        }
        System.out.println("First Max : " + firstMax);
        System.out.println("Second Max : " + secondMax);
    }
    
//    conclusion : Not for an identical elements of an Arrays
    static int binarySearch(int []arr, int key){
        int start = 0;
        int ends = arr.length -1;
        while(start <= ends){
            int mid = (start + ends)/2;
            if( arr[mid] == key) {
                return mid;
            } else if (arr[mid] > key){
                ends = mid - 1;

            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    static void pairsofArr(int []arr){
        for(int i = 0; i < arr.length; i++) {//0 1 2 ....end
            for(int j = i+1; j < arr.length; j++){
                System.out.print("(");
                System.out.print(arr[i] + ","+ arr[j]);
                System.out.print(")");
            }
            System.out.println();
        }
        System.out.println();
    }


    static int subArrs(int []arrs) {
        for (int start = 0; start < arrs.length; start++) {
            for (int end = arrs.length - 1; end >= 0; end--) {
                int maxSum = Integer.MIN_VALUE; // - 8
                int currSum = 0;
                for (int i = start; i <= end; i++) {
//                    System.out.print(arrs[i] + " ");
                    currSum += arrs[i];
                }
//                System.out.println("Curr Sum of subarrays : " + currSum);
                if (currSum > maxSum) {
                    maxSum = currSum;
                    return maxSum;
                }
                System.out.println();
            }

        }
        return -1;
    }

    static void kadensAlgo(int []arrs){
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for(int i = 0; i < arrs.length; i++){
            cs += arrs[i];
            if(cs < 0) {
                cs = 0;
            }
            ms = Math.max(cs,ms);
        }
        System.out.println("MS : " + ms);
    }

//    Conclusion : This works if the array has at least one positive number, but fails if all numbers are negative.

    public static void main(String[] args) {
//        1: Reverse a given strings -------------->
//        String name = "radar";
//        reverseName(name);
//       boolean res  =  isPalindrome(name);
//       if(res) {
//           System.out.println("The string is Palindrome!");
//       } else {
//           System.out.println("The string not a Palindrome!");
//       }
//        int []marks = {12, 13 ,99, 14, 15, 16};
//        sumOfArr(marks);
//        maxEleArr(marks);

//        fiboSeries(10);
        //fino series using recursion
//        int n = 10;
//        for(int i = 0; i < n; i++){
//            System.out.printf(fiboSeries(i)+ " ");
//        }

        //prime numbers :
//        primeNum(15);
//        String Str = "Grok AI";
//        String Str = "Programming is Fun";
//        noOfVowels(Str);

        //star pattern :
//        star(5);

        //binToDec ------------------->
//        binToDec(100000000);

//        deciToBin(46);
//        leapYear(2021);
        int []marks = {94,92,97};
//        secondMaxEle(marks);

        int []rollNums = {67,56,34,32,31,30,25};

//       int rel =  binarySearch(rollNums, 56);
//        System.out.println("The key found at index : "+ rel);
        int []arr = {1,-2,6,-1,3};
//        pairsofArr(arr);
//        subArrs(arr);
//        int maxSum = subArrs(arr);
//        System.out.println("Max Subarray sum : "+ maxSum);
        kadensAlgo(arr);


    }
}