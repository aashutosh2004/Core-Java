public class missingNumber {
    public static int findNo(int[] arr){
        int n = arr.length;
        int totalSum = n*(n+1)/2;
        int arrSum = 0;

        for(int ar: arr){
            arrSum += ar;
        }
        return arrSum-totalSum;
    }

    public static void main(String[] args){
        int[] arr = {1, 2, 4, 5, 6};

        System.out.println("Missing Number: " + findNo(arr));
    }

}
