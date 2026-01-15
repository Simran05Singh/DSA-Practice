public class Selection_Sort_Array {
    static void SelectionSort(int arr[]){
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            int minIdx = i;
            // Find the index of the minimum element in the unsorted portion
            for(int j=i+1; j<n; j++){
                if(arr[j] < arr[minIdx]){
                    minIdx = j;
                }
            }
            // Swap the found minimum element with the first element of the unsorted portion
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        int arr[] = {64, 25, 12, 22, 11};
        System.out.println("Original Array:");
        for(int num : arr){
            System.out.print(num + " ");
        }
        SelectionSort(arr);
        System.out.println("\nSorted Array:");
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}
