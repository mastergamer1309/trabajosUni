arreglo1 = []
arreglo2 = []
arreglo3 = []

while True:
    decision = int(input("anadir numero a lista1 o a lista2? [1/2], mostrar las listas[3] o  salir[4]"))
    if decision == 1:
        anadir = int(input("ingrese un numero"))
        arreglo1.append(anadir)
        print("{} se ha anadido a tu lista1".format(anadir))
    elif decision == 2:
        aniadir = int(input("ingrese su numero"))
        arreglo2.append(aniadir)
        print("{} se ha anadido a lista2".format(aniadir))
    elif decision == 3:
        print("la lista 1 es: {}".format(arreglo1))
        print("la lista 2 es: {}".format(arreglo2))
        for i in range(len(arreglo1)):
            arreglo3.append(arreglo1[i])
            arreglo3.append(arreglo2[i])

        print("la  lista 3 es: {}".format(arreglo3))

    elif decision == 4:
        print("gracias por  usar el programa")
    else:
        print("ingrese una opcion valida")
