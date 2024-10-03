import java.util.Scanner;

public class Ass11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int flag=0;
        for (int i = 0; i < n; i++) {
            if(arr[i] == 1 || arr[i]==4) {

            }
            else {
                flag=1;
            }
        }
        System.out.print("only14([");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
            if(i<n-1){
                System.out.print(", ");
            }
        }
        if(flag==0) {
            System.out.print("])->true");
        }
        else {
            System.out.print("])->false");
        }
    }
}
