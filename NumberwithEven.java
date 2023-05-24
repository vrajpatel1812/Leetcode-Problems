package Leetcode;

public class NumberwithEven {
    public static void main(String[] args) {
        int[] nums = {555,901,482,1771}; 
        int ans = findNumber(nums);
        System.out.println(ans);
    }

    public static int findNumber(int[] nums){
        int even = 0;

        for(int i = 0; i<nums.length; i++){
            int noDigit = noOfDigit(nums[i]);
            if(noDigit % 2 == 0){
                even++;
            }
        }

        return even;
    }

    public static int noOfDigit(int num){
        int i = 0;

        while(num > 0){
            num /= 10;
            i++;
        }

        return i;
    }
}
