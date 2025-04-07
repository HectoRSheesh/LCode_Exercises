class Solution {
    public int[] twoSum(int[] nums, int target) {
        int arrayLenght = nums.length;
        int [] resultArray = new int[2];
        for (int i = 0; i < arrayLenght; i++) {
            for (int j = i + 1; j < arrayLenght; j++) {
                if (nums[i] + nums[j] == target) {
                    resultArray[0] = i;
                    resultArray[1] = j;
                }
            }
        }
        return resultArray;
    }
}