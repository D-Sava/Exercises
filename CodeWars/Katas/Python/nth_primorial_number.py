string = "This is very wierd string case."
index = []

for i in range(0,len(string)):
    if string[i] == ' ':
        index.append(i)
        string.replace(' ',"")

