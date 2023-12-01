i = 0
x = [0] * (5)

while i < 4:
    x[i] = int(input("inputkan data x ke-"+ str(i+1)+": "))
    i+= 1

x[4] = int(input("inputkan data x ke-5 "))

i = 3
newdata = x[4]
while i >= 0 and x[i] > newdata:
    x[i+1] = x[i]
    i -= 1
x[i+1] = newdata

i = 0

while i < len(x):
    print(x[i])
    i+= 1
    
