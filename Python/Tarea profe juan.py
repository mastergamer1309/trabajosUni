import random
# Realizar un programa que solicite al usuario su edad y determine si es mayor o menor de edad.

# No hay switch en python asi que voy a estar practicando con el try

try:
    edad = int(input("cual es su edad?"))
    if edad >= 18:
        print("usted es mayor de edad")

    elif edad < 18:
        print("usted es menor de edad")

except:
    print("digite un numero valido")

# Escribir un programa que pida al usuario un número y determine si es positivo, negativo o cero.

try:
    numero = float(input("digite un numero: "))

    if numero > 0:
        print("su numero {} es positivo".format(numero))
    elif numero < 0:
        print("su numero {} es negativo".format(numero))
    elif numero == 0:
        print("su numero es 0".format(numero))
except:
    print("elija un numero valido")

# Realizar un programa que pida al usuario dos números y determine cuál es el mayor.
try:
    numero1 = int(input("digite su primer numero"))
    numero2 = int(input("digite su segundo numero"))
    if numero1 > numero2:
        print("su numero {} es mayor que {}".format(numero1, numero2))

    elif numero2 > numero1:
        print("su numero {} es mayor que {}".format(numero2, numero1))

except:
    print("elija un numero valido")

# Escribir un programa que solicite al usuario una letra y determine si es una vocal o una consonante.


letra = input("cual es su letra???: ")

if letra == ("a", "e", "i", "o", "u", "A", "E", "I", "O", "U"):
    print("su letra {} es una vocal".format(letra))

else:
    print("su letra {} es una consonante".format(letra))

# Realizar un programa que pida al usuario tres números y determine cuál es el menor.

numero1 = int(input("escriba el primer numero"))
numero2 = int(input("escriba el segundo numero"))
numero3 = int(input("escriba el tercer numero"))

if numero1 > numero2 and numero1 > numero3:
    print("el numero 1 es mayor")

elif numero2 > numero1 and numero2 > numero3:
    print("numero 2 es mayor")

elif numero3 > numero1 and numero3 > numero2:
    print("numero 3 es mayor")

else:
    print("los numero son iguales")

# Escribir un programa que solicite al usuario una calificación y determine si es aprobatoria (mayor o igual a 60) o
# reprobatoria (menor a 60).

try:
    calificacion = float(input("digite su calificacion: "))
    if calificacion >= 60:
        print("usted aprobo con {} de nota".format(calificacion))

    elif calificacion < 60:
        print("usted no ha aprobado con {} de nota".format(calificacion))

except:
    print("digite su calificacion correctamente")


# Realizar un programa que pida al usuario dos números y determine si son iguales o distintos.

try:
    numero1 = int(input("digite su primer numero: "))
    numero2 = int(input("digite su segundo numero: "))
    if numero1 == numero2:
        print("los numeros son iguales")

    else:
        print("los numeros son diferentes")

except:
    print("elija un numero valido")

# Escribir un programa que solicite al usuario un número y determine si es par o impar.

numero = int(input("ingrese su numero: "))
if numero %2 == 0:
    print("su numero es par")

else:
    print("su numero es impar")


# Realizar un programa que pida al usuario un año y determine si es bisiesto o no.

anio = int(input("ingrese su anio: "))
if anio % 4 == 0:
    print("su anio es bisiesto")
else:
    print("su anio no es bisiesto")

# Escribir un programa que solicite al usuario un número del 1 al 7 y determine
# a qué día de la semana corresponde (1=lunes, 2=martes, etc.).

# LO HICE CON TRY PORQUE NO ENCONTRE SWITCH EN PYTHON

try:
    numero = int(input("ingrese un numero del uno al siete: "))
    if numero == 1:
        print("el dia {} es lunes".format(numero))
    elif numero == 2:
        print("el dia {} es martes".format(numero))
    elif numero == 3:
        print("el dia {} es miercoles".format(numero))
    elif numero == 4:
        print("el dia {} es jueves".format(numero))
    elif numero == 5:
        print("el dia {} es viernes".format(numero))
    elif numero == 6:
        print("el dia {} es sabado".format(numero))
    elif numero == 7:
        print("el dia {} es domingo".format(numero))
except:
    print("digite un numero entre el 1 y el 7")

# Realizar un programa que pida al usuario un número del 1 al 12 y determine el mes correspondiente.

try:
    numero = int(input("ingrese un numero del uno al doce: "))
    if numero == 1:
        print("el mes {} es enero".format(numero))
    elif numero == 2:
        print("el mes {} es febrero".format(numero))
    elif numero == 3:
        print("el mes {} es marzo".format(numero))
    elif numero == 4:
        print("el mes {} es abril".format(numero))
    elif numero == 5:
        print("el mes {} es mayo".format(numero))
    elif numero == 6:
        print("el mes {} es junio".format(numero))
    elif numero == 7:
        print("el mes {} es julio".format(numero))
    elif numero == 8:
        print("el mes {} es agosto".format(numero))
    elif numero == 9:
        print("el mes {} es septiembre".format(numero))
    elif numero == 10:
        print("el mes {} es octubre".format(numero))
    elif numero == 11:
        print("el mes {} es noviembre".format(numero))
    elif numero == 12:
        print("el mes {} es diciembre".format(numero))

except:
    print("digite un numero entre el 1 y el 12")

# para optimizar el codigo podemos usar una lista y asi no hay que hacer tantos if

