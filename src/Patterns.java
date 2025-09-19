public class Patterns {
    public static void ptrn1(int n) {
        int row = ((n*2));
        for(int i = 1; i <=row; i++){
           if(i <= n) {
               //stars :
               for(int j =1; j <=i; j++){
                   System.out.print("*");
               }
               //space :
               for(int k = i; k < row - i; k++){ // 1 2 3 4 5 6, 2 3 4 5 , 3 4
                   System.out.print(" ");
               }
               //stars :
               for(int l =1; l <=i; l++){
                   System.out.print("*");
               }
               System.out.println();
           } else {
               //stars :
               for(int j = 1; j <= row - i + 1; j++) {
                   System.out.print("*");
               }
               //spaces :
               for(int k = 1; k <= (2*i) - (row + 2) ; k++) {
                   System.out.print(" ");
               }
                //stars :
               for(int j = i-n; j <=n;j++){
                   System.out.print("*");
               }
               System.out.println();
           }
        }
    }
    //conclusion : all are easy but for bottom half spaces
    //2*i - (row+2)--try to manipulate i and row
    // and use factor '2' and substraction/addition
//    --------------------------------------------------------
    public static void ptrn2(int n){
        int row = (n*2) - 1;
        for(int i = 1; i <= row; i++){
            if(i <= n) {
                //spaces :
                for(int j = i; j < n; j++){
                    System.out.print(" ");
                }
                //stars :
                for(int k = 1; k <=i; k++){
                    System.out.print("* ");
                }

                System.out.println();
            } else {// i = 6
                //spaces :
                for(int j = 1; j <=i -(n); j++){
                    System.out.print(" ");
                }
                //stars :
                for(int k= 1; k <= (2*n) - i; k++) {
                    System.out.print("* ");
                }
                System.out.println();

            }
        }
    }
//    tricks : "Second half stars: 2n - i shrinks symmetrically."
//    -------------------------------------------------------------
    public static void main(String[] args) {
//        Butter Fly Star Pattern :
        ptrn1(4);
//        Diamond Pattern :
        ptrn2(7);
    }
}
