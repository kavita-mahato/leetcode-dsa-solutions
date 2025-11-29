import java.util.Arrays;

public class leftRotateByk {
    public static void rotateArray(int[] nums, int k) {
        int n = nums.length;
        k = k % n ;
        reverse(nums, 0, k-1);
        reverse(nums, k, n-1);
        reverse(nums, 0, n-1);
        
    }
    private static void reverse(int[] arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[] nums = {2,1,0,3,12};
        rotateArray(nums, 3);
        System.out.println(Arrays.toString(nums));
    }
}
