data = [0] * (100000)

i = 0
while i < 20:
    data[i] = int(input("Inputkan data ke-" + str(i+1) + " : "))
    i = i + 1
data[20] = 0
i = 1
penjumlahansekarang = 0
panjangsekarang = 1
panjangterpanjang = 0
indeksterpanjang = 0
indekssekarang = 0
penjumlahanterpangjang = 0
while i <= 20:
    if data[i] >= data[i - 1]:
        penjumlahansekarang = penjumlahansekarang + data[i - 1]
        panjangsekarang = panjangsekarang + 1
        i = i + 1
    else:
        penjumlahansekarang = penjumlahansekarang + data[i - 1]
        if penjumlahansekarang > penjumlahanterpangjang:
            penjumlahanterpangjang = penjumlahansekarang
            panjangterpanjang = panjangsekarang
            indeksterpanjang = indekssekarang
        penjumlahansekarang = 0
        panjangsekarang = 1
        indekssekarang = i
        i = i + 1
for i in range(indeksterpanjang, indeksterpanjang + panjangterpanjang - 1 + 1, 1):
    print(data[i])
print("( " + str(penjumlahanterpangjang) + " )")
