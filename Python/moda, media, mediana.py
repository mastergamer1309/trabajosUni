arreglo = []

for i in range(10):
    numero = int(input("ingrese un numero"))
    arreglo.append(numero)

# primero calculemos lo mas facil que es la media
c = 0
sumamedia = 0
for i in arreglo:
    sumamedia += i
    c += 1

sumamedia = sumamedia / c

print("la media es : ", sumamedia)


# ahora vamos a calcular la mediana
largo = 0

for i in arreglo:
    largo += 1

if largo % 2 == 0:
    posicionmedia = largo / 2
    posicionmedia1 = largo + 1 / 2
    mediana = (arreglo[])

