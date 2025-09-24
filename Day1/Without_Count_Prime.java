// check the given  number is prime or not  without using the  count variable.

public class Without_Count_Prime {

    public static boolean primeNumber(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
    return true ;
}
    public static void main(String args[]) {

        System.out.println(primeNumber(3));
    }
}
