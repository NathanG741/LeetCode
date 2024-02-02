class Solution {
    public boolean isPalindrome(int x) {

    // base case 
    if (x == 0) {
        return true;
    }
    // if x is negative or x ends with 0
    if (x < 0 || x % 10 == 0) {
        return false;
    }

    //reversing half of the integer & compare
    int reversed_int = 0;
        while(x > reversed_int) {
    //get and removes the last digit
        int pop = x % 10;
        x /= 10;

        reversed_int = (reversed_int * 10) + pop;
    }


    if (x == reversed_int || x == reversed_int / 10) {
        return true;
        } else {
        return false;
        }
    }
}