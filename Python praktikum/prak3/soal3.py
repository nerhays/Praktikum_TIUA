a = float(input("Masukkan nilai a: "))
b = float(input("Masukkan nilai b: "))
c = float(input("Masukkan nilai c: "))
d = float(input("Masukkan nilai d: "))
e = float(input("Masukkan nilai e: "))

delta = b**2 - 4*a*c

if delta > 0:
    x1 = (-b + (delta)**0.5) / (2*a)
    x2 = (-b - (delta)**0.5) / (2*a)

    y1 = a*x1**2 + b*x1 + c
    y2 = a*x2**2 + b*x2 + c
    
    print(f"Kedua grafik memotong di dua titik berbeda: ({x1}, {y1}) dan ({x2}, {y2})")

elif delta == 0:
    x = -b / (2*a)
    y = a*x**2 + b*x + c
    
    print(f"Kedua grafik bersinggungan di titik ({x}, {y})")

else:
    print("Kedua grafik saling lepas dan tidak memiliki titik potong.")

x_intersection = (e - c) / (b - d)
y_intersection = a*x_intersection**2 + b*x_intersection + c

print(f"Koordinat titik potong dengan garis: ({x_intersection}, {y_intersection})")
