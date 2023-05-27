import random

print("Bienvenido a mi primer juego en python!!!")

nombre = input("introduce tu nombre porfavor: ")

print("bienvenido " + nombre +"!!!")

print("acabas de escapar de una prision espacial con tu companero,\n"
      "lograsteis burlar la seguridad y ahora buscais escapar.\n"
      "pero un alien mata a tu companero, por suerte, tu logras pasar desapercibido y sobrevives.")

decision = input("al final de un pasillo hay una puerta abierta y una escotilla por la que puedes saltar\n"
      "que haces?\n"
      "A= saltar por la escotilla \n"
      "B- entrar por la puerta ")

if decision == "B":
    decision = input("pasaste por la puerta y, oh sorpresa!, hay un guardia!, aqui tienes dos opciones: \n"
          "A- Correr\n"
          "B- quedarte dormido")

    if decision == "A":
        print("felicidades!!, has logrado escapar de la mazmorra con vida")

    elif decision == "B":
        print("has muerto")
        exit()


elif decision == "A":


    pregunta = input("has saltado por la escotilla, y te has encontrado con un tunel oscuro, avanzas hasta\n"
          "llegar a un lugar donde se aprecia un poco de luz, y hay un palo, que haces?\n"
          "A- lo recoges\n"
          "B- no lo recoges\n")
    palo = False
    if pregunta == "A":
        print("coges el palo")
        palo = True

    if palo == "B":
        print("no coges el palo")

    numero_random = random.randint(1, 10)
    total = int(input("sigues por el tunel volviendo a estar en una densa oscuridad... hasta que te encuentras una rata gigante\n"
          "entonces la rata dice:\n"
          "para poder pasar, mi acertijo tendras que adivinar, cuanto es 13 por {} ".format(numero_random)))

    if total == 13 * numero_random:
        print("oh!, mi acertijo has acertado, ahora te comere de un bocado")
    else:
      print("mi acertijo no has adivinado, ahora me hare a un lado!!!")

      puerta = input("ahora te encuentras con dos puertas, cual eliges?\n"
            "A- izquierda\n"
            "B- Derecha")
      if puerta == "A" and palo ==  True:
        print("como anteriormente has cogido el palo, te impulsas con el y logras escapar")
      else:
        print("como anteriormente no agarraste el palo entonces no puedes escapar y mueres de inanicion")







