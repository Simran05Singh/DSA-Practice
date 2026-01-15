public class Move_Zeros_To_End {
    public static void main(String[] args) {
        int arr[] = {0,1,0,2,0,3,0,0,0,4,5,0,6};
        int arr2[] = new int[arr.length];
        int j = 0;
        int count = 0;
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i] != 0){
                arr2[j] = arr[i];
                j++;
            }
            else{
                count++;
            }
        }
        while(count > 0){
            arr2[j] = 0;
            j++;
            count--;
        }
        System.out.println("Array after moving zeros to the end:");
        for(int i=0 ; i<arr2.length ; i++){
            System.out.print(arr2[i] + " ");
        }
    }
}
