def split_and_add(numbers,n):

    list_a = []
    list_b = []
    list_c = []
    
    counter = 0
    
    #Splitting lists if list has odd number of items
    if len(numbers) % 2 == 0:
        
        for i in range(0,len(numbers)/2):
            list_a.append(numbers[i])
            
        for i in range(len(numbers)/2, len(numbers)):
            list_b.append(numbers[i])
            
        print("---------------")        
        print(list_a)
        print(list_b)
        print("---------------")
    
    #Splitting lists if list has even number of items
    else:
        
        for i in range(0, len(numbers)/2):
            list_a.append(numbers[i])
            
        for i in range(len(numbers)/2, len(numbers)):
            list_b.append(numbers[i])
        
        list_a.insert(0,0)#setting both sides equal
        
        print("-----------------------------------------------")        
        print("List A: " +str(list_a))
        print("List B: " +str(list_b))
        print("-----------------------------------------------")
            
    #Merging lists(adding a and b to c) if first is shorter then second list
    if len(list_a) == len(list_b):
        
        m = len(list_a)
        
        for i in range(m, 0, -1):
            list_c.append(list_a[counter] + list_b[counter])
            counter += 1
            
        counter = 0
        
        
    #Returning the items of list_c which is sum of list_a & list_b
    
    print("<END MARK>")
    print("-----------------------------------------------")
    print("N is equal: " +str(n))
    print("List C: " +str(list_c))
    print("-----------------------------------------------")
    print("___LOOP END___")
    
    n -= 1
    
    if n > 0 or len(list_c) != 1:
        split_and_add(list_c, n)
        

        
n = 4
arr = [10,20,30,40,50,60,70,80,90,100,110,120,130,140,150,160,170,180,190]
split_and_add(arr,n)