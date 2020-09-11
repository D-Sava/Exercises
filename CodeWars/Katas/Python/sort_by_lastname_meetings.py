s = "Fred:Corwill;Wilfred:Corwill;Barney:Tornbull;Betty:Tornbull;Bjon:Tornbull;Raphael:Corwill;Alfred:Corwill";
b = s.split(";")
c = sorted(sorted(b), key=lambda x: x.split(":")[-1])

formated = []

for i in range(0,len(b)):
    
    person = c[i].upper().split(':') # FirstName , LastName
    formated.append("(" + person[1] + ", " + person[0] + ")") #example: (CORWILL, ALFRED)

result = "".join(formated)
print(result + "\n")
