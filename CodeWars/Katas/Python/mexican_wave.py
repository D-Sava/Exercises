def wave(givenString):
    
    wholeElement = list(givenString.lower())
    mexicanWaveArr = []
    spaces = []
    
    sufix = ""
    prefix = ""
    temp = ""

    pointer = 0
    el2cap = ""
    
    for i in range(0, len(givenString)):
        if givenString[i] == " ":
            spaces.append(i)
    

    
    while len(mexicanWaveArr) != len(wholeElement) - len(spaces):
        
        lenX = len(mexicanWaveArr) 
        lenY = len(wholeElement)
        lenZ = len(spaces)
        
        print("LEN X: " +str(lenX))
        print("LEN Y: " +str(lenY))
        print("LEN Z: " +str(lenZ) + "\n")
    
        #Take first ellement and make it capital
        el2cap = wholeElement[pointer].upper()
        
        #Take rest of the elements and save them in variables
        for i in range(pointer+1, len(wholeElement)):
            sufix += wholeElement[i]
            
        for i in range(0, pointer):
            prefix += wholeElement[i]
            
        #Add them all together and append to array
        temp = prefix + el2cap + sufix
        temp2 = givenString.lower()
        
        if temp != temp2:
            mexicanWaveArr.append(temp)
            
        
        #Resetting variables to default
        sufix = ""
        prefix = ""
        temp = ""
        el2cap = ""
        
        pointer += 1
    
    return mexicanWaveArr