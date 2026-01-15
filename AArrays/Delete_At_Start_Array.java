public class Delete_At_Start_Array {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        System.out.println("Original Array:");
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nElement to be deleted at start: " + arr[0]);
        int arr2[] = new int[arr.length-1];
        int j = 0;
        for(int i=1; i<arr.length; i++){
            arr2[j] = arr[i];
            j++;
        }
        System.out.println("Array after deletion at start:");
        for(int i=0; i<arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}
