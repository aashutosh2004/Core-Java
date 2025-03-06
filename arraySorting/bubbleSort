public class bubbleSort {
    public static void bSort(int[] arr){
        int n=arr.length;
        for(int i=n-1;i>=0;i--){
            int didswap=0;
            for(int j=0;j<=i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    didswap = 1;
                }
            }
            if(didswap == 0){
                break;
            }
        }
    }

    public static void main(String[] args){
        int[] arr = {5,2,3,9,7,4};
        bSort(arr);
        for(int i=0;i<arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
