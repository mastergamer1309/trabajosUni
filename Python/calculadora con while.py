print("bienvenido a mi calculadora!!\n\n")
operacion = None
input("presione enter para continuar\n\n")

while operacion != "s":
    operacion = input("que operacion desea realizar? [+]suma [-]resta [*]multip [/]division [s]salir\n\n")
    
    if operacion == "+":
        primer_numero = float(input("digite su primer numero\n\n"))
        segundo_numero = float(input("digite su segundo numero\n\n"))
        print("el resultado de la suma entre {} y {} es {}".format(primer_numero, segundo_numero, primer_numero +
                                                                   segundo_numero))
        otra = input("desea realizar otra operacion[s/n]")
        if otra == "s":
            pass
    elif operacion == "-":
        primer_numero = float(input("digite su primer numero\n\n"))
        segundo_numero = float(input("digite su segundo numero\n\n"))
        print("el resultado de la resta entre {} y {} es {}".format(primer_numero, segundo_numero, primer_numero -
                                                                    segundo_numero))

        otra = input("desea realizar otra operacion[s/n]")
        if otra == "s":
            pass

    elif operacion == "*":
        primer_numero = float(input("digite su primer numero\n\n"))
        segundo_numero = float(input("digite su segundo numero\n\n"))
        print("el resultado de la multiplicacion entre {} y {} es {}".format(primer_numero, segundo_numero,
                                                                             primer_numero * segundo_numero))

        otra = input("desea realizar otra operacion[s/n]")
        if otra == "s":
            pass

    elif operacion == "/":
        primer_numero = float(input("digite su primer numero\n\n"))
        segundo_numero = float(input("digite su segundo numero\n\n"))
        print("el resultado de la division entre {} y {} es {}".format(primer_numero, segundo_numero,
                                                                       primer_numero / segundo_numero))

        otra = input("desea realizar otra operacion[s/n]")
        if otra == "s":
            pass








