public class SelectionSort1 {

    // Function to find the index of the smallest element
    public static int findSmallestIndex(int arr[], int start) {
        int minIndex = start;
        for (int i = start + 1; i < arr.length; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

  
    public static void SelectionSortArray1(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = findSmallestIndex(arr, i); // Find the smallest index from the remaining elements
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

   
    public static void printArray(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2};
        SelectionSortArray1(arr);
        printArray(arr);
    }
}
