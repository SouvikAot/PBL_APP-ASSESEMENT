public class Ass1 {
    void sum_Avg(int[] arr){
        int l=arr.length;
        int sum=0;
        for(int i=0;i<l;i++){
            sum+=arr[i];
        }
        System.out.println("The sum is: "+sum);
        System.out.println("The average is: "+sum/(float)l);
    }
    public static void main(String[] args) {
        int[] myArray = {0,1,2,3};
        Ass1 a=new Ass1();
        a.sum_Avg(myArray);
    }
}
