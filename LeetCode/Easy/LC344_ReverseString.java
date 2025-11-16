package LeetCode.Easy;

public class LC344_ReverseString {

    public void reverseString(char[] s) {
        int left = 0, right = s.length - 1;

        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }

    // Optional main method to test locally
    public static void main(String[] args) {
        LC344_ReverseString obj = new LC344_ReverseString();
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        obj.reverseString(s);
        System.out.println(s); // prints "olleh"
    }
}
