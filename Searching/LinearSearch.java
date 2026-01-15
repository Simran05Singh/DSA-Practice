public class LinearSearch {
    public static void main(String[] args) {
        int key = 4;
        int flag = 0;
        int arr[] = {1,2,3,4,5};
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i] == key){
                flag = 1;
            }
        }
        if(flag == 1){
            System.out.println("Element found");
        } else {
            System.out.println("Element not found");
        }
    }
}
