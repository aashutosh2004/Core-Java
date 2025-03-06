public class insertionSort {
    public static void insSort(int[] arr){
        int n=arr.length;
        for(int i=0;i<=n-1;i++){
            int j=i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp=arr[j-1];
                arr[j-1] = arr[j];
                arr[j]= temp;
                j--;
            }
        }
    }

    public static void main(String[] args){
        int[] arr = {5,2,3,9,7,4};
        insSort(arr);
        for(int i=0;i<arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
