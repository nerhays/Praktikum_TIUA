from array import *

x = array('i', [])
p = 0
ps = 1
It = 0
Is = 0

for i in range(20):
    x.append(int(input("inputkan data x ke-"+ str(i+1)+" ")))

n = 19
for i in range(1, n):    
    if x[i] > x[i-1]:
        ps = ps + 1
    else:
        if ps > p:
            p = ps
            It = Is
        else:
            print("")
        ps = 1
        Is = i
        
k = It+p

for i in range(It, k):
    print(x[i])


print("(" + str(p) + ")")
            
