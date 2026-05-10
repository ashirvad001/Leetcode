class Solution {
    public boolean isValidSudoku(char[][] board) {

        HashSet<String> seen = new HashSet<>();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char num = board[i][j];

                if (num != '.') {

                    if (!seen.add(num + " in row " + i))
                        return false;

                    if (!seen.add(num + " in col " + j))
                        return false;
                    int boxRow = i / 3;
                    int boxCol = j / 3;

                    if (!seen.add(num + " in box " + boxRow + "-" + boxCol))
                        return false;
                }
            }
        }
        return true;
    }
}