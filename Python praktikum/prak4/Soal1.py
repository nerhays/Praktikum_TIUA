bebek = 0
k = 8

for i in range(k):
    bebek = bebek + int(input("Masukan Berat Bebek ke-"+ str(i+1)+ " "))
                 

rtotal = float(input("Masukan rata rata total 10 Bebek = "))
sbh = int(input("Masukan selisih 2 bebek hilang = "))

jbh = 10 * rtotal - bebek
b9 = (sbh + jbh)/2
b10 = jbh - b9

print("Berat Bebek Ke - 9 = ",b9)
print("Berat Bebek Ke - 10 = ",b10)
