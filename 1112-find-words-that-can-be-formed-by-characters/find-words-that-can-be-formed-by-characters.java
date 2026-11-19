
class Solution {
    public int countCharacters(String[] words, String chars) {

        int[] freq = new int[26];

        // Count characters in chars
        for (char c : chars.toCharArray()) {
            freq[c - 'a']++;
        }

        int sum = 0;

        for (String word : words) {

            int[] temp = freq.clone();
            boolean flag = true;

            for (char c : word.toCharArray()) {

                if (temp[c - 'a'] > 0) {
                    temp[c - 'a']--;
                } else {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                sum += word.length();
            }
        }

        return sum;
    }
}
