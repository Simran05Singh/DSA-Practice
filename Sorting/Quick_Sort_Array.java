public class Quick_Sort_Array {

    static int Partition(int arr[], int low, int high){
        int pivot = arr[high];
        int i = low-1;
        for(int j=low; j<high; j++){
            if(arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot; 
        arr[high] = temp;
        return i;
    }
    static void QuickSort(int arr[], int low, int high){
        if(low < high){
            int pivIdx = Partition(arr, low, high);
            QuickSort(arr, low, pivIdx - 1);
            QuickSort(arr, pivIdx+1, high);
        }
    }
    public static void main(String[] args) {
        int arr[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int n = arr.length;
        System.out.println("Original Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        QuickSort(arr, 0, n-1);
        System.out.println("\nSorted Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
