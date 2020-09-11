import math

def nearest_sq(sq):
    
    sq_up = sq
    sq_down = sq
    
    while True:

        root_up = math.sqrt(sq_up)
        root_down = math.sqrt(sq_down)

        if str(root_up).split(".")[-1] == '0':
           return (int(root_up) **2)
           break
        
        if str(root_down).split(".")[-1] == '0':
           return (int(root_down) **2)
           break

        else:
          sq_up += 1
          sq_down -= 1