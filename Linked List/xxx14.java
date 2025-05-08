// Java program to merge two sorted arrays.
public class xxx14{

	public static void main(String[] args) {
		int arr1[] = {1, 3, 5, 7};
		int n1 = arr1.length;

		int arr2[] = {2, 4, 6, 8};
		int n2 = arr2.length;

		int arr3[] = new int[n1 + n2];
		mergeArrays(arr1, arr2, n1, n2, arr3);

		System.out.println("Array after merging");
		for (int i=0; i < n1+n2; i++)
			System.out.print(arr3[i] + " ");
			
	}
	
	public static void mergeArrays(int[] arr1, int[] arr2, int n1, int n2, int[] arr3){
		int left=0;
        int right =0;
        int indx=0;
        while (left<n1&&right<n2) {
            if (arr1[left]<=arr2[right]) {
                arr3[indx]=arr1[left];
                left++; indx++;
            }else{
                arr3[indx]=arr2[right];
                right++; indx++;
            }
        }
        while (left<n1) {
            arr3[indx++]=arr1[left++];
        }
        while (right<n2) {
            arr3[indx++]=arr2[right++];
        }
	}
}
