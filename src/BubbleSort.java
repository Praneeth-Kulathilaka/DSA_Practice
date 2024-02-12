public class BubbleSort {
    public static void main(String[] args) {
        IO io = new IO();
        int[] a = IO.input();
        System.out.println("Before Bubble sorting");
        io.print(a,a.length);

        a = logic(a,a.length);

        System.out.println("After Bubble sorting");
        io.print(a,a.length);

    }

    static int[] logic(int[] arr, int n) {
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
