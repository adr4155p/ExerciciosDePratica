package ReaprendendoAsBases;

public class Array2 {
    public static void main(String[] args) {
        int[] nums = {5, 4, 3, 2, 1};
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] % 2 == 0) {
                System.out.println(nums[i]);
            }
        }
    }
}
