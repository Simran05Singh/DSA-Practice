public class Find_Duplicate_Elements {
    public static void main(String[] args) {
        int arr[] = {1,2,1,1,1,1,1,1,1,3,4,2,2,3,4,5,6,6,6,};
        System.out.println("Duplicate elements in the array:");
        for(int i=0 ; i<arr.length ; i++){
            int count = 0;
            int x = arr[i];
            if(x == -1){
                continue;
            }
            else{
                for(int j=0; j<arr.length ; j++){
                    if(x == arr[j]){
                        count++;
                        arr[j] = -1;
                    }
                }
            }
            if(count > 1){
                System.out.println(x + " : " + count);
            }
        }
    }
}
