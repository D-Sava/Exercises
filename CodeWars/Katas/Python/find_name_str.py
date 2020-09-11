def name_in_str(givenString,charsToFind):
    
    charsArray = list(charsToFind.lower())
    givenArray = list(givenString.lower())
    isTrue = True
    
    def findChars(givenArray):
        
        if(givenArray in charsArray):
            return True
                
        else:
            return False
                
    foundCharsString = filter(findChars,givenArray)
    foundString = ""
    
    for char in foundCharsString:
        foundString += char
        
    foundString = "".join([j for i,j in enumerate(foundString) if j not in foundString[:i]])
        
    
    if len(foundString) > 0:
            
        for i in range(0, len(foundString)):
            
            if foundString[i] not in charsToFind:
                isTrue = False
        
        if len(foundString) == len(charsToFind):
            isTrue = True
            
        else:
            isTrue = False
    
    else:
        isTrue = False
    
    return "Found: " +foundString+ " \nNeeded: " +charsToFind+ "\nCondition: " +str(isTrue)
    
print(name_in_str("Hq!gR,y,AS;tcW JOXAkRZo;QMV Gdw","Wvw"))