public class Delete_At_Pos_Array {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int pos = 3;
        System.out.println("Original Array:");
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        int arr2[] = new int[arr.length-1];
        System.out.println("\nElement to be deleted at position " + pos + ": " + arr[pos-1]);
        int j = 0;
        for(int i=0 ; i<pos-1 ; i++){
            arr2[j] = arr[i];
            j++;
        }
        for(int i=pos ; i<arr.length ; i++){
            arr2[j] = arr[i];
            j++;
        }
        System.out.println("Array after deletion at position " + pos + ":");
        for(int i=0; i<arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}
