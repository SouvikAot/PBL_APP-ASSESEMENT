import java.util.Scanner;

public class Ass12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = new int[3];
        System.out.println("Enter 3  elements of 1st array : ");
        for (int i = 0; i < 3; i++) {
            arr1[i] = sc.nextInt();
        }
        int[] arr2 = new int[3];
        System.out.println("Enter 3  elements of 2nd array : ");
        for (int i = 0; i < 3; i++) {
            arr2[i] = sc.nextInt();
        }
        int[] arr3 = new int[2];
            arr3[0] = arr1[1];
            arr3[1] = arr2[1];

        System.out.print("middleWay([");
        for(int i=0;i<3;i++){
            System.out.print(arr1[i]);
            if(i<3-1){
                System.out.print(", ");
            }
        }
        System.out.print("], [");
        for(int i=0;i<3;i++){
            System.out.print(arr2[i]);
            if(i<3-1){
                System.out.print(", ");
            }
        }
        System.out.print("]) -> [");
        for(int i = 0; i < 2; i++) {
            System.out.print(arr3[i]+" ");
            if(i<1){
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }

}
