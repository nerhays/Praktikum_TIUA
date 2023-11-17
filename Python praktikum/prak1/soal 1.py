suhu = str(input("masukan jenis suhu ="))
if (suhu=="c"):
    c = float(input("masukan derajat celcius"))
    r = 4 * c / 5
    f = (9 * c / 5) + 32
    print(c)
    print(r)
    print(f)
elif (suhu=="r"):
    r = float(input("masukan derajat reamur"))
    c = 5 * r / 4
    f = (9 * r / 4) + 32
    print(r)
    print(c)
    print(f)
elif (suhu=="f"):
    f = float(input("masukan derajat fahrenheit"))
    r = 4 * (f - 32) / 9
    c = 5 * (f - 32) / 9
    print(f)
    print(r)
    print(c)
else:
    print("tidak ada type suhu")
