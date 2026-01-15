public class Insertion_Sort_Array {
    static void InsertionSort(int arr[]){
        int n = arr.length;
        for(int i=1; i<n; i++){
            int temp = arr[i];
            int j = i-1;
            while(j >= 0 && arr[j] > temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
    }
    public static void main(String[] args) {
        int arr[] = {12, 11, 13, 5, 6};
        System.out.println("Original Array:");
        for(int num : arr){
            System.out.print(num + " ");
        }
        InsertionSort(arr);
        System.out.println("\nSorted Array:");
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}
