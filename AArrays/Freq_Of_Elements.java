public class Freq_Of_Elements {
    public static void main(String[] args) {
        int arr[] = {1,2,2,3,1,1,1,3,4,5,6,3,4,5,4,3,5,6};
        for(int i=0 ; i<arr.length ; i++){
            int count = 0;
            int x = arr[i];
            if(x == -1){
                continue;
            }
            else{
                for(int j=0 ; j<arr.length ; j++){
                    if(arr[j] == x){
                        count++;
                        arr[j] = -1;
                    }
                }
            }
            System.out.println("Frequency of " + x + " is: " + count);
        }
    }
}
