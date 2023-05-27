edad = int(input("digame su edad: "))
tipo_de_carnet = input("digame su tipo de carnet (E para estudiante / P pensionista / F familia numerosa / N Nada ): ")

if (edad < 35 and edad > 25 and tipo_de_carnet == "E") \
        or (edad < 10) \
        or (edad > 65 and tipo_de_carnet == "P")\
        or (tipo_de_carnet == "F"):
    print("se te aplica el descuento")
else:
    print("no se te aplica el descuento")
