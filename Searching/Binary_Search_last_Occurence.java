public class Binary_Search_last_Occurence {
    static int BinarySearch(int arr[], int key){
        int low=0, high=arr.length-1, r=-1;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(arr[mid] == key){
                r = mid;
                low = mid + 1;
            }
            else if(arr[mid] > key){
                high = mid - 1;
            }
            else{
                low = mid + 1;;
            }
        }
        return r;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,7,8,9,10};
        int key = 7;
        int result = BinarySearch(arr, key);
        if(result == -1){
            System.out.println("Element not found in the array");
        }
        else{
            System.out.println("Element found at index: " + result);
        }
    }
}
