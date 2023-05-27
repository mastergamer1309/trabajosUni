
arreglo = []
decision = None

while decision != "n":
    decision = input("desea ingresar un numero? [s/n]: ")
    if decision == "s":
        numero = int(input("ingrese un numero"))
        arreglo.append(numero)
    else:
        break




suma = 0

for i in arreglo:
    suma += 1

print("la longitud del arreglo es: {}".format(suma))
