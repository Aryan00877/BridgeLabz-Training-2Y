class Solution {
    public int countVowelSubstrings(String word) {
        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            boolean[] seen = new boolean[5];
            int unique = 0;

            for (int j = i; j < word.length(); j++) {
                char ch = word.charAt(j);

                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {

                    int index = 0;

                    if (ch == 'a') index = 0;
                    else if (ch == 'e') index = 1;
                    else if (ch == 'i') index = 2;
                    else if (ch == 'o') index = 3;
                    else if (ch == 'u') index = 4;

                    if (!seen[index]) {
                        seen[index] = true;
                        unique++;
                    }

                    if (unique == 5) {
                        count++;
                    }

                } else {
                    break;
                }
            }
        }

        return count;
    }
}