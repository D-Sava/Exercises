def isPrime(n): 
      
    if (n <= 1): 
        return False
  
    for i in range(2, n): 
        if (n % i == 0): 
            return False
    
    return True
  
def isReversablePrime(n):
    
    m = str(n)
    m = m[::-1]
    m = int(m)
    
    b = isPrime(m)
    t = isPrime(n)
    
    if b == True and t == True:
        return True
        
    else:
        return False

def check(place)

    i = 0
    c = 0
    if c >= 0 and c <= 10000:

        while c <= place:
            
            if isReversablePrime(i):
                
                print("place: " +str(c))
                print("number: " +str(i))
                c += 1
            
            i += 1
            
    
        print(i-1)
    