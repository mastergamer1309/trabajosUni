suma = 0

numero = int(input("ingrese un numero: "))

if numero > 0:
    for i in range(1, numero):
        if numero %  i == 0:
            suma += i

    if suma == numero:
        print("el numero {} es perfecto".format(numero))

    else:
        print("el numero {} no es perfecto".format(numero))

