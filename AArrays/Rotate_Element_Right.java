public class Rotate_Element_Right {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int arr2[] = new int[arr.length];
        arr2[0] = arr[arr.length - 1];
        int j = 1;
        for(int i=0 ; i<arr.length-1 ; i++){
            arr2[j] = arr[i];
            j++;
        }
        System.out.println("Array after rotating elements to the right:");
        for(int i=0 ; i<arr2.length ; i++){
            System.out.print(arr2[i] + " ");
        }
    }
}
