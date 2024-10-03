import java.util.Arrays;

public class Ass7 {
    public static void main(String[] args) {
        int[] arr={12,34,12,45,67,89};
        int[] newArr=new int[arr.length];
        int k=0;
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1]){
                {
                    newArr[k++]=arr[i];
                }
            }
        }
        newArr[k++]=arr[arr.length-1];

        for(int i=0;i<k;i++){
            System.out.print(newArr[i]+" ");
        }
    }
}
