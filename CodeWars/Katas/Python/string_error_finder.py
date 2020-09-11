errorless="aaabbbbhaijjjm"
errorfull="aaaxbbbbyyhwawiwjjjwwm"

new01 = ""
new02 = ""

#string --> char array
for i in range(0,len(errorfull)):
    new02 += errorfull[i]
    
    if i < len(errorfull)-1:
        new02 += '.'

for i in range(0,len(errorless)):
    new01 += errorless[i]
    
    if i < len(errorless)-1:
        new01 += '.'
    
arrLess = new01.split('.')
arrFull = new02.split('.')

def filterErrors(arrFull):
    
    if(arrFull in arrLess):
        return True
        
    else:
        return False
    

filteredErrors = filter(filterErrors, arrFull)

print("The filtered errors: ")
for error in filteredErrors:
    print(error)
    
errorLen = len(arrFull)
errorSpoted = errorLen - len(filteredErrors) 

string_out = str(errorSpoted) + "/" + str(errorLen)
print(string_out)
