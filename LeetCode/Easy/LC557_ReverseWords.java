package LeetCode.Easy;
public class LC557_ReverseWords {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String str:words){
            StringBuilder sbWord = new StringBuilder(str);
            sbWord.reverse().append(" ");
            sb.append(sbWord);
        }
        return sb.toString().trim();
    }
}
