lista_de_la_compra = []
decision = None

while decision != "q":
    decision = input("que desea comprar? [q] para salir\n\n")
    if decision == "q":
        pass
    elif decision in lista_de_la_compra:
        print("ya has aniadido {} a la lista".format(decision))

    else:
        if input("seguro de que quieres aniadir {}? [s/n]".format(decision)) == "s":
            lista_de_la_compra.append(decision)
            print("{} se ha aniadido a la lista".format(decision))


print("la lista de la compra es: {}".format(lista_de_la_compra))








