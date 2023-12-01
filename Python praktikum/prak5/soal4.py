a = int(input("Inputkan bilangan pertama : "))
b = int(input("Inputkan bilangan kedua : "))

print(a)
print(b)

i = 0
while i<9:
    c =a+b
    print(c)
    a = b
    b = c
    i+=1
