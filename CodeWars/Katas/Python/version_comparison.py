

version_A = "10.4.9"
version_B = "10.4.11"

def compare_version(v1,v2):

    a = version_A.split(".")
    b = version_B.split(".")
    
    for i in a:
        i = int(i)
        
    for i in b:
        i = int(i)
        
    len_A = len(a)
    len_B = len(b)
    
    isGreater = False
    
    #CASE 1
    if a[0] > b[0]:
        isGreater = True
        return isGreater
        
    #CASE 2
    if b[0] < a[0]:
        isGreater = Flase
        return isGreater
        
    #CASE 3
    if b[0] == a[0]:
        if a[1] > b[1]:
            isGreater = True
            return isGreater
        
        if b[1] > a[1]:
            isGreater = False
            return isGreater
            
        if a[1] == b[1]:
            
            if a[2] > b[2]:
                isGreater = True
                return isGreater
            
            if b[2] > a[2]:
                isGreater = False
                return isGreater
                
            if a[2] == b[2]:
                isGreater = True
                return isGreater
                
print(compare_version(version_A, version_B))