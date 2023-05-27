
device_type = input("deseas ios o android?\n"
                      "A- IOS\n"
                      "B- ANDROID ")

if device_type == "B":

    Dinero = input("tienes dinero?\n"
               "A- Si, si tengo dinero\n"
               "B- No, vivo en latam :c ")
    if Dinero == "B":

        print("android chino 100$")

        exit()

    elif Dinero == "A":
        Camara = input("te importa la camara del celular?\n"
                       "A- si, me importa\n"
                       "B- No, me vale madres")

        if Camara == "A":
            print("google pixel supercam")

            exit()

        elif Camara == "B":
            print("android calidad-precio")

            exit()

if device_type == "A":

    Dinero = input("tienes dinero?\n"
                   "A- Si, si tengo dinero\n"
                   "B- No, vivo en latam :c ")
    if Dinero == "A":
        print("iphone 14 pro ultra mega power max hiper giga")

        exit()

    elif Dinero == "B":
        print("iphone de segunda mano")

        exit()
else:
    print("elije una respuesta valida")
