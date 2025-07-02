public class selectionSort {
    public static void sort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-2;i++){
            int min=i;
            for(int j=i;j<n-1;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
    }

    public static void main(String[] args){
        int[] arr = {5,2,3,9,7,4};
        sort(arr);
        for(int i=0;i<arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
