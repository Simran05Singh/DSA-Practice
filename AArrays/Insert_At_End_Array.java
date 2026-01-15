public class Insert_At_End_Array {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int n = 10;
        System.out.println("Original Array:");  
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nElement to be inserted at end: " + n);
        int arr2[] = new int [arr.length+1];
        int j=0;
        for(int i=0 ; i<arr.length ; i++){
            arr2[j] = arr[i];
            j++;
        }
        arr2[j] = n;
        System.out.println("Array after insertion at end:");
        for(int i=0; i<arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}
