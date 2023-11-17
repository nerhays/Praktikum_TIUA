s = 100
v = 50
istirahat = 45
jam = int(input("masukkan jam berangkat = "))
menit = int(input("masukkan menit berangkat = "))
waktu = s/v
m = (menit + istirahat) / 60
t2j = int(jam + waktu + m)
t2m = (menit + istirahat) % 60
print("Sampai di Tujuan = ", t2j, ".", t2m)
