public class Problem204 {
    public static void main(String[] args){
        //Count the number of prime numbers less than a non-negative number, n.

        int n = 1000;
        int counter = 0;

        boolean[] primes = returnPrimes(n);
        System.out.println("Number of primes less then "+n+" is "+countPrimes(primes)+".");

    }
    public static boolean[] returnPrimes(int n){

        boolean[] primes = new boolean[n];

        for(int i = 0; i < primes.length; i++){
            primes[i] = true;
        }

        for(int i = 2; i*i < n; i++){
            for(int j = i*i; j < n; j+=i){
                if(primes[j]==true)
                    primes[j]=false;
            }
        }

        return primes;
    }

    public static int countPrimes(boolean[] primes){

        int counter = 0;

        for(int i = 2; i<primes.length; i++){
            if(primes[i] == true)
                counter++;
        }

        return counter;
    }
}
