class Solution {
    public boolean judgeCircle(String moves) {
        int[] m = {0,0,0,0};
        for (int i = 0; i < moves.length(); i++) {
            switch(moves.charAt(i)) {
                case 'U':
                    m[0]++;
                    break;
                case 'D':
                    m[1]++;
                    break;
                case 'L':
                    m[2]++;
                    break;
                case 'R':
                    m[3]++;
                    break;
            }
            }
        return m[0] == m[1] && m[2] == m[3];
        
    }
}