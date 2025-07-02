public class quickSort {
    public static void qSort(int[] arr, int st, int end) {
        if (st<end) {
            int pivIdx = partition(arr,st,end);
            qSort(arr, st, pivIdx-1);
            qSort(arr, pivIdx + 1, end);

        }
    }
    public static int partition(int[] arr, int st, int end) {
        int idx=st-1, piviot=arr[end];
        for(int j=st;j<end;j++){
            if(arr[j]<=piviot){
                idx++;
                int temp = arr[idx];
                arr[idx] = arr[j];
                arr[j] = temp;
            }
        }
        idx++;
        int temp = arr[idx];
        arr[idx] = arr[end];
        arr[end] = temp;
        return idx;
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 3, 9, 7, 4};
        qSort(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
