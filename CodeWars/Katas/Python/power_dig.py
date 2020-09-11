def find_sum(list_A):
    
    sum_of_digits = 0
    
    for i in list_A:
        sum_of_digits += int(i)
        
    return sum_of_digits

def check_power(number):
    
    list_of_digits = list(str(number))
    power = len(list_of_digits)
    sum_of_digits = find_sum(list_of_digits)

    equasion = sum_of_digits**power

    if equasion == number:
        return True

    else:
        return False

arr = []
place = 5
number = 10

while len(arr) != place:
    
    if check_power(number) == True:
        print(number)
        arr.append(number)
    
    number += 1

print("\n")
print("Array: \n")
print(arr)
print("\n")

print(str(place) + "th " + "number is: " +str(arr[place-1]))