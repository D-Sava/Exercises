def is_number(s):
        
        try:
            int(s)
            
        except ValueError:
            return False

        return True
    
    textList = list(text)
    
    a = collections.Counter(textList)
    b = str(a).split(":")
    c = str(b[0:len(b)])
    
    counter = 0
    
    for i in c:
        
        con = is_number(i)
        
        if con == True:
            
            if int(i) > 1:
                counter += 1
    
    return counter