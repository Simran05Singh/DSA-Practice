public class Merge_Sort_Array {
    //O(log n)
    static void divide(int arr[], int sIdx, int eIdx){
        if(sIdx >= eIdx){
            return;
        }
        int mid = sIdx + (eIdx - sIdx)/2;
        
        divide(arr, sIdx, mid);
        divide(arr, mid+1, eIdx);
        
        conquer(arr, sIdx, mid, eIdx);
    }
    //O(n)
    static void conquer(int arr[], int sIdx, int mid, int eIdx){
        int merged[] = new int[eIdx - sIdx + 1];
        int idx1 = sIdx;
        int idx2 = mid+1;
        int x = 0;
        while(idx1 <= mid && idx2 <= eIdx){
            if(arr[idx1] <= arr[idx2]){
                merged[x] = arr[idx1];
                x++;
                idx1++;
            }
            else{
                merged[x] = arr[idx2];
                x++;
                idx2++;
            }
        }
        while(idx1 <= mid){
            merged[x] = arr[idx1];
            x++;
            idx1++;
        }
        while(idx2 <= eIdx){
            merged[x] = arr[idx2];
            x++;
            idx2++;
        }
        for(int i=0, j=sIdx; i<merged.length; i++, j++){
            arr[j] = merged[i];
        }
    }
    public static void main(String[] args) {
        int arr[] = {10,9,8,7,6,5,4,3,2,1};
        System.out.println("Original Array:");
        for(int num : arr){
            System.out.print(num + " ");
        }
        divide(arr, 0, arr.length - 1);
        System.out.println("\nSorted Array:");
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}
