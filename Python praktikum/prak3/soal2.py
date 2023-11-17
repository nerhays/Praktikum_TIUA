tarif = 10000
cuaca = str(input("Saat perjalanan hujan atau terang = ")) 
jarak = int(input("Berapa KM jarak yang ditempuh = "))
waktu = int(input("Berapa Jam Waktu yang ditempuh = "))

if(jarak > 3):
    tarif = int(tarif + ((jarak - 3) * 2000))
else :
    tarif = tarif

if(waktu > 2 * jarak):
    tarif = int(tarif + ((waktu - (2* jarak)) * 1000))
else :
    tarif = tarif

if(cuaca == "hujan"):
    tarif = int(tarif * 115 / 100)
else :
    tarif = tarif

print("Tarif = ", tarif)
    
