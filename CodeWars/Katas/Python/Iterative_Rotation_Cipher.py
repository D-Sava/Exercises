def step01_removeallspace(orginalString):
  
    tempArr = orginalString.split(" ")
    stepOne_string = "".join(tempArr)
    
    return stepOne_string
    
def step01_saveindex(orginalString):  
    
    indexArr = []
    
    for i in range(0, len(orginalString)):
        if orginalString[i] == " ":
            indexArr.append(i)
    
    return indexArr
    
def step02_shiftbyntimes(stepOne_string, n):

    stepTwo_string = ""
    m = 0
    
    if n < len(stepOne_string):
    
        for i in range(0,len(stepOne_string)):
            
            s = n + i
            
            if s == len(stepOne_string):
                
                while m < n:
                    
                    stepTwo_string += stepOne_string[m]
                    m += 1
                
            
            if len(stepTwo_string) < len(stepOne_string):
                stepTwo_string += stepOne_string[s]
                
    return stepTwo_string
                
def step03_putspaceback(orginalString,stepTwo_string, indexArr):

    stepThree_string = ""
    c = 0
    i = 0
    p = 0
    
    elementsLeft = True
    
    while len(stepThree_string) <= len(orginalString):
        
        if i == indexArr[c] and elementsLeft:
            
            stepThree_string += " "
            c += 1
            
            if c == len(indexArr) -1:
                elementsLeft = False
            
        else:
            add = stepTwo_string[p]
            stepThree_string += add
            p += 1
            
            if p == len(stepTwo_string):
                stepThree_string += " "
                break
            
        i += 1 
    
    return stepThree_string
    
def step04_rotationsagain(stepThree_string, stepOne_string,n):

    stepFour_string = ""
    
    m = 0
                
    if n < len(stepOne_string):
                
        for i in range(0,len(stepOne_string)):
                        
            s = n + i
                        
            if s == len(stepOne_string):
                            
                while m < n:
                                                            
                    stepFour_string += stepOne_string[m]
                    m += 1
                            
                        
            if len(stepFour_string) < len(stepOne_string):
                stepFour_string += stepOne_string[s]
                        
    return stepFour_string
 
def test(indexArr,orginalString, stepOne_string, stepTwo_string, stepThree_string,stepFour_string):

    print("Index Array: " +str(indexArr) + "\n")
    print("Orginal String: " +str(orginalString)+ "\n")
    print("Step One String: " +str(stepOne_string)+ "\n")
    print("Step Two String: " +str(stepTwo_string)+ "\n")   
    print"Step Three String: " +str((stepThree_string)+ "\n")
    
    print("orginalString LEN: " +str(len(orginalString)))
    print("stepOne_string LEN: "+str(len(stepOne_string)))
    print("stepTwo_string LEN: "+str(len(stepTwo_string)))
    print("stepThree_string LEN: "+str(len(stepThree_string)))
    print("stepFour_string LEN: " +str(len(stepFour_string)))

ss = 'If you wish to make an apple pie from scratch, you must first invent the universe.'
n = 10
temp = n

stepOne_string = step01_removeallspace(ss) #return StepOne String
indexArr = step01_saveindex(ss) #return Index Array
stepTwo_string = step02_shiftbyntimes(stepOne_string,n) #return StepTwo String
stepThree_string = step03_putspaceback(ss,stepTwo_string,indexArr) #return StepThree String

while temp != 0:
    for i in range(0,len(indexArr)):
        stepFour_string = step04_rotationsagain(stepThree_string, stepOne_string,n)
        temp -= 1
        print(stepFour_string)
    
    print(stepFour_string)
    
test(indexArr, ss, stepOne_string,stepTwo_string,stepThree_string, stepFour_string) #TEST all functions

