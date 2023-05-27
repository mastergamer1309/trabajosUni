from random import randint
import os


VIDA_INICIAL_PIKACHU = 80
VIDA_INICIAL_SQUIRTLE = 90
vida_pikachu = VIDA_INICIAL_PIKACHU
vida_squirtle = VIDA_INICIAL_SQUIRTLE

TAMANIO_BARRA_VIDA = 20

while vida_pikachu > 0 and vida_squirtle > 0:
    print("turno de pikachu")
    ataque_pikachu = randint(1, 2)
    if ataque_pikachu == 1:
        print("Pikachu ataca con bola voltio")
        vida_squirtle -= 10

    else:
        print("pikachu ataca con onda trueno")
        vida_squirtle -= 11

    if vida_squirtle < 0:
        vida_squirtle = 0

    if vida_pikachu < 0:
        vida_pikachu = 0

    barras_de_vida_pikachu = int(vida_pikachu * TAMANIO_BARRA_VIDA / VIDA_INICIAL_PIKACHU)
    print("pikachu:    [{}{}] ({}/{})".format("*" * barras_de_vida_pikachu, " " * (TAMANIO_BARRA_VIDA - barras_de_vida_pikachu),
                                              vida_pikachu, VIDA_INICIAL_PIKACHU))

    barras_de_vida_squirtle = int(vida_squirtle * TAMANIO_BARRA_VIDA / VIDA_INICIAL_SQUIRTLE)
    print("squirtle:    [{}{}] ({}/{})".format("*" * barras_de_vida_squirtle, " " * (TAMANIO_BARRA_VIDA - barras_de_vida_squirtle),
                                               vida_squirtle, VIDA_INICIAL_SQUIRTLE))

    input("enter para continuar...\n\n")
    os.system("cls")

    print("turno squirtle")

    ataque_squirtle = None
    while ataque_squirtle != "p" and ataque_squirtle != "a" and ataque_squirtle != "b":
        ataque_squirtle = input("que ataque deseas realizar? [p]lacaje, pistola de [a]gua, [b]urbuja, [n]ada: ")

        if ataque_squirtle == "p":
            print("squirtle ataca con placaje")
            vida_pikachu -= 10
        elif ataque_squirtle == "a":
            print("squirtle ataca con pistola agua")
            vida_pikachu -= 12
        elif ataque_squirtle == "b":
            print("squirtle ataca con burbuja")
            vida_pikachu -= 9
        elif ataque_squirtle == "n":
            print("no has atacado esta ronda")

        if vida_squirtle < 0:
            vida_squirtle = 0

        if vida_pikachu < 0:
            vida_pikachu = 0

    barras_de_vida_pikachu = int(vida_pikachu * TAMANIO_BARRA_VIDA / VIDA_INICIAL_PIKACHU)
    print("pikachu:    [{}{}] ({}/{})".format("*" * barras_de_vida_pikachu, " " * (TAMANIO_BARRA_VIDA - barras_de_vida_pikachu),
                                              vida_pikachu, VIDA_INICIAL_PIKACHU))

    barras_de_vida_squirtle = int(vida_squirtle * TAMANIO_BARRA_VIDA / VIDA_INICIAL_SQUIRTLE)
    print("squirtle:    [{}{}] ({}/{})".format("*" * barras_de_vida_squirtle, " " * (TAMANIO_BARRA_VIDA - barras_de_vida_squirtle),
                                               vida_squirtle, VIDA_INICIAL_SQUIRTLE))

    input("enter para continuar...\n\n")
    os.system("cls")

if vida_pikachu > vida_squirtle:
    print("pikachu gana!")

else:
    print("squirtle gana!")
