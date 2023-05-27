import random

numero_ganador = random.randint(1, 10)

Numero_del_usuario = (int(input("bienvenido a esta adivinanza, tienes que adivinar un numero entre "
                                "uno y diez: ")))

if Numero_del_usuario == numero_ganador:
    print("has ganado")

if Numero_del_usuario > 10:
    print("elige un numero del uno al diez")

if Numero_del_usuario < 1:
    print("el numero debe de ser mayor a cero")


else:
    print("el numero ganador era {}".format(numero_ganador))
 