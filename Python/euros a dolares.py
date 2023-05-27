
dolar_euro = 0.91
libra_euro = 1.18


opcion = input("quieres convertir de dolar a euro o de euro a dolar?\n"
               "A- Convertir de dolar a euro\n"
               "B- Convertir de euro a dolar\n"
               "C- Convertir de libra a euro\n"
               "D- Convertir de euro a libra\n")


cantidad_dinero = "introduzca la cantidad de {} a convertir "

if opcion == "A":
    cantidad_dinero = float(input(cantidad_dinero.format("dolares")))
    print("la cantidad en euros son: {}".format(cantidad_dinero * dolar_euro))

elif opcion == "B":
    cantidad_dinero = float(input(cantidad_dinero.format("euros")))
    print("la cantidad en dolares son: {}".format(cantidad_dinero / dolar_euro))



elif opcion == "C":
    cantidad_dinero = float(input(cantidad_dinero.format("libras")))
    print("la cantidad en euros son: {}".format(cantidad_dinero * libra_euro))


elif opcion == "D":
    cantidad_dinero = float(input(cantidad_dinero.format("euros")))
    print("la cantidad en libras son: {}".format(cantidad_dinero / libra_euro))

else:
    ("no ha elegido ninguna opcion valida")





