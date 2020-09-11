public class Exercise49 {

    //66. Write a Java program to compute the sum of the first 100 prime numbers.

    public static void main(String[] args){

        int n = 100;
        int counter = 0;
        int sum = 0;

        boolean[] array = getPrimes(n*n);

        for(int i = 0; ;i++){

            if(array[i] == true){
                sum+=i;
                counter++;
                System.out.println("Prime "+counter+" :" +i);
            }

            else if(counter == n){
                System.out.println("Sum of first 100 primes: "+sum);
                break;
            }
        }
    }

    public static boolean[] getPrimes(int n) {

        boolean primes[] = new boolean[n];

        for(int i = 0; i < primes.length; i++){
            primes[i] = true;
        }

        for(int p = 2; p*p <= n; p++){
            if(primes[p] == true){
                for(int i = p*p; i < n; i+=p){
                    primes[i] = false;
                }
            }
        }

        primes[0] = false;
        primes[1] = false;

        return primes;
    }
}
