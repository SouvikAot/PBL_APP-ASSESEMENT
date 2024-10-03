import java.util.Scanner;

public class Ass10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k=0,l=0;
        int[] even = new int[n];
        int[] odd = new int[n];
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0 ) {
                even[k++] = arr[i];
            }
            else {
                odd[l++] = arr[i];
            }
        }
        int[] evenodd = new int[n];
        int s=0;
        for (int i = 0; i < k; i++) {
            evenodd[s++]=even[i];
        }
        for(int i=0;i<l;i++){
            evenodd[s++]=odd[i];
        }
        System.out.print("evenodd([");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
            if(i<n-1){
                System.out.print(",");
            }
        }
        System.out.print("])->[");
        for(int i=0;i<n;i++){
            System.out.print(evenodd[i]);
            if(i<n-1){
                System.out.print(",");
            }
        }
        System.out.print("]");

    }

}
