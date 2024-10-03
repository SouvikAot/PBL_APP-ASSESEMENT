import java.util.Scanner;

class Ass8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Array size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Array elements");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int sum=0;
        for(int i=0; i<n; i++){
            if(arr[i]==6 && i!=n-1){
               while (arr[i]!=7){
                   i++;
               }
            }
            else{
                sum=sum+arr[i];
            }
        }
        System.out.println("Sum of elements is "+sum);
    }
}