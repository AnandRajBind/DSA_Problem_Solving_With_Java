// check the given  number is prime or not using coun variable.
class IsPrime {
    public static boolean primeNumber(int n) {
        int count = 0;
        if (n <= 1) {
            return false;
        }
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        
        return count == 2;
    }

    public static void main(String args[]) {
        
        System.out.println(primeNumber(0));

    }
}