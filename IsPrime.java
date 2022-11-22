package lab02;

public class lab02 {
    static long count;

    public static void main(String[] args){
        //h.fragment1(4);
        long num = 549755813888L; // lowest number with 40 bits
        for(int i=0;i<100;i++){
            String result = isPrime(num) ? "Prime" : "not Prime";
            System.out.println("The number " + num + " is: " + result + " and the for ran " +
            count + " times.\n");
            num++;
        }
    }

    public static boolean isPrime(long n){
        boolean isPrime = true;
        count = 0L;

        // 0 and 1 are not prime numbers also, negative numbers are not prime
        if (n < 2L) {
            isPrime = false;
        } else {
            for (long i = 2L; i <= n/2L; i++) {
                if (n % i == 0L) {
                    isPrime = false;
                    break;
                }
                count++;
            }
        }
        return isPrime;
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








