import math

x1 = float(input("inputkan x1 = "))
x2 = float(input("inputkan x2 = "))
y1 = float(input("inputkan y1 = "))
y2 = float(input("inputkan y2 = "))
r1 = float(input("inputkan r1 = "))
r2 = float(input("inputkan r2 = "))

x = x1 - x2
y = y1 - y2
p = math.sqrt(pow(x,2)+pow(y,2))

if(p > r1+r2):
    print("P1")
elif(p == r1 + r2):
    print("P2")
elif(p > r1 - r2):
    print("P3")
elif(p == r2 and r1> r2):
    print("P4")
elif(p < r1 + r2):
    print("P5")

