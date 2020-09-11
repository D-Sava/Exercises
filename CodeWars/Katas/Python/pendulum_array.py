def pendulum(values):
    
    values.sort()
    main_List = []
    rightside = []
    leftside = []
    
    counter = 0
    
    for i in range(len(values) - 1,-1, -1):
        
        pointer = values[i]
        
        if counter % 2 == 1:
            leftside.append(pointer)
            
        if counter % 2 == 0:
            rightside.append(pointer)
            
        print(rightside)
        print(leftside)
        counter += 1
        
    rightside.sort()
    
    return leftside + rightside
        
values = [3, 5, 2, 1, 9, 12, 15]        
print(pendulum(values))