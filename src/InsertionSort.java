import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        IO io = new IO();

        int[] a = IO.input();
        System.out.println("Before Insertion sorting");
        io.print(a,a.length);

//        Calling the sort logic
        a = logic(a,a.length);

        System.out.println("After Inserting sorting");
        io.print(a,a.length);
    }
    static int[] logic(int[] arr, int n){
        for (int i=1; i<n; i++){
            int key = arr[i];
            int j = i-1;

            while (j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        return arr;
    }


}
