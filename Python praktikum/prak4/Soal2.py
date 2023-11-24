k = 0
l = 0
s = 0
g = 0
o = 0

for i  in range(10):
    bb = float(input("Masukan Berat Bebek ke-" + str(i+1)+ " "))

    if bb > 2 :
        print("Bebek ke-" + str(i+1)+" Obesitas")
        o += 1
    elif bb >= 1.5:
        print("Bebek ke-" + str(i+1)+" Gemuk")
        g += 1
    elif bb >= 1:
        print("Bebek ke-" + str(i+1)+" Standard")
        s += 1
    elif bb >= 0.2:
        print("Bebek ke-" + str(i+1)+" Langsing")
        l += 1
    else:
        print("Bebek ke-" + str(i+1)+" Kurus")
        k += 1


print("Bebek Kurus ada " + str(k) + " ekor")
print("Bebek Langsing ada " + str(l) + " ekor")
print("Bebek Standard ada " + str(s) + " ekor")
print("Bebek Gemuk ada " + str(g) + " ekor")
print("Bebek Obesitas ada " + str(o) + " ekor")
