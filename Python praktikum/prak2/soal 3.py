hb = float(input("berapa harga belinya = "))
ongkir = float(input("berapa persentasenya (angka saja) = "))
untung = float(input("Berapa Keuntungan yang diinginkan = "))

ongkir = hb * ongkir / 100
hj = hb + untung + ongkir
hk = hj - hb
pk = hk / hb
print("Persentase Keuntungan = ", pk)
