//given name sort it in lexicographical oeder.
public class xxx1 {
    static void Insertion(String arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j].compareTo(arr[minIndx]) < 0) {
                    minIndx = j;
                }
            }
            if (minIndx != i) {
                String temp = arr[i];
                arr[i] = arr[minIndx];
                arr[minIndx] = temp;
            }
        }
    }

    public static void main(String[] args) {
        String arr[] = { "mango", "apple", "kiwi", "banana" };
        Insertion(arr);
        for (String x : arr) {
            System.out.print(x + " ");
        }
    }
}
