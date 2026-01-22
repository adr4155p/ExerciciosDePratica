package ReaprendendoAsBases;

public class Array4 {
    public static void main(String[] args) {
        int[] nums = {7, 14, 21, 28};
        int soma = 0;
        for (int i = 0; i < nums.length; i++) {
            soma += nums[i];
        }
        System.out.println(soma);
    }
}
