def order(sentence):

    my_list = sentence.split(" ")
    arr = []
    num = 1
    
    for i in my_list:
    
        for k in my_list:  
        
            if str(num) not in k:
                continue
                
            else:
                arr.append(k) 
                
        num += 1
        
        if num == 10:
            break
                          
    return " ".join(arr)