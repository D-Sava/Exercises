string = "The quick brown fox jumps over the lazy dog."

list_A = list(string)
list_B = ['a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z']


s = ""
k = []
m = []

for i in range(0,len(list_B)):
    
    letter = list_B[i]
    if string.count(letter) > 0 and letter not in k:
        number = string.count(letter)
        k.append(letter)
        m.append(number)
        

for i in range(0,len(k)):
    s+= str(m[i]) + k[i]
    
return s
print("1a1b1c1d3e1f1g2h1i1j1k1l1m1n4o1p1q2r1s2t2u1v1w1x1y1z")
