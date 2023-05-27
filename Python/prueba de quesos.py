titulo = "bienvenido al test sobre el queso"
print("\n" +titulo + "\n" + '-' * len(titulo) + '\n')

puntuacion = 0

opcion = input("""preguntame que  haces cuando ves una tabla de quesos?
                A - salgo corriendo
                B- pruebo uno de los quesos o incluso varios
                C - no puedo evitar devorarla (la tabla verdad...
                D - soy intolerante a la lactosa :c """)

if opcion == "A":
    puntuacion = puntuacion + 0

elif opcion == "B":
    puntuacion = puntuacion + 5

elif opcion == "C":
    puntuacion = puntuacion + 10

elif opcion == "D":
    puntuacion = "I GOTCHU BRO"
else:
    print("las opciones posibles son A, B, C Y D")
    exit()


print("tu puntuacion es: {}".format(puntuacion))

opcion = input("""pregunta 2: como te gusta la hamburguesa?
    A- sin queso
    B- con queso
    C- pan y queso  """)

if opcion == "A":
    puntuacion = puntuacion + 0

elif opcion == "B":
    puntuacion = puntuacion + 5

elif opcion == "C":
    puntuacion = puntuacion + 10

elif opcion == "D":
    puntuacion = "I GOTCHU BRO"
else:
    print("las opciones posibles son A, B, C Y D")
    exit()
print("tu puntuacion es: {}".format(puntuacion))

if puntuacion >= 25:
    print("resultado: eres fanatico de los quesos")
elif puntuacion >= 15:
    print("resultado: te gusta el queso")
else:
    print("no te gusta el queso(o te da diarrea)")
    exit()
