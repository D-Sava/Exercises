r = [1,2,3,4,5]
n = 3

while n != 0:

    a = []
    b = []
    lenR = len(r) // 2
    counter = 0
    
    for i in r:
            
        if counter < lenR:
            a.append(i)
        
        if counter >= lenR:
            b.append(i)
            
        counter+=1
            
            
    if len(a) > len(b):
        b.insert(0,0)
    
    if len(b) > len(a):
        a.insert(0,0)
        
    print("A: " +str(a))
    print("B: " +str(b))
    print("\n")
    
    r = []
    
    for i in range(0, len(a)):
        r.append(a[i] + b[i])
    
    print("C: " +str(r))
    print("\n")
    
    n -= 1

