def setarray(loker):
    i = 0
    while i < 10:
        loker[i][0] = 0
        i +=1

def setpassword(loker):
    i = 0
    while i < 10:
        loker[i][1] = 0
        i += 1

kolom = 10
baris = 3
loker = [[0 for _ in range(kolom)] for _ in range(baris)]

setarray(loker)
setpassword(loker)




