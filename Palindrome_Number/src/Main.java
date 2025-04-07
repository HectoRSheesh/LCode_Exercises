class Solution {
    public boolean isPalindrome(int x) {

        String str = String.valueOf(x);
        String reversed = new StringBuilder(str).reverse().toString();

        if (str.equals(reversed)) {
            return true;
        }
        return false;
    }
}