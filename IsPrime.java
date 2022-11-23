package lab02;

public class lab02 {
    static long count;

    public static void main(String[] args){
        //h.fragment1(4);
        long num = 549755813888L; // lowest number with 40 bits
        for(int i=0;i<100;i++){
            String result = isPrime(num) ? "Prime" : "not Prime";
            System.out.println("The number " + num + " is: " + result + " and the for ran " +
            count + " times." + i + "\n");
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
    public void fragment1(int n) {
        int sum = 0;
        for ( int i = 1; i < n; i ++) {
            for (int j = 0; j < n * n; j++) {
                if (j % i == 0) {
                    for (int k = 0; k < j; k++)
                        sum++;
                }
            }
        }
        System.out.print(sum);
    }
}






