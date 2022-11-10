package LAB02;

public class IsPrime {

    public static void main(String[] args) {
        int i, n = 5;
        boolean isprime = true;

        // 0 and 1 are not prime numbers also, negative numbers are not prime
        if (n < 2) {
            isprime = false;
        } else {
            for (i = 2; i < n; i++) {
                if (n % i == 0) {
                    isprime = false;
                    break;
                }
            }
        }

        String result = isprime ? "Prime" : "not Prime";
        System.out.println("The number " + n + " is : " + result);
    }
}
// Time Complexity : O(N)
// Space Complexity : O(1)





    /* public static void main(String[] args) {

        isPrime();
    }

    public static boolean isPrime()
        {
            int n=0;
            if (n <= 1) //если наше число равно 1 = это не простое число
                return false; // возращаем фолз

            for (int i = 2; i < n; i++) {

                if (n % i == 0) { // если наше число н при деление на какое то число и ,которое меньше нашего заданного числа, дает остаток 0
                    return false;
                }// это так же не простое число

            }
            return true;
        }*/








