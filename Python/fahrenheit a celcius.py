chelita = input("dice aquel mae de colita que si le das tu numero [s/n]")
numero = 0
if chelita == "s":
    numero = int(input("dale pue cual es tu numero"))
elif chelita == "n":
    print("nimodo no te lo dio")

print("el numero de la chelita es {}".format(numero))
