class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> l = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (isSelfDividing(i)) {
                l.add(i);
            }
        }
        return l;
    }
    
    public boolean isSelfDividing(int n) {
        if (n == 0) return false;
        int i = n;
        while (i > 0) {
            if (i % 10 == 0) return false;
            if (n % (i%10) != 0) return false;
            i /= 10;
        }
        return true;
    }
}