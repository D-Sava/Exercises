import string
from string import ascii_lowercase as alphabet_l
from string import ascii_uppercase as alphabet_u

def find_missing_letter(chars):
    
    if chars[0].islower():
    
        start = string.ascii_lowercase.index(chars[0])
        stop = string.ascii_lowercase.index(chars[len(chars)-1])
        a = alphabet_l[start:stop]
        
        for letter in a:
            if letter not in chars:
                return letter 
                
    else:
    
        start = string.ascii_uppercase.index(chars[0])
        stop = string.ascii_uppercase.index(chars[len(chars)-1])
        a = alphabet_u[start:stop]
        
        for letter in a:
            if letter not in chars:
                return letter