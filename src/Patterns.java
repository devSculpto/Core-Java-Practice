public class Patterns {
//    Approach 1 ------------------>
//    public static void ptrn1(int n) {
//        int row = ((n*2));
//        for(int i = 1; i <=row; i++){
//           if(i <= n) {
//               //stars :
//               for(int j =1; j <=i; j++){
//                   System.out.print("*");
//               }
//               //space :
//               for(int k = i; k < row - i; k++){ // 1 2 3 4 5 6, 2 3 4 5 , 3 4
//                   System.out.print(" ");
//               }
//               //stars :
//               for(int l =1; l <=i; l++){
//                   System.out.print("*");
//               }
//               System.out.println();
//           }
//           else {
//               //stars :
//               for(int j = 1; j <= row - i + 1; j++) {
//                   System.out.print("*");
//               }
//               //spaces :
//               for(int k = 1; k <= (2*i) - (row + 2) ; k++) {
//                   System.out.print(" ");
//               }
//                //stars :
//               for(int j = i-n; j <=n;j++){
//                   System.out.print("*");
//               }
//               System.out.println();
//           }
//        }
//    }
    //conclusion : all are easy but for bottom half spaces
    //2*i - (row+2)--try to manipulate i and row
    // and use factor '2' and substraction/addition
//    --------------------------------------------------------
//    Approach 2 ---------------->
//        public static void ptrn1(int n) {
//        int rows = 2*n;
//        for(int i = 1; i <= rows; i++){// nos of rows :
//            if(i <= n) { // i <= 3
//                for(int j = 1; j <= rows; j++){
//                    //spaces :
//                    if(j >= (i+1) && j <= (rows - i)) {
//                        System.out.print(" ");
//                    } else {
//                        //stars :
//                        System.out.print("*");
//                    }
//                }
//                System.out.println();
//            }
//            else { // i >= 3
//                for(int k = 1; k<=rows; k++){
//                    //spaces :
//                    if(k >= (((2*n)+2) - i) && (k < i)){
//                        System.out.print(" ");
//                    }else {
//                        //stars :
//                        System.out.print("*");
//                    }
//                }
//                System.out.println();
//            }
//
//        }
//    }
//    --------------------------------------------------------
//    21 Sep Revison :
//    public static void ptrn1(int n ){
//        int rows = 2*n;
//        for(int i = 1; i <= rows; i++){
//            if(i <= n){
//                for(int j = 1; j <=rows; j++){
//                    if(j > i && j <= rows - i){
//                        System.out.print(" ");
//                    } else {
//                        System.out.print("*");
//                    }
//                }
//                System.out.println();
//            }
//            else {
//                for (int j = 1; j <=rows; j++){
//                    if(j <= i -1 && j >= ((rows - i) + 2 )){
//                        System.out.print(" ");
//                    } else {
//                        System.out.print("*");
//                    }
//
//                }System.out.println();
////            }
//        }
//    }
//    Time Taken : 10 minutes
//    --------------------------------------------------------
//    public static void ptrn1(int n){
//        int rows = 2*n;
//        for(int i = 1; i <= rows; i++){
//            int rowIndex = i <=n ? i : (rows - i + 1);{
//                for (int j = 1; j <= rows; j++) {
//                    if (j >= rowIndex + 1 && j <= rows - rowIndex) {
//                        System.out.print(" ");
//                    } else {
//                        System.out.print("*");
//                    }
//                }
//                System.out.println();
//            }
//        }
//    }
//    --------------------------------------------------------
//    Revision : 21 September
//    public static void ptrn1(int n){
//        int rows = 2*n;
//        for(int i = 1; i <=rows; i++){
//            if(i <= n){
//                for(int j = 1; j <= i; j++){
//                    System.out.print('*');
//                }
//                for(int k = 1;k <= (rows - 2*i);k++){ // 1 2 3 4 5 6,1 2 3 4 ,1 2, 0 = 7,6, 5
//                    System.out.print(' ');
//                }
//                for(int l=1; l<=i; l++){
//                    System.out.print('*');
//                }
//                System.out.println();
//            } else {
//                for(int j = 1; j <= (rows - i)+1; j++){
//                    System.out.print('*');
//                }
//                for(int k = 1;k<= ((2*i) - rows) - 2;k++){ // 0, 1 2 , 1 2 3 4, 1 2 3 4 5 6 = 2, 4, 6
//                    System.out.print(' ');
//                }
//                for(int l = 1; l <= (rows - i)+1; l++){
//                    System.out.print('*');
//                }
//                System.out.println();
//            }
//        }
//    }
//    Time taken : 35 minutes
//    --------------------------------------------------------
//    public static void ptrn1(int n){
//        int rows = 2*n;
//        for(int i = 1; i <= rows;i++){
//            if(i <= n){
//                for(int j = 1; j <=i ; j++){
//                    System.out.print('*');
//                }
//                for(int k = 1; k <= 2*(n - i); k++){
//                    System.out.print(' ');
//                }
//                for(int l = 1; l <=i; l++){
//                    System.out.print('*');
//                }
//                System.out.println();
//            } else {
//                for(int j = 1; j <=((2*n) - i)+1; j++){
//                    System.out.print('*');
//                }
//                for(int k = 1; k <= ((2*i) - rows) - 2; k++){
//                    System.out.print(' ');
//                }
//                for(int l = 1; l <= ((2*n) - i) +1; l++){
//                    System.out.print('*');
//                }
//                System.out.println();
//            }
//        }
//    }
//    Time Taken : 15 minutes
//    --------------------------------------------------------
//    static void ptrn1(int n){
//        int rows = 2*n;
//        for(int i = 1; i <= rows; i++){
//            if(i <= n) {
//                for(int j = 1; j <= i; j++){
//                    System.out.print('*');
//                }for(int j = 1; j <= rows - (2*i); j++){
//                    System.out.print(' ');
//                }
//                for(int j = 1; j <= i; j++){
//                    System.out.print('*');
//                }
//                System.out.println();
//            } else {
//                for(int j = 1; j <= (rows - i) + 1; j++){
//                    System.out.print('*');
//                }for(int j = 1; j <= ((2*i) -rows) -2; j++){
//                    System.out.print(' ');
//                }
//                for(int j = 1; j <= (rows - i) +1; j++){
//                    System.out.print('*');
//                }
//                System.out.println();
//            }
//        }
//    }
//    Time Taken : 12 minutes
//    --------------------------------------------------------
//    static void ptrn1(int n){
//        int rows = 2*n;
//        for(int i = 1; i <= rows; i++){
//            if(i <= n){
//                for (int j = 1; j <= i; j++){
//                    System.out.print('*');
//                }for (int j = 1; j <= (rows - (2*i)); j++){
//                    System.out.print(' ');
//                }for (int j = 1; j <= i; j++){
//                    System.out.print('*');
//                }
//                System.out.println();
//            }else {
//                for (int j = 1; j <= (rows - i) +1; j++){
//                    System.out.print('*');
//                }for (int j = 1; j <= ((2*i) - rows) - 2; j++){
//                    System.out.print(' ');
//                }for (int j = 1; j <= (rows - i) +1; j++){
//                    System.out.print('*');
//                }
//                System.out.println();
//            }
//        }
//    }
//    Time taken : 12 minutes (Only make efforts for space and stars printing logic)
//    --------------------------------------------------------
//    Approach 3 -------------------->
//    public static void ptrn1(int n){
//        int rows = 2*n;
//        for(int i = 1; i <= rows; i++){
//            int rowIndex = i <=n ? i : (rows - i + 1);{
//                for (int j = 1; j <= rows; j++) {
//                    if (j >= rowIndex + 1 && j <= rows - rowIndex) {
//                        System.out.print(" ");
//                    } else {
//                        System.out.print("*");
//                    }
//                }
//                System.out.println();
//            }
//        }
//    }
//    --------------------------------------------------------
//    21 sep revision : Need more practice
//    public static void ptrn1(int n) {
//        int rows = 2*n;
//        for(int i = 1; i <= rows; i++){
//            int indexRow = i <=n ? i : (rows - i + 1);
//            for(int j = 1; j <= rows; j++){
//                if(j >= indexRow + 1 && j <= rows - indexRow){
//                    System.out.print(" ");
//                } else {
//                    System.out.print('*');
//                }
//            }
//            System.out.println();
//
//        }
//    }
//    --------------------------------------------------------
//    public static void ptrn2(int n){
//        int row = (n*2) - 1;
//        for(int i = 1; i <= row; i++){
//            if(i <= n) {
//                //spaces :
//                for(int j = i; j < n; j++){
//                    System.out.print(" ");
//                }
//                //stars :
//                for(int k = 1; k <=i; k++){
//                    System.out.print("* ");
//                }
//
//                System.out.println();
//            } else {// i = 6
//                //spaces :
//                for(int j = 1; j <=i -(n); j++){
//                    System.out.print(" ");
//                }
//                //stars :
//                for(int k= 1; k <= (2*n) - i; k++) {
//                    System.out.print("* ");
//                }
//                System.out.println();
//
//            }
//        }
//    }
//    tricks : "Second half stars: 2n - i shrinks symmetrically."
//    -------------------------------------------------------------
//    21 sep revision :
//    static void ptrn2(int n){
//        int rows = (2*n) - 1;
//        for(int i = 1; i <= rows; i++){
//           if(i <= n){
//               //spaces :
//               for(int j = 1; j <= n -i;j++){
//                   System.out.print(" ");
//               } for(int j = 1; j<= i;j++){
//                   System.out.print("* ");
//               }
//               System.out.println();
//           } else {
//               //spaces :
//               for(int j =1; j <= i - n;j++){
//                   System.out.print(" ");
//               } for(int j =1; j<= (2*n) - i;j++){
//                   System.out.print("* ");
//               }
//               System.out.println();
//           }
//        }
//    }
//    -------------------------------------------------------------
//    Pascals Triangle : 21 September =----------->

//    public static int fact(int num){
//        if(num == 0 || num == 1){
//            return 1;
//        } else {
//            return num * fact(num - 1);
//        }
//    }
//    static void ptrn3(int rows){
//        for(int n = 0; n <= rows; n++){// n = 0
//            //spaces :
//            for(int j = 1; j <= rows - n; j++){
//                System.out.print("  ");
//            }
//            for( int r = 0; r <= n; r++){ //r = 0
//                int nCr = fact(n) / (fact(r) * fact(n-r));
//                System.out.printf("%-3d" , nCr);
//                }
//            System.out.println();
//            }
//
//        }
//conclusion : EASY JUst need to do some spaces alignment
//    -------------------------------------------------------------
//   public static int fact(int num){
//        if(num == 0 || num == 1) return 1;
//        else return num * fact(num - 1);
//    }
//    public static void ptrn3(int rows){
//        for(int n = 0; n <= rows; n++){
//            //spaces :
//            for(int j = 1; j <= (rows - n); j++){
//                System.out.print("  ");
//            }
//            //numbers :
//            for(int r = 0; r <= n; r++){
//                int nCr = fact(n) / ( fact(r) * fact(n - r));
//                System.out.printf("%-3d", nCr);
//            }
//            System.out.println();
//        }
//    }
//    conclusion : use proper brackets ()
//    -------------------------------------------------------------
//       21 sep revision :  Right Pascals Triangle :
//    static void ptrn4(int n){
//        int rows = ((2*n) -1);
//        for(int i = 1; i <= rows; i++){
//            if( i <= n) {
//                for(int j = 1; j <= i; j++){
//                    System.out.print("* ");
//                }
//                System.out.println();
//            }
//            else {
//                for(int j = 1; j <= (2*n - i); j++){// 1 2 3
//                    System.out.print("* ");
//                }
//                System.out.println();
//            }
//        }
//    }
//    -------------------------------------------------------------
//    21 sep : revision
//    static void ptrn5(int n){
//        for(int i = 1; i <= n; i++){ //prints rows
//            //spaces :
//            for(int j = 1; j <= (n - i); j++){
//                System.out.print("  ");
//            }
//            //first half :
//            for(int j = i; j >= 1; j--){
//                System.out.printf("%-2d",j);
//            }
//            //second half :
//            for(int j = 2; j <= i; j++){
//                System.out.printf("%-2d",j);
//            }
//            System.out.println();
//
//        }
//    }
//    ===============================================================================
//    22 Sep Revision :
//    ===============================================================================
//    static void butteryFly(int n){
//        int rows = 2*n;
//        for(int i = 1; i <= rows; i++){
//            if(i <= n){
//                for(int j = 1; j <= rows; j++){
//                    if( j > i && j <= (rows - i)) {
//                        System.out.print(" ");
//                    } else {
//                        System.out.print("*");
//                    }
//                }
//                System.out.println();
//            } else {
//                for(int j = 1; j <= rows; j++){
//                    if( j >= ((rows - i) + 2) && j <= (i - 1)) {
//                        System.out.print(" ");
//                    }
//                    else {
//                        System.out.print("*");
//                    }
//                }
//                System.out.println();
//            }
//        }
//    }
//    -------------------------------------------------------------
//    22 Sep : Revision :
//    static void diamond(int n){
//        int rows = (2*n) -1;
//        for(int i = 1; i <= rows; i++){
//            if(i <= n){
//                //spaces :
//                for (int j=1;j <= n - i;j++){
//                    System.out.print(" ");
//                }
//                //stars :
//                for (int j=1;j <= i;j++){
//                    System.out.print("* ");
//                }
//                System.out.println();
//            }else {
//                //spaces :
//                for (int j = 1;j <= i - n;j++){
//                    System.out.print(" ");
//                }
//                //stars :
//                for (int j = 1;j <= (2*n) - i ;j++){
//                    System.out.print("* ");
//                }
//                System.out.println();
//            }
//        }
//    }
//    -------------------------------------------------------------
//    Pascal's Triangle :
    static int fact(int num) {
        if(num == 1 || num == 0) return 1;
        else return num * fact(num - 1);
    }
    static void pascal(int rows){ // rows = 5
        for(int n = 0; n <= rows - 1; n++){// 0 1 2 3 4
            //spaces :
            for(int j = 0; j < (rows - n)- 1; j++){// n = 0 : 0 1 2 3,
                System.out.print("  ");
            }
            //printing numbers :
            for(int r = 0; r <= n; r++){
                int nCr = fact(n) / (fact(r) * fact(n - r));
                System.out.printf("%-4d", nCr);
            }
            System.out.println();
        }
    }
//    -------------------------------------------------------------
    public static void main(String[] args) {
//        Butter Fly Star Pattern :
//        ptrn1(3);
//        Diamond Pattern :
//        ptrn2(5);
//        Pascals Trianlgles :
//        ptrn3(6);
//        Right Pascals Triangle :
//        ptrn4(6);
//        Palindrome Traingle Stars :
//        ptrn5(6);
//----------------------------------------------------
        //22 sep revision :
//----------------------------------------------------
//        butteryFly(5);
//        diamond(5);
//        pascal(20);
    }
}
