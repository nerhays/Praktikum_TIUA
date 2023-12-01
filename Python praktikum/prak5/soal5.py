y = [False] * (1000)
i = 1
bil = int(input("Inputkan bilangan positif : "))

while i < 999:
    y[i] = False
    i+=1
j = 0
x = 1

while j<= bil:
    j += x
    x+=1
    y[j] = True

i = 1
while i <= bil:
    if y[i]:
        print("Angka " + str(i) + " Merupakan Angka Segitiga")
    else:
        print("Angka " + str(i) + " Bukan Merupakan Angka Segitiga")
    i+=1    

    
