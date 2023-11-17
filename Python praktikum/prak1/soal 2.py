x = int(input("masukan angka = "))
a = 1
result = 0
for i in range(5):
    result= ((x/a)%10) + result
    a = a * 10
print(result)
