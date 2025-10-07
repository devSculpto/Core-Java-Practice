public class BasicConceptArrays {
    public static void reverseArr(int []arr){
        int []test = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            test[i] = arr[arr.length -1 - i];//4
        }
        for(int e : test){
            System.out.println(e);
        }
    }
    public static void main(String []args){
        int []arr = {8,4,1,2,9};
        reverseArr(arr);
    }
}
