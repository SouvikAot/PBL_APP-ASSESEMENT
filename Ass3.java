public class Ass3 {
    public static void main(String[] args) {
        int[] myArray= {1,4,34,56,7};
        int search=7;
        int count=0,flag=0;
        for(int i=0; i<myArray.length; i++){
            if(myArray[i]==search){
               count=i;
               flag=1;
            }
            else{

            }
        }
        if(flag==0){
            System.out.println("-1");
        }
        else {
            System.out.println("Index is:"+ count);
        }
    }
}