mes = ["Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre",
       "Diciembre"]

decision = int(input("digite un numero del 1 al 12"))
try:
    print("el numero {} es el mes {}".format(decision, mes[decision-1]))
except:
    print("ingrese un numero del 1 al 12")

# Realizar un programa que pida al usuario un número y calcule su factorial utilizando un ciclo for.

decision = int(input("digite un numero: "))

factorial = 1

for i in range(1, decision+1):
    factorial *=i

print("el factorial de {} es {}".format(decision, factorial))

# aqui lo que hacemos es pedirle un numero al usuario y multimplicarlo por el rango del 1 hasta el numero orientado del
# usuario mas 1 ya que en "range" se toma un numero menos del ultimo digito que declaramos, por ejemplo si ponemos
# range(1,11)solo conseguiremos que el programa entienda del 1 al 10, luego solo multiplicamos la variable factorial
# y la multiplicamos por el numero que nos proporciono el usuario

# Escribir un programa que muestre por pantalla todos los números del 1 al 100 que sean divisibles por 3.

for i in range(1, 101):
    if i % 3 == 0:
        print(i)

# del 1 al 100 el programa va a agarrar los numeros que sean divisibles entre 3 y los va a imprimir, en este caso la
# variable i.

#

numero = int(input("ingrese un numero"))

primo = True
for i in range(2, numero):
    if numero % i == 0:
        primo = False
        pass

if primo and numero > 1:
    print("{} es un numero primo".format(numero))
else:
    print("{} no es un numero primo".format(numero))


# hace un  arreglo que pida la edad a todos los 40 estudiantes del grupo 1t1

edades = []
for i in range(40):
    edad = int(input("ingrese su edad"))
    edades.append(edad)
    print(edades)

print(edades)

# 1. Escribir un programa cree un array unidimensional de 5 elementos. Luego, el programa deberá pedir al usuario que
# ingrese un valor para cada uno de los elementos del array y mostrar el array resultante.

lista = []
for i in range(5):
    nose = int(input("ingrese un valor: "))
    lista.append(nose)


print("su lista es: {}".format(lista))

# 2. Escribir un programa que genere un array unidimensional con 10 elementos. Luego, el programa deberá pedir al
# usuario que rellene ese array y luego mostrar los elementos del array que son pares.

lesta = []

for i in range(10):
    numero = int(input("ingrese un valor"))
    lesta.append(numero)

for i in lesta:
    if lesta[i] % 2 == 0:
        print("es par")

    else:
        print("es impar")

# 3. Escribir un programa que solicite al usuario 10 números, y que al final determine cuál es el número mayor y cuál
# es el número menor.

negro = [4, 2, 3, 4, 5, 70, 1, 8, 9, 10]
mayor = 0
menor = negro[0]

for i in range(10):
    if negro[i] > mayor:
        mayor = negro[i]

for i in range(10):
    if negro[i] <= menor:
        menor = negro[i]

print(f"el numero {mayor} es el mayor")
print(f"el numero {menor} es el menor")

print("el numero mayor es {} y el numero menor es {}".format(mayor, menor))

# 4. Escribir un programa que genere dos arrays unidimensionales con 10 elementos cada uno, inicializados con números
# aleatorios entre 1 y 100. Luego, el programa deberá sumar los elementos de cada array y generar un tercer array con la suma de los elementos correspondientes de ambos arrays. Finalmente, el programa deberá mostrar el tercer array resultante.

listauno = []
listados = []
listatres = []

for i in range(10):
    ele = random.randint(1, 100)
    listauno.append(ele)
    print(ele)

for i in range(10):
    ala = random.randint(1, 100)
    listados.append(ala)
    print(ala)
for i in range(len(listauno)):
    suma = listauno[i] + listados[i]
    listatres.append(suma)

print(listatres)

# 5. Escribir un programa que solicite 15 datos numéricos al usuario, luego, debe realizar el cálculo de media y mediana.

listaa = []

for i in range(15):
    numeros = int(input("ingrese un numero"))
    listaa.append(numeros)

suma = 0

for i in listaa:
    suma += i

media = (suma / 15)


print("la media es: {} y la mediana es {}".format(media, ((listaa[7] + listaa[8]) / 2)))


# 6. Escribir un programa que contenga un array de 20 elementos, que tenga un menú con 3 opciones: Una opción para salir,
# otra opción para llenar el Arreglo, y una más para buscar un elemento en el arreglo, en la opción de buscar elemento
# en el arreglo, el programa deberá ser capaz de decir si el valor buscado existe al menos una vez o no dentro de la
# colección.

arreglo = []

while True:
    user = input("desea aniadir un elemento?[s/n] o desea buscar un elemento?[b]: ")
    if user == "s":
        for i in range(20):
            elemento = int(input("ingrese el elemento a aniadir: "))

            arreglo.append(elemento)
            print("la lista es: {}".format(arreglo))
    elif user == "n":
        print("gracias por usar el algoritmo, Dios como me gusta programar")
        break

    elif user == "b":
        elementto = int(input("que numero de elemento  desea verificar?"))
        if elementto > len(arreglo):
            print("el elementoque desa buscar esta fuera dell rango de la lista")
        elif arreglo[elementto] == 0:
            print("el elemento no esta declarado")
            break

        else:
            print("el elemento: {} es {} ".format(elementto, arreglo[elementto]))

    else:
        print("digite una opcion valida")




