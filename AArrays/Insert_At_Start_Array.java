public class Insert_At_Start_Array {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int n = 10;
        System.out.println("Original Array:");
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nElement to be inserted at start: " + n);
        int arr2[] = new int [arr.length+1];
        arr2[0] = n;
        int j = 1;
        for(int i=0 ; i<arr.length ; i++){
            arr2[j] = arr[i];
            j++;
        }
        System.out.println("Array after insertion at start:");
        for(int i=0; i<arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}
