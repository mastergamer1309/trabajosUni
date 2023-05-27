#primer ejercicio

nombre = input("ingrese su nombre:\n\n")

edad = int(input("cual es su edad:\n\n"))

print("su nombre es: {} y su edad es: {}".format(nombre, edad))

#segundo ejercicio

print("bienvenido a mi calculadora!!\n\n")
operacion = None
operacion = input("presione enter para continuar\n\n")

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

    else:
        print("eliga una opcion valida")

print("gracias por usar la calculadora")


#tercer ejercicio

print("bienvenido al calculador de area y perimetro")

altura = float(input("ingrese el valor de la altura"))

base = float(input("ingrese el valor de la base"))

print("la altura es {} y el perimetro es {}".format(base * altura / 2, base + altura * 2))


#ejercicio 4

numero = int(input("ingrese su numero"))

palabra = input("ingrese su palabra")

print(numero * palabra)

#ejercicio 5

ano_de_nacimiento = int(input("ingrese su ano de nacimiento: \n\n"))

edad = (2023 - ano_de_nacimiento)

print("su edad es: {}".format(edad))

#ejercicio 6

numero = int(input("que tabla desea imprimir?"))

for i in range(1,11):
    tabla = numero * i

    print(tabla)

#ejercicio 7

frase = input("ingrese su frase:\n\n")

cuenta = 0

for letras in frase:
    cuenta += 1



print("el numero de letras que hay en la frase son: {}".format(cuenta))


#ejercicio 8

numero_1 = float(input("ingtrese su primer numero decimal:\n\n"))

numero_2 = float(input("ingrese su segundo numero decimal\n\n"))

print("{} elevado a {} es igual a: {}".format(numero_1, numero_2, numero_1 ** numero_2))


#ejercicio 9

palabraa = input("ingrese su palabra")

palabra_invert = "".join(reversed(palabraa))


print(palabra_invert)

#ejercicio 10

pmera_palabra = input("ingrese la primera palabra:\n\n")

segda_palabra = input("ingrese su segunda palaabra:\n\n")

if pmera_palabra == segda_palabra:
    print("las palabaras {} y {} son iguales".format(pmera_palabra, segda_palabra))

else:
    print("las palabras {} y {} son distintas".format(pmera_palabra, segda_palabra))





