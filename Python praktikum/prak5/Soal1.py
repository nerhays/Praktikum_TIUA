i = 0
j = 0
temp = 0
x = [0] * (5)
y = [0] * (5)
z = [0] * (10)

while i < len(x):
    x[i] = int(input("inputkan data x ke-"+ str(i+1)+": "))
    i+= 1

i = 0
while i < len(y):
    y[i] = int(input("inputkan data y ke-"+ str(i+1)+": "))
    i+= 1

i = 0
while i < len(x):
    z[i] = x[i]
    i+= 1

while i < len(z):
    z[i] = y[j]
    i+= 1
    j+=1

i = 0

while i < 10:
    j = 0
    while j < 9:
        if z[j] > z[j+1]:
            temp = z[j]
            z[j] = z[j+1]
            z[j+1] = temp
        j+=1
    i+= 1
    
i = 0

while i < 10:
    print(z[i], ", ")
    i+= 1
    

    
