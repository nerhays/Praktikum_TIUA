#from array import *
data = [0, 0, 0, 0, 0, 0, 0, 0]

tanggal = int(input("Masukan Tanggal = "))

if tanggal <= 31:
    data[0] = float(tanggal)//10
    data[1] = tanggal%10
else:
    print("di kalender Hanya ada 31 hari")
    

bulan = str(input("Masukan Bulan = "))

if bulan == "Januari":
        data[2] = 0
        data[3] = 1
elif bulan == "Februari":
        data[2] = 0
        data[3] = 2
elif bulan == "Maret":
        data[2] = 0
        data[3] = 3
elif bulan == "April":
        data[2] = 0
        data[3] = 4
elif bulan == "Mei":
        data[2] = 0
        data[3] = 5
elif bulan == "Juni":
        data[2] = 0
        data[3] = 6
elif bulan == "Juli":
        data[2] = 0
        data[3] = 7
elif bulan == "Agustus":
        data[2] = 0
        data[3] = 8
elif bulan == "September":
        data[2] = 0
        data[3] = 9
elif bulan == "Oktober":
        data[2] = 1
        data[3] = 0
elif bulan == "November":
        data[2] = 1
        data[3] = 1
else:
    data[2] = 1
    data[3] = 2
    
tahun = int(input("Masukan Tahun = "))

for i in range(7, 3, -1):
    data[i] = tahun % 10
    tahun = float(tahun )// 10


j = 7
temp = 0
for i in range(0, 8, 1):
    if data[i] == data[j]:
        temp = temp
    else:
        temp += 1
    j -= 1
    

    

if temp == 0:
    print("Palindrome")
else:
    print("Not Palindrome")

    
