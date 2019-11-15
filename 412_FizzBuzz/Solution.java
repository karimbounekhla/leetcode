class Solution {
    public List<String> fizzBuzz(int n) {
        ArrayList<String> fizzBuzz = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            String s = "";
            if (i % 3 == 0) {
                s += "Fizz";
            }
            if (i % 5 == 0) {
                s += "Buzz";
            }
            if (i % 3 != 0 && i % 5 != 0) {
                s += i + "";
            }
            fizzBuzz.add(s);
        }
        return fizzBuzz;
    }
}