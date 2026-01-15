public class Bubble_Sort_Array {
    static void BubbleSort(int arr[]){
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Original Array:");
        for(int num : arr){
            System.out.print(num + " ");
        }
        BubbleSort(arr);
        System.out.println("\nSorted Array:");
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}
