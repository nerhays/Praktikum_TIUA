import math

r = int(input("masukkan jari jari alas = "))
r2 = int(input("masukkan jari jari tutup = "))
t = int(input("berapa cm tinggi yang di potong = "))
t2 = 10 - t
v = 0.33 * 3.14 * t2 *(r2 * r + r * r + r2 * r2)
la = 3.14 * r * r
lt = 3.14 * r2 * r2
rk = r * r
t2k = t2 * t2
ls = math.sqrt(rk) + math.sqrt(t2k)
luaspermukaan = ls + la + lt
print("luas permukaan = ",luaspermukaan)
print("volume = ",v)
            
