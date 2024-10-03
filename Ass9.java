import java.util.Scanner;

public class Ass9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int count=0,k=0;
        int[] newarr=new int[n];
        for (int i = 0; i < n; i++) {
            if(arr[i]!=10){
                newarr[k++]=arr[i];
            }
        }
        for(int i=k+1;i<n;i++){
            newarr[i]=0;
        }
        for(int i=0;i<n;i++){
            System.out.print(newarr[i]+" ");
        }
    }
}
