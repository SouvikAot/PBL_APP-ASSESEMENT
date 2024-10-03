public class Ass2 {
    static void max_min(int[] arr){
        int max = 0;
        int min = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("MAXIMUM: "+max+" and "+"Minimum: "+min);
    }
    public static void main(String[] args) {
        int[] myArray = {9, 5, 2, 1};
        max_min(myArray);
    }
}
