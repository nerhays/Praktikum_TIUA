j = int(input("inputkan jam = "))
m = int(input("inputkan menit = "))

if(j <= 6):
    s = abs((11/2 * m)-(30 * j))
else:
    s = 360-abs((11/2 * m)-(30 * j))

print(s," derajat")
