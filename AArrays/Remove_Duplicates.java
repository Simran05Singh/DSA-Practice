public class Remove_Duplicates {
    public static void main(String[] args) {
        int arr[] = {1,2,1,1,1,2,3,2,4,5,6,3,4,5,6,2,3,4,5,6,1};
        int arr2[] = new int[arr.length];
        int j = 0;
        for(int i=0 ; i<arr.length ; i++){
            int x = arr[i];
            if(x == -1){
                continue;
            }
            else{
                arr2[j] = x;
            }
            j++;
            for(int k=0 ; k<arr.length ; k++){
                if(x == arr[k]){
                    arr[k] = -1;
                }
            }
        }
        System.out.println("Array after removing duplicates:");
        System.out.print("[ ");
        for(int i=0 ; i<j ; i++){
            System.out.print(arr2[i] + " ");
        }
        System.out.println("]");
    }
}
