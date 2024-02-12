public class SelectionSort {
    public static void main(String[] args) {
        IO io = new IO();
        int[] a = IO.input();
        System.out.println("Before Selection sorting");
        io.print(a,a.length);

        a = logic(a,a.length);

        System.out.println("After Selection sorting");
        io.print(a,a.length);


    }
    static int[] logic(int[] arr, int n){
        int minIndex = -1;
        int temp = 0;
        for (int i=0; i<n; i++){
            minIndex = i;
            for (int j = i+1; j<n; j++){
                if (arr[i]>arr[j]){
                    minIndex = j;
                }
            } if (minIndex != i) {
                temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }

        }
        return arr;
    }
}
