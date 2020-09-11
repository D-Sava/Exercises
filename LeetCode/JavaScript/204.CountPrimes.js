// Count the number of prime numbers less than a non-negative number, n.

// Example:

// Input: 10
// Output: 4
// Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.

function returnPrimes(n){
  
  let primes = [];

  for(let i = 0; i < n; i++){
    primes.push(true);
  }

  for(let p = 2; p*p < n; p++){
    for(let i = p*p; i < n; i+=p){
      if(primes[i] === true)
        primes[i] = false;
    }
  }

  return primes;
}

let n = 10;
let primes = returnPrimes(n);
let primeCount = [];

for(let i = 2; i < n; i++){
  if(primes[i]===true){
    primeCount.push(i);
  }
}

console.log("Input: "+n);
console.log("Output: "+primeCount.length);
