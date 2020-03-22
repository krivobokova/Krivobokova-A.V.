import java.util.Arrays;

public class Hometask2 {
    public static void main(String[] args) {
        int[] test_array = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        System.out.println(Arrays.toString(removeElement(test_array)));
    }

    private static int[] removeElement(int... nums) {
        int offset = 0;

        for(int i = 0; i< nums.length; i++){
            if(nums[i] == 3){
                offset++;
            } else{
                nums[i - offset] = nums[i];
            }
        }

        return Arrays.copyOf(nums, nums.length - offset);
    }
}
