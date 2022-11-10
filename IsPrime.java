public class lab02 {
    static int count;

    public static void main(String[] args){
        //h.fragment1(4);
        int num = 524288; // lowest number with 20 bits
        for(int i=0;i<100;i++){
            String result = isPrime(num) ? "Prime" : "not Prime";
            System.out.println("The number " + num + " is: " + result + " and the for was running " +
            count + " times.\n");
            num++;
        }
    }

    public static boolean isPrime(int n){
        boolean isPrime = true;

        // 0 and 1 are not prime numbers also, negative numbers are not prime
        if (n < 2) {
            isPrime = false;
        } else {
            count = 0;
            for (int i = 2; i <= n/2; i++) {
                if (n % i == 0) {
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






