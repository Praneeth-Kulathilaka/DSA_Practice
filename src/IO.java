import java.util.Scanner;

public class IO {
    static int[] input(){
        Scanner scan = new Scanner(System.in);
        System.out.println("How manny numbers you gonna add");
        int n = scan.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i<n; i++){
            System.out.println("Enter number");
            arr[i] = scan.nextInt();
        }
        return arr;
    }
    void print (int[] arr, int size){
        for (int i=0; i < size; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
}
